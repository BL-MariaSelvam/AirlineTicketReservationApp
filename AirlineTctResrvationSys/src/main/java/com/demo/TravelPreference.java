package com.demo;

public class TravelPreference {

    private String mealType;
    private String seatPreference;
    private String specialAssistance;

    public TravelPreference(String mealType,
                            String seatPreference,
                            String specialAssistance){

        this.mealType=mealType;
        this.seatPreference=seatPreference;
        this.specialAssistance=specialAssistance;
    }

    public void display(){

        System.out.println("\nTravel Preference");

        System.out.println("Meal : "+mealType);
        System.out.println("Seat : "+seatPreference);
        System.out.println("Special Assistance : "+specialAssistance);

    }

}
