package com.demo;

public interface BookingState {

    void nextState(Booking booking);

    String getState();

}
