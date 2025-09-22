package com.kce.courseenrollment.model;

public class Receipt {
	private String receiptId;
    private Student student;
    private Course course;
    private double amountPaid;

    public Receipt(String receiptId, Student student, Course course, double amountPaid) {
        this.receiptId = receiptId;
        this.student = student;
        this.course = course;
        this.amountPaid = amountPaid;
    }

    public String getReceiptId() {
        return receiptId;
    }
    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
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
    public double getAmountPaid() {
        return amountPaid;
    }
    public void setAmountPaid(double amountPaid) {
        this.amountPaid = amountPaid;
    }
}
