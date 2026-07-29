package com.demo;

public class InitiatedState implements BookingState {

    @Override
    public void next(Booking booking) {

        booking.setState(new PassengerDetailsState());

    }

    @Override
    public String getStateName() {

        return "INITIATED";

    }

}
