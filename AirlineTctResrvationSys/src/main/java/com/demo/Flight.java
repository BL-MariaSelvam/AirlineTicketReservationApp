package com.demo;

public class Flight {

    private String flightNo;
    private String source;
    private String destination;

    public Flight(String flightNo, String source, String destination) {

        this.flightNo = flightNo;
        this.source = source;
        this.destination = destination;
    }

    public String getFlightNo() {
        return flightNo;
    }

    public String getRoute() {
        return source + " -> " + destination;
    }
}