package com.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        public static void main(String[] args) {

            Flight flight =
                    new Flight("AI101",200);

            Booking booking =
                    new Booking(flight);

            booking.addPassenger(
                    new Passenger(
                            "John",
                            "P123456"));

            booking.addPassenger(
                    new Passenger(
                            "Emma",
                            "P987654"));

            booking.lockSeats();

            booking.setCharges(40,25);

            booking.nextState();

            booking.nextState();

            booking.nextState();

            booking.display();

        }

}