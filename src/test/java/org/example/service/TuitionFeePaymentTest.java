package org.example.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TuitionFeePaymentTest {
    //arrange
    TuitionFeePayment tuitionFeePayment;

    @BeforeEach
    void setup() {
        tuitionFeePayment = new TuitionFeePayment();
    }

    @Test
    @DisplayName("Calculate Tuition Fee With No Discount")
    void shouldCalculateTuitionFeeWithNoDiscount(){
        //act
        //tuitionFeePayment.calculateTuitionFee(26, 0);
        //assert
        assertEquals(52000, tuitionFeePayment.calculateTuitionFee(26, 0));
    }

    @Test
    @DisplayName("Calculate Tuition Fee With Discount")
    void shouldCalculateTuitionFeeWithDiscount() {
        //act
//        tuitionFeePayment.calculateTuitionFee(26, 0.05);
        //assert
        assertEquals(49400,  tuitionFeePayment.calculateTuitionFee(26, 0.05));
    }

    @Test
    @DisplayName("Should Make Payment")
    void shouldMakePayment() {
        //act
        tuitionFeePayment.calculateTuitionFee(26, 0);
        tuitionFeePayment.makePayment(7000);

        //assert
        assertEquals(45000, tuitionFeePayment.getBalance());
    }

    @Test
    @DisplayName("Should be Fully Paid")
    void shouldbeFullyPaid() {
        //act
        tuitionFeePayment.calculateTuitionFee(26, 0);
        tuitionFeePayment.makePayment(52000);

        //assert
        assertTrue(tuitionFeePayment.isFullyPaid());
    }

    @Test
    @DisplayName("Should not be Fully Paid")
    void shouldnotbeFullyPaid() {
        //act
        tuitionFeePayment.calculateTuitionFee(26, 0);
        tuitionFeePayment.makePayment(7000);

        //assert
        assertFalse(tuitionFeePayment.isFullyPaid());
    }
}