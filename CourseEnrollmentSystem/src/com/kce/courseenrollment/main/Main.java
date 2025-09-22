package com.kce.courseenrollment.main;

import java.util.Scanner;
import com.kce.courseenrollment.model.*;
import com.kce.courseenrollment.service.*;
import com.kce.courseenrollment.exception.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CourseService courseService = new CourseService();
        StudentService studentService = new StudentService();
        EnrollmentService enrollmentService = new EnrollmentService();
        PaymentService paymentService = new PaymentService();

        while (true) {
            System.out.println("\n===== Online Course Enrollment System =====");
            System.out.println("1. Add Course");
            System.out.println("2. Add Student");
            System.out.println("3. Enroll in Course");
            System.out.println("4. Make Payment");
            System.out.println("5. Display Courses");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            try {
                switch (choice) {
                    case 1: 
                        System.out.print("Enter Course ID: ");
                        String courseId = sc.nextLine();
                        System.out.print("Enter Course Name: ");
                        String courseName = sc.nextLine();
                        System.out.print("Enter Capacity: ");
                        int capacity = sc.nextInt();
                        System.out.print("Enter Fee: ");
                        double fee = sc.nextDouble();
                        sc.nextLine();

                        Course course = new Course(courseId, courseName, capacity, fee);
                        courseService.addCourse(course);
                        System.out.println("✅ Course added successfully!");
                        break;

                    case 2: 
                        System.out.print("Enter Student ID: ");
                        String studentId = sc.nextLine();
                        System.out.print("Enter Student Name: ");
                        String name = sc.nextLine();
                        System.out.print("Enter Email: ");
                        String email = sc.nextLine();
                        System.out.print("Is Premium Student? (yes/no): ");
                        String type = sc.nextLine();

                        Student student;
                        if (type.equalsIgnoreCase("yes")) {
                            System.out.print("Enter Discount %: ");
                            double discount = sc.nextDouble();
                            sc.nextLine();
                            student = new PremiumStudent(studentId, name, email, discount);
                        } else {
                            student = new Student(studentId, name, email);
                        }

                        studentService.addStudent(student);
                        System.out.println("✅ Student added successfully!");
                        break;

                    case 3:
                        System.out.print("Enter Enrollment ID: ");
                        String enrollId = sc.nextLine();
                        System.out.print("Enter Student ID: ");
                        String sid = sc.nextLine();
                        System.out.print("Enter Course ID: ");
                        String cid = sc.nextLine();

                        Student foundStudent = studentService.findStudentById(sid);
                        Course foundCourse = courseService.findCourseById(cid);

                        if (foundStudent == null || foundCourse == null) {
                            throw new InvalidEnrollmentException("Invalid Student ID or Course ID!");
                        }

                        if (foundCourse.getCapacity() <= 0) {
                            throw new InvalidEnrollmentException("Course is already full!");
                        }

                        Enrollment enrollment = enrollmentService.enrollStudent(enrollId, foundStudent, foundCourse);
                        System.out.println("✅ Enrollment successful! Please proceed to payment.");
                        break;

                    case 4: 
                        System.out.print("Enter Payment ID: ");
                        String payId = sc.nextLine();
                        System.out.print("Enter Student ID: ");
                        String psid = sc.nextLine();
                        System.out.print("Enter Course ID: ");
                        String pcid = sc.nextLine();

                        Student payStudent = studentService.findStudentById(psid);
                        Course payCourse = courseService.findCourseById(pcid);

                        if (payStudent == null || payCourse == null) {
                            throw new InvalidEnrollmentException("Invalid Student ID or Course ID!");
                        }

                        double finalFee = payCourse.getFee();
                        if (payStudent instanceof PremiumStudent) {
                            double discount = ((PremiumStudent) payStudent).getDiscountPercentage();
                            finalFee = finalFee - (finalFee * discount / 100);
                            System.out.println("💎 Premium Discount Applied! New Fee: " + finalFee);
                        }

                        System.out.print("Enter Payment Method: ");
                        String method = sc.nextLine();

                        Payment payment = paymentService.makePayment(payId, finalFee, method);
                        if (payment.isSuccess()) {
                            Receipt receipt = paymentService.generateReceipt(
                                    "R" + payId,
                                    payStudent,
                                    payCourse,
                                    finalFee
                            );
                            System.out.println("✅ Payment Successful!");
                            System.out.println("===== Receipt =====");
                            System.out.println("Receipt ID: " + receipt.getReceiptId());
                            System.out.println("Student: " + receipt.getStudent().getName());
                            System.out.println("Course: " + receipt.getCourse().getCourseName());
                            System.out.println("Amount Paid: " + receipt.getAmountPaid());
                        } else {
                            throw new InvalidEnrollmentException("Payment Failed!");
                        }
                        break;

                    case 5: 
                        System.out.println("===== Available Courses =====");
                        for (Course c : courseService.getAllCourses()) {
                            System.out.println(c.getCourseId() + " | " +
                                    c.getCourseName() + " | Capacity: " +
                                    c.getCapacity() + " | Fee: " + c.getFee());
                        }
                        break;

                    case 6: 
                        System.out.println("👋 Exiting... Thank you!");
                        sc.close();
                        System.exit(0);

                    default:
                        System.out.println("❌ Invalid choice!");
                }
            } catch (InvalidEnrollmentException e) {
                System.out.println("⚠️ Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("⚠️ Unexpected Error: " + e.getMessage());
            }
        }
    }
}
