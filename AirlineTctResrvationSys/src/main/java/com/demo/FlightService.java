package com.demo;

import java.util.*;

import java.util.ArrayList;

import java.util.*;
import java.util.stream.*;

public class FlightService {

    List<Flight> flights = Arrays.asList(

            new Flight("Air India","Chennai","Delhi",
                    180,"06:30",160,0,40,10,2),

            new Flight("Air India","Chennai","Mumbai",
                    150,"14:00",140,30,35,8,2),

            new Flight("IndiGo","Chennai","Delhi",
                    170,"10:30",165,60,50,6,0),

            new Flight("IndiGo","Delhi","Dubai",
                    420,"20:30",240,90,45,8,5),

            new Flight("Vistara","Chennai","Delhi",
                    220,"18:00",150,0,30,12,6)
    );

    // 1. Group by Airline
    public void groupByAirline() {

        Map<String,List<Flight>> result =
                flights.stream()
                        .collect(Collectors.groupingBy(
                                Flight::getAirline));

        result.forEach((airline,list)->{

            System.out.println("\n"+airline);

            list.forEach(System.out::println);

        });
    }

    // 2. Group by Price Range
    public void groupByPriceRange(){

        Map<String,List<Flight>> result =
                flights.stream()
                        .collect(Collectors.groupingBy(f->{

                            if(f.getPrice()<200)
                                return "Budget";

                            else if(f.getPrice()<400)
                                return "Standard";

                            else
                                return "Premium";
                        }));

        result.forEach((k,v)->{

            System.out.println("\n"+k);

            v.forEach(System.out::println);

        });

    }

    // 3. Group by Time Slot
    public void groupByTimeSlot(){

        Map<String,List<Flight>> result =
                flights.stream()
                        .collect(Collectors.groupingBy(f->{

                            int hour=Integer.parseInt(
                                    f.getDepartureTime().split(":")[0]);

                            if(hour<12)
                                return "Morning";

                            else if(hour<17)
                                return "Afternoon";

                            else if(hour<21)
                                return "Evening";

                            else
                                return "Night";

                        }));

        result.forEach((k,v)->{

            System.out.println("\n"+k);

            v.forEach(System.out::println);

        });

    }

    // 4. Average Fare by Airline
    public void averageFare(){

        Map<String,Double> avg =
                flights.stream()
                        .collect(Collectors.groupingBy(
                                Flight::getAirline,
                                Collectors.averagingDouble(
                                        Flight::getPrice)));

        avg.forEach((k,v)->

                System.out.println(k+" : $"+v));

    }

    // 5. Cheapest Flight by Route
    public void cheapestFlight(){

        Map<String,Optional<Flight>> cheapest =
                flights.stream()
                        .collect(Collectors.groupingBy(
                                Flight::getRoute,
                                Collectors.minBy(
                                        Comparator.comparingDouble(
                                                Flight::getPrice))));

        cheapest.forEach((k,v)->

                System.out.println(k+" -> "+v.get()));

    }

    // 6. Group by Layover
    public void layoverGroup(){

        Map<String,List<Flight>> result=
                flights.stream()
                        .collect(Collectors.groupingBy(f->{

                            if(f.getLayover()==0)
                                return "Non Stop";

                            else if(f.getLayover()<=60)
                                return "Short Layover";

                            else
                                return "Long Layover";

                        }));

        result.forEach((k,v)->{

            System.out.println("\n"+k);

            v.forEach(System.out::println);

        });

    }

    // 7. Aggregate Seats
    public void totalSeats(){

        int seats=flights.stream()

                .collect(Collectors.summingInt(
                        Flight::getTotalSeats));

        System.out.println("Total Seats : "+seats);

    }

    // 8. Round Trip Group
    public void roundTripDuration(){

        Map<String,List<Flight>> result=
                flights.stream()
                        .collect(Collectors.groupingBy(f->{

                            if(f.getDuration()<180)
                                return "Short Journey";

                            else if(f.getDuration()<300)
                                return "Medium Journey";

                            else
                                return "Long Journey";

                        }));

        result.forEach((k,v)->{

            System.out.println("\n"+k);

            v.forEach(System.out::println);

        });

    }

}