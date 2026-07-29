package com.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Flight flight=new Flight(
                "AI101",
                "Chennai",
                "Delhi");

        Booking booking=new Booking(

                "PNR12345",

                "ET987654",

                flight,

                "12A",

                250,

                "Confirmed",

                "Paid",

                "TXN458796",

                "Not Checked-In");

        booking.addPassenger(
                new Passenger(
                        "John",
                        "john@gmail.com",
                        "9876543210"));

        booking.addPassenger(
                new Passenger(
                        "Emma",
                        "emma@gmail.com",
                        "9876501234"));

        BookingService service=
                new BookingService();

        service.addBooking(booking);

        service.searchPNR("PNR12345");

        service.searchEmail("john@gmail.com");

        service.searchTicket("ET987654");

        service.downloadTicket("ET987654");

    }
}