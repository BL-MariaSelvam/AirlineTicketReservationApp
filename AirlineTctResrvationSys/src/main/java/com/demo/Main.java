package com.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        FlightService service = new FlightService();

        System.out.println("1. Group By Airline");
        service.groupByAirline();

        System.out.println("\n2. Group By Price");
        service.groupByPriceRange();

        System.out.println("\n3. Group By Time Slot");
        service.groupByTimeSlot();

        System.out.println("\n4. Average Fare");
        service.averageFare();

        System.out.println("\n5. Cheapest Flight");
        service.cheapestFlight();

        System.out.println("\n6. Layover Group");
        service.layoverGroup();

        System.out.println("\n7. Total Seats");
        service.totalSeats();

        System.out.println("\n8. Round Trip Group");
        service.roundTripDuration();
    }

}