package com.demo;

import java.time.LocalDateTime;
import java.util.*;

public class Booking {

    private String pnr;
    private Flight flight;
    private List<Passenger> passengers;

    private BookingState state;

    private double seatCharge;
    private double tax;

    private LocalDateTime expiryTime;

    private boolean seatsLocked;

    public Booking(Flight flight) {

        this.flight = flight;

        passengers = new ArrayList<>();

        state = new InitiatedState();

        pnr = UUID.randomUUID().toString()
                .substring(0,8)
                .toUpperCase();

        expiryTime = LocalDateTime.now().plusMinutes(20);

    }

    public void addPassenger(Passenger passenger){

        if(passenger.isValid()){

            passengers.add(passenger);

            System.out.println("Passenger Added");

        }

        else{

            System.out.println("Passenger Details Invalid");

        }

    }

    public void lockSeats(){

        seatsLocked=true;

        System.out.println("Seats Locked for 20 Minutes");

    }

    public double totalFare(){

        double base = flight.getFare()*passengers.size();

        return base + seatCharge + tax;

    }

    public void setCharges(double seatCharge,double tax){

        this.seatCharge=seatCharge;

        this.tax=tax;

    }

    public void nextState(){

        System.out.println("Current State : "
                +state.getStateName());

        state.next(this);

        System.out.println("Moved To : "
                +state.getStateName());

    }

    public void setState(BookingState state){

        this.state=state;

    }

    public void display(){

        System.out.println("\nBooking Summary");

        System.out.println("PNR : "+pnr);

        System.out.println("Flight : "
                +flight.getFlightNo());

        System.out.println("Passengers : "
                +passengers.size());

        System.out.println("Booking State : "
                +state.getStateName());

        System.out.println("Expiry : "
                +expiryTime);

        System.out.println("Seat Locked : "
                +seatsLocked);

        System.out.println("Total Fare : $"
                +totalFare());

    }

}
