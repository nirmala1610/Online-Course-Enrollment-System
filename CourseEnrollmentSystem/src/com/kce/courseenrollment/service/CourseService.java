package com.kce.courseenrollment.service;

import java.util.ArrayList;
import java.util.List;
import com.kce.courseenrollment.model.Course;

public class CourseService {
    private List<Course> courses = new ArrayList<>();

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    public Course findCourseById(String courseId) {
        for (Course c : courses) {
            if (c.getCourseId().equals(courseId)) {
                return c;
            }
        }
        return null;
    }
}
