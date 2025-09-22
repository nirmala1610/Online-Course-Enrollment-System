package com.kce.courseenrollment.model;

public class Enrollment {
	private String enrollmentId;
    private Student student;
    private Course course;
    private boolean isConfirmed;

    public Enrollment(String enrollmentId, Student student, Course course) {
        this.enrollmentId = enrollmentId;
        this.student = student;
        this.course = course;
        this.isConfirmed = false;
    }

    public String getEnrollmentId() {
        return enrollmentId;
    }
    public void setEnrollmentId(String enrollmentId) {
        this.enrollmentId = enrollmentId;
    }
    public Student getStudent() {
        return student;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public Course getCourse() {
        return course;
    }
    public void setCourse(Course course) {
        this.course = course;
    }
    public boolean isConfirmed() {
        return isConfirmed;
    }
    public void setConfirmed(boolean confirmed) {
        isConfirmed = confirmed;
    }

}
