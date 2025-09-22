package com.kce.courseenrollment.model;

public class Payment {

	private String paymentId;
    private double amount;
    private String method; 
    private boolean success;

    public Payment(String paymentId, double amount, String method) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.method = method;
        this.success = false;
    }

    public String getPaymentId() {
        return paymentId;
    }
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public String getMethod() {
        return method;
    }
    public void setMethod(String method) {
        this.method = method;
    }
    public boolean isSuccess() {
        return success;
    }
    public void setSuccess(boolean success) {
        this.success = success;
    }
}
