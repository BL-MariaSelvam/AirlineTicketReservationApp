package com.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Flight flight =
                new Flight("AI101",100);

        Booking booking =
                new Booking(flight);

        booking.addPassenger(
                new Passenger("John"));

        booking.addPassenger(
                new Passenger("Emma"));

        booking.confirmBooking();

        booking.display();

    }
}