package com.demo;

public class Flight {

    private String flightNo;
    private double fare;

    public Flight(String flightNo, double fare) {

        this.flightNo = flightNo;
        this.fare = fare;

    }

    public double getFare() {

        return fare;

    }

    public String getFlightNo() {

        return flightNo;

    }

}