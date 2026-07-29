package com.demo;

public class SeatSelectedState implements BookingState {

    @Override
    public void next(Booking booking) {

        booking.setState(new PaymentPendingState());

    }

    @Override
    public String getStateName() {

        return "SEAT_SELECTED";

    }

}
