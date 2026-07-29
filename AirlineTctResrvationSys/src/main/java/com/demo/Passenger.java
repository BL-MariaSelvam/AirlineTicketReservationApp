package com.demo;
import java.util.ArrayList;

public class Passenger {

    private String name;
    private ArrayList<String> bookingHistory = new ArrayList<>();

    public Passenger(String name) {

        this.name = name;

    }

    public void addBookingHistory(String bookingNo) {

        bookingHistory.add(bookingNo);

    }

    public String getName() {

        return name;

    }
}