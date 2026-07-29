package com.demo;

public class Flight {

    private String airline;
    private String flightNumber;
    private String aircraftType;

    private String source;
    private String destination;

    private String departureTime;
    private String arrivalTime;

    private String departureZone;
    private String arrivalZone;

    private int duration;
    private String layover;

    private int economySeats;
    private int businessSeats;
    private int firstSeats;

    private double baseFare;
    private double tax;
    private double fees;

    private String checkInBaggage;
    private String cabinBaggage;

    private String cancellationPolicy;
    private String modificationPolicy;

    private String amenities;

    private String status;

    public Flight(String airline,String flightNumber,String aircraftType,
                  String source,String destination,
                  String departureTime,String arrivalTime,
                  String departureZone,String arrivalZone,
                  int duration,String layover,
                  int economySeats,int businessSeats,int firstSeats,
                  double baseFare,double tax,double fees,
                  String checkInBaggage,String cabinBaggage,
                  String cancellationPolicy,String modificationPolicy,
                  String amenities,String status){

        this.airline=airline;
        this.flightNumber=flightNumber;
        this.aircraftType=aircraftType;
        this.source=source;
        this.destination=destination;
        this.departureTime=departureTime;
        this.arrivalTime=arrivalTime;
        this.departureZone=departureZone;
        this.arrivalZone=arrivalZone;
        this.duration=duration;
        this.layover=layover;
        this.economySeats=economySeats;
        this.businessSeats=businessSeats;
        this.firstSeats=firstSeats;
        this.baseFare=baseFare;
        this.tax=tax;
        this.fees=fees;
        this.checkInBaggage=checkInBaggage;
        this.cabinBaggage=cabinBaggage;
        this.cancellationPolicy=cancellationPolicy;
        this.modificationPolicy=modificationPolicy;
        this.amenities=amenities;
        this.status=status;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public double getTotalFare(){
        return baseFare + tax + fees;
    }

    public void display(){

        System.out.println("\n==============================");
        System.out.println("AIRLINE : " + airline);
        System.out.println("Flight Number : " + flightNumber);
        System.out.println("Aircraft : " + aircraftType);

        System.out.println("\nRoute");
        System.out.println(source + " --> " + destination);

        System.out.println("\nTime");
        System.out.println("Departure : " + departureTime + " " + departureZone);
        System.out.println("Arrival   : " + arrivalTime + " " + arrivalZone);

        System.out.println("\nDuration : " + duration + " Minutes");
        System.out.println("Layover : " + layover);

        System.out.println("\nAvailable Seats");
        System.out.println("Economy : " + economySeats);
        System.out.println("Business : " + businessSeats);
        System.out.println("First Class : " + firstSeats);

        System.out.println("\nFare Breakdown");
        System.out.println("Base Fare : $" + baseFare);
        System.out.println("Taxes     : $" + tax);
        System.out.println("Fees      : $" + fees);
        System.out.println("Total     : $" + getTotalFare());

        System.out.println("\nBaggage");
        System.out.println("Check-in : " + checkInBaggage);
        System.out.println("Cabin    : " + cabinBaggage);

        System.out.println("\nPolicies");
        System.out.println("Cancellation : " + cancellationPolicy);
        System.out.println("Modification : " + modificationPolicy);

        System.out.println("\nAmenities");
        System.out.println(amenities);

        System.out.println("\nFlight Status : " + status);
    }
}