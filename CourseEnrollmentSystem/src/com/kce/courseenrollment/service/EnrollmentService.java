package com.kce.courseenrollment.service;

import java.util.ArrayList;
import java.util.List;
import com.kce.courseenrollment.model.Enrollment;
import com.kce.courseenrollment.model.Student;
import com.kce.courseenrollment.model.Course;

public class EnrollmentService {
    private List<Enrollment> enrollments = new ArrayList<>();

    public Enrollment enrollStudent(String enrollmentId, Student student, Course course) {
        if (course.getCapacity() > 0) {
            Enrollment enrollment = new Enrollment(enrollmentId, student, course);
            enrollments.add(enrollment);
            course.setCapacity(course.getCapacity() - 1); 
            return enrollment;
        } else {
            return null;
        }
    }

    public List<Enrollment> getAllEnrollments() {
        return enrollments;
    }
}
