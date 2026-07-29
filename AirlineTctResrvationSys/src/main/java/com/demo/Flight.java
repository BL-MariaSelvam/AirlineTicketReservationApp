package com.demo;

public class Flight {

    private String airline;
    private String source;
    private String destination;
    private double price;
    private String departureTime;
    private int duration;
    private int layover;     // minutes
    private int economySeats;
    private int businessSeats;
    private int firstSeats;

    public Flight(String airline,String source,String destination,
                  double price,String departureTime,
                  int duration,int layover,
                  int economySeats,int businessSeats,int firstSeats){

        this.airline=airline;
        this.source=source;
        this.destination=destination;
        this.price=price;
        this.departureTime=departureTime;
        this.duration=duration;
        this.layover=layover;
        this.economySeats=economySeats;
        this.businessSeats=businessSeats;
        this.firstSeats=firstSeats;
    }

    public String getAirline() {
        return airline;
    }

    public String getRoute() {
        return source + "-" + destination;
    }

    public double getPrice() {
        return price;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getDuration() {
        return duration;
    }

    public int getLayover() {
        return layover;
    }

    public int getTotalSeats() {
        return economySeats + businessSeats + firstSeats;
    }

    @Override
    public String toString() {
        return airline + " | " + getRoute()
                + " | $" + price
                + " | " + departureTime;
    }
}