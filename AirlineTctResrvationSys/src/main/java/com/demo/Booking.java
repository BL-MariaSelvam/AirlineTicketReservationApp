package com.demo;

import java.time.LocalDateTime;
import java.util.*;

import java.util.*;
import java.util.UUID;
import java.util.ArrayList;

public class Booking {

    private String pnr;
    private String ticketNo;

    private Flight flight;

    private ArrayList<Passenger> passengers;

    private String seatNo;
    private double fare;

    private String bookingStatus;
    private String paymentStatus;
    private String transactionId;
    private String checkInStatus;

    public Booking(String pnr,String ticketNo,
                   Flight flight,
                   String seatNo,
                   double fare,
                   String bookingStatus,
                   String paymentStatus,
                   String transactionId,
                   String checkInStatus){

        this.pnr=pnr;
        this.ticketNo=ticketNo;
        this.flight=flight;
        this.seatNo=seatNo;
        this.fare=fare;
        this.bookingStatus=bookingStatus;
        this.paymentStatus=paymentStatus;
        this.transactionId=transactionId;
        this.checkInStatus=checkInStatus;

        passengers=new ArrayList<>();
    }

    public void addPassenger(Passenger p){
        passengers.add(p);
    }

    public String getPNR(){
        return pnr;
    }

    public String getTicketNo(){
        return ticketNo;
    }

    public ArrayList<Passenger> getPassengers(){
        return passengers;
    }

    public void display(){

        System.out.println("\n========== BOOKING ==========");

        System.out.println("PNR : "+pnr);

        System.out.println("E-Ticket : "+ticketNo);

        System.out.println("Flight : "+flight.getFlightNo());

        System.out.println("Route : "+flight.getRoute());

        System.out.println("Seat : "+seatNo);

        System.out.println("Fare : $"+fare);

        System.out.println("\nPassengers");

        for(Passenger p:passengers){

            System.out.println(p.getName());

        }

        System.out.println("\nBooking Status : "+bookingStatus);

        System.out.println("Payment Status : "+paymentStatus);

        System.out.println("Transaction ID : "+transactionId);

        System.out.println("Check-In Status : "+checkInStatus);

    }

}import java.time.LocalDate;

public class Booking {

    private String pnr;
    private String flightNo;
    private String source;
    private String destination;
    private LocalDate journeyDate;
    private String status;
    private double fare;

    public Booking(String pnr, String flightNo,
                   String source, String destination,
                   LocalDate journeyDate,
                   String status, double fare) {

        this.pnr = pnr;
        this.flightNo = flightNo;
        this.source = source;
        this.destination = destination;
        this.journeyDate = journeyDate;
        this.status = status;
        this.fare = fare;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getJourneyDate() {
        return journeyDate;
    }

    public String getPnr() {
        return pnr;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void displaySummary() {

        System.out.println("--------------------------------");

        System.out.println("PNR : " + pnr);

        System.out.println("Flight : " + flightNo);

        System.out.println(source + " -> " + destination);

        System.out.println("Journey : " + journeyDate);

        System.out.println("Status : " + status);

        System.out.println("Fare : $" + fare);

    }

}