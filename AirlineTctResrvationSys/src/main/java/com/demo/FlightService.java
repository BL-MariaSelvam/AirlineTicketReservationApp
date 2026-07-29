package com.demo;

import java.util.*;

public class FlightService {

    ArrayList<Flight> flights = new ArrayList<>();

    public FlightService() {

        flights.add(new Flight("AI101","Air India",
                "Chennai","Delhi",
                "2026-08-15","2026-08-20",
                "06:00","08:30",
                150,0,"Economy",180));

        flights.add(new Flight("6E202","IndiGo",
                "Chennai","Delhi",
                "2026-08-15","2026-08-20",
                "09:00","11:45",
                165,1,"Business",250));

        flights.add(new Flight("SG301","SpiceJet",
                "Chennai","Mumbai",
                "2026-08-15","2026-08-22",
                "12:00","14:20",
                140,0,"Economy",150));

        flights.add(new Flight("UK501","Vistara",
                "Delhi","Dubai",
                "2026-08-18","2026-08-25",
                "14:30","18:30",
                240,0,"First Class",700));
    }

    // Search Source & Destination
    public void search(String source, String destination) {

        for(Flight f : flights) {

            if(f.getSource().equalsIgnoreCase(source)
                    &&
                    f.getDestination().equalsIgnoreCase(destination)) {

                f.display();
            }
        }
    }

    // Departure Date
    public void departureDate(String date){

        for(Flight f:flights){

            if(f.getDepartureDate().equals(date))
                f.display();
        }
    }

    // Return Date
    public void returnDate(String date){

        for(Flight f:flights){

            if(f.getReturnDate().equals(date))
                f.display();
        }
    }

    // Airline Filter
    public void airline(String airline){

        for(Flight f:flights){

            if(f.getAirline().equalsIgnoreCase(airline))
                f.display();
        }
    }

    // Travel Class
    public void travelClass(String cls){

        for(Flight f:flights){

            if(f.getTravelClass().equalsIgnoreCase(cls))
                f.display();
        }
    }

    // Stops
    public void stops(int stop){

        for(Flight f:flights){

            if(f.getStops()==stop)
                f.display();
        }
    }

    // Price Range
    public void priceRange(double min,double max){

        for(Flight f:flights){

            if(f.getPrice()>=min && f.getPrice()<=max)
                f.display();
        }
    }

    // Sort Price Low to High
    public void sortPriceAscending(){

        Collections.sort(flights,
                Comparator.comparingDouble(Flight::getPrice));

        flights.forEach(Flight::display);
    }

    // Sort Price High to Low
    public void sortPriceDescending(){

        Collections.sort(flights,
                Comparator.comparingDouble(Flight::getPrice).reversed());

        flights.forEach(Flight::display);
    }

    // Sort Duration
    public void sortDuration(){

        Collections.sort(flights,
                Comparator.comparingInt(Flight::getDuration));

        flights.forEach(Flight::display);
    }

    // Sort Departure Time
    public void sortDeparture(){

        Collections.sort(flights,
                Comparator.comparing(Flight::getDepartureTime));

        flights.forEach(Flight::display);
    }

    // Sort Arrival Time
    public void sortArrival(){

        Collections.sort(flights,
                Comparator.comparing(Flight::getArrivalTime));

        flights.forEach(Flight::display);
    }

}
