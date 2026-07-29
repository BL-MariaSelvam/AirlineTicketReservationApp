package com.demo;

public interface BookingState {

    void next(Booking booking);

    String getStateName();

}
