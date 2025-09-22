# Online Course Enrollment System 🎓

## Problem Statement
Design and implement a **Java console application** for a Course Enrollment System that handles:
- Courses  
- Instructors  
- Students (Normal & Premium)  
- Enrollments  
- Payments  
- Receipts  

### Business Rules
1. Students can only enroll in available courses.  
2. Premium students may get fee discounts or access to extra materials.  
3. Payment must be completed for enrollment confirmation.  
4. Enrollment should update course capacity.  
5. Each receipt must link to a student and a course.  

### Console Interface Features
- Add Course  
- Add Student  
- Enroll in Course  
- Make Payment  
- Display Courses  
- Exit  

---

## Project Structure
com.kce.courseenrollment.model # Contains Course, Student, PremiumStudent, Instructor, Enrollment, Payment, Receipt
com.kce.courseenrollment.service # Business logic classes (CourseService, StudentService, EnrollmentService, PaymentService)
com.kce.courseenrollment.exception # Custom exception (InvalidEnrollmentException)
com.kce.courseenrollment.main # Entry point (CourseEnrollmentSystem.java)



---

## How to Compile & Run

### 1. Clone the Repository
```bash
git clone https://github.com/your-username/course-enrollment-system.git
cd course-enrollment-system
2. Open in Eclipse
Open Eclipse IDE

Go to File > Import > Existing Projects into Workspace

Select the cloned project folder

Finish

3. Run
Navigate to com.kce.courseenrollment.main.CourseEnrollmentSystem

Right-click → Run As > Java Application

Sample Output Screenshots
Main Menu
markdown
Copy code
===== Online Course Enrollment System =====
1. Add Course
2. Add Student
3. Enroll in Course
4. Make Payment
5. Display Courses
6. Exit
Enter choice:
Successful Enrollment
css
Copy code
✅ Enrollment successful! Please proceed to payment.
Premium Discount Example
yaml
Copy code
💎 Premium Discount Applied! New Fee: 4000.0
✅ Payment Successful!
===== Receipt =====
Receipt ID: R101
Student: John
Course: Java Basics
Amount Paid: 4000.0
Student Details
Name: [Your Name]
Roll No.: [Your Roll Number]
