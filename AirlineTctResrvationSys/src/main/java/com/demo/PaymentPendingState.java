package com.demo;

public class PaymentPendingState implements BookingState {

    @Override
    public void next(Booking booking) {

        System.out.println("Booking is waiting for payment.");

    }

    @Override
    public String getStateName() {

        return "PAYMENT_PENDING";

    }

}
