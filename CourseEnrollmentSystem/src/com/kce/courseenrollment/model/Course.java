package com.kce.courseenrollment.model;

public class Course {
	    private String courseId;
	    private String courseName;
	    private int capacity;
	    private double fee;

	    public Course(String courseId, String courseName, int capacity, double fee) {
	        this.courseId = courseId;
	        this.courseName = courseName;
	        this.capacity = capacity;
	        this.fee = fee;
	    }
	    public String getCourseId() {
	        return courseId;
	    }
	    public void setCourseId(String courseId) {
	        this.courseId = courseId;
	    }
	    public String getCourseName() {
	        return courseName;
	    }
	    public void setCourseName(String courseName) {
	        this.courseName = courseName;
	    }
	    public int getCapacity() {
	        return capacity;
	    }
	    public void setCapacity(int capacity) {
	        this.capacity = capacity;
	    }
	    public double getFee() {
	        return fee;
	    }
	    public void setFee(double fee) {
	        this.fee = fee;
	    }
}
