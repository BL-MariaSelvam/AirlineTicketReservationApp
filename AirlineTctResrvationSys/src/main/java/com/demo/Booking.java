package com.demo;

import java.time.LocalDateTime;
import java.util.*;

import java.util.*;
import java.util.UUID;

public class Booking {

    private Flight flight;
    private ArrayList<Passenger> passengers;

    private BookingState state;

    private boolean seatsLocked;

    private String bookingNo;
    private String ticketNo;

    public Booking(Flight flight) {

        this.flight = flight;

        passengers = new ArrayList<>();

        state = new PaymentPendingState();

        seatsLocked = true;

    }

    public void addPassenger(Passenger passenger) {

        passengers.add(passenger);

    }

    public void confirmBooking() {

        state.nextState(this);

        bookingNo = "PNR"
                + UUID.randomUUID()
                .toString()
                .substring(0,6)
                .toUpperCase();

        ticketNo = "ET"
                + UUID.randomUUID()
                .toString()
                .substring(0,8)
                .toUpperCase();

        BookingDatabase.save(this);

        seatsLocked = false;

        flight.reduceSeats(passengers.size());

        for(Passenger p : passengers){

            p.addBookingHistory(bookingNo);

        }

        NotificationService.sendEmail(bookingNo);

        NotificationService.sendSMS(bookingNo);

        System.out.println("\nBooking Confirmed Successfully");

    }

    public void setState(BookingState state){

        this.state = state;

    }

    public void display() {

        System.out.println("\n====== BOOKING DETAILS ======");

        System.out.println("Booking Number : "
                + bookingNo);

        System.out.println("E-Ticket Number : "
                + ticketNo);

        System.out.println("Flight : "
                + flight.getFlightNo());

        System.out.println("Booking State : "
                + state.getState());

        System.out.println("Seat Lock Released : "
                + !seatsLocked);

        System.out.println("Available Seats : "
                + flight.getAvailableSeats());

    }

}