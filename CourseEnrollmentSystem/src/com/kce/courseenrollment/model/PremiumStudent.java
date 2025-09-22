package com.kce.courseenrollment.model;

public class PremiumStudent extends Student {
    private double discountPercentage;

    public PremiumStudent(String studentId, String name, String email, double discountPercentage) {
        super(studentId, name, email);
        this.discountPercentage = discountPercentage;
    }

    public double getDiscountPercentage() {
        return discountPercentage;
    }
    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

}
