package com.demo;

public class ConfirmedState implements BookingState {

    @Override
    public void nextState(Booking booking) {

        System.out.println("Booking is already CONFIRMED.");

    }

    @Override
    public String getState() {

        return "CONFIRMED";

    }

}