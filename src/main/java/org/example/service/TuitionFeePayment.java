package org.example.service;

public class TuitionFeePayment {

    private final double PRICE_PER_UNIT = 2000;
    private double balance = 0;
    private double tuitionFee = 0;

    public double calculateTuitionFee(double units, double discountrate) {
        double totalTuitionFee = units * PRICE_PER_UNIT;

        if(discountrate != 0){
            totalTuitionFee = totalTuitionFee - (totalTuitionFee * discountrate);
        }
        else {

        }
        return totalTuitionFee;
    }
}
