package com.demo;

import java.util.*;

import java.util.ArrayList;

public class FlightService {

    ArrayList<Flight> flights = new ArrayList<>();

    public FlightService(){

        flights.add(new Flight(
                "Air India",
                "AI101",
                "Airbus A320",

                "Chennai",
                "Delhi",

                "06:30",
                "09:10",

                "IST",
                "IST",

                160,
                "Non Stop",

                40,
                12,
                4,

                180,
                25,
                10,

                "20 Kg",
                "7 Kg",

                "Free within 24 Hours",
                "$30 Modification Fee",

                "WiFi, Meals, Entertainment",

                "On Time"
        ));

        flights.add(new Flight(
                "IndiGo",
                "6E220",
                "Airbus A321",

                "Chennai",
                "Mumbai",

                "10:00",
                "12:15",

                "IST",
                "IST",

                135,
                "Non Stop",

                28,
                10,
                2,

                150,
                20,
                8,

                "15 Kg",
                "7 Kg",

                "Non Refundable",
                "$25 Modification Fee",

                "Meals, USB Charging",

                "Delayed 30 Minutes"
        ));
    }

    public void search(String source,String destination){

        for(Flight f:flights){

            if(f.getSource().equalsIgnoreCase(source)
                    &&
                    f.getDestination().equalsIgnoreCase(destination)){

                f.display();

            }

        }

    }

}