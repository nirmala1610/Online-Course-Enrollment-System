package com.kce.courseenrollment.service;

import java.util.ArrayList;
import java.util.List;
import com.kce.courseenrollment.model.Payment;
import com.kce.courseenrollment.model.Receipt;
import com.kce.courseenrollment.model.Student;
import com.kce.courseenrollment.model.Course;

public class PaymentService {
    private List<Payment> payments = new ArrayList<>();
    private List<Receipt> receipts = new ArrayList<>();

    public Payment makePayment(String paymentId, double amount, String method) {
        Payment payment = new Payment(paymentId, amount, method);
        payment.setSuccess(true); 
        payments.add(payment);
        return payment;
    }

    public Receipt generateReceipt(String receiptId, Student student, Course course, double amountPaid) {
        Receipt receipt = new Receipt(receiptId, student, course, amountPaid);
        receipts.add(receipt);
        return receipt;
    }

    public List<Receipt> getAllReceipts() {
        return receipts;
    }
}
