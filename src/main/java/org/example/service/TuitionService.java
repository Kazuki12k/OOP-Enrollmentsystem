package org.example.service;

public interface TuitionService {
    public double calculateTuitionFee(double units, double discountrate);
    public void makePayment(double amount);
    public double getBalance();
    public boolean isFullyPaid();
}
