package com.demo;
public class Passenger {

    private String name;
    private String passport;

    public Passenger(String name, String passport) {

        this.name = name;
        this.passport = passport;

    }

    public boolean isValid() {

        return name != null && !name.isEmpty()
                && passport != null && !passport.isEmpty();

    }

}