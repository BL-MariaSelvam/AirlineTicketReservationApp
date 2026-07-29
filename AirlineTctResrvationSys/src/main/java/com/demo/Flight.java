package com.demo;

public class Flight {

    private String flightNo;
    private String airline;
    private String source;
    private String destination;
    private String departureDate;
    private String returnDate;
    private String departureTime;
    private String arrivalTime;
    private int duration;          // minutes
    private int stops;
    private String travelClass;
    private double price;

    public Flight(String flightNo, String airline, String source,
                  String destination, String departureDate,
                  String returnDate, String departureTime,
                  String arrivalTime, int duration,
                  int stops, String travelClass, double price) {

        this.flightNo = flightNo;
        this.airline = airline;
        this.source = source;
        this.destination = destination;
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.duration = duration;
        this.stops = stops;
        this.travelClass = travelClass;
        this.price = price;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public String getAirline() {
        return airline;
    }

    public String getTravelClass() {
        return travelClass;
    }

    public int getStops() {
        return stops;
    }

    public double getPrice() {
        return price;
    }

    public int getDuration() {
        return duration;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void display() {

        System.out.println("--------------------------------------");
        System.out.println("Flight : " + flightNo);
        System.out.println("Airline : " + airline);
        System.out.println(source + " -> " + destination);
        System.out.println("Departure : " + departureDate + " " + departureTime);
        System.out.println("Arrival   : " + arrivalTime);
        System.out.println("Duration  : " + duration + " mins");
        System.out.println("Stops     : " + stops);
        System.out.println("Class     : " + travelClass);
        System.out.println("Price     : $" + price);
    }
}
