package com.demo;

public class PassengerDetailsState implements BookingState {

    @Override
    public void next(Booking booking) {

        booking.setState(new SeatSelectedState());

    }

    @Override
    public String getStateName() {

        return "PASSENGER_DETAILS";

    }

}
