package org.example.service;

public class TuitionFeePayment {

    private final double PRICE_PER_UNIT = 2000;
    private double balance = 0;
    private double tuitionFee = 0;

    public double calculateTuitionFee(double units, double discountrate) {
        tuitionFee = units * PRICE_PER_UNIT;

        if(discountrate != 0){
            tuitionFee = tuitionFee - (tuitionFee * discountrate);
            return tuitionFee;
        }
        else {
            return tuitionFee;
        }
    }
    public void makePayment(double amount){
        balance = tuitionFee - amount;
    }

    public double getBalance() {
        return balance;
    }

    public boolean isFullyPaid() {
        return balance > 0 ? false : true;
    }
}
