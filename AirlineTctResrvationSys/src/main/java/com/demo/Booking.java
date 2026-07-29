package com.demo;

import java.time.LocalDateTime;
import java.util.*;

public class Booking {

    private PassengerService passengerService =
            new PassengerService();

    public void addPassengers() {

        passengerService.addPassenger();

    }

    public void showBookingPassengers() {

        passengerService.displayPassengers();

        System.out.println("Total Passengers : "
                + passengerService.totalPassengers());

    }

}
