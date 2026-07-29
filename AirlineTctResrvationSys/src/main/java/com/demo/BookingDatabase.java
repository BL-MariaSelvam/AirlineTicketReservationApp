package com.demo;

import java.util.ArrayList;

public class BookingDatabase {

    static ArrayList<Booking> bookings =
            new ArrayList<>();

    public static void save(Booking booking) {

        bookings.add(booking);

        System.out.println("Booking Saved Successfully.");

    }

}
