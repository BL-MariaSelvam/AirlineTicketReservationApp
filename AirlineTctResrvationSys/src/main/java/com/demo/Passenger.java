package com.demo;
public class Passenger {

    private String name;
    private int age;
    private String gender;
    private String idProof;
    private String email;
    private String phone;
    private String mealPreference;
    private String specialAssistance;
    private String frequentFlyerNo;
    private boolean existingProfile;

    public Passenger(String name, int age, String gender,
                     String idProof, String email,
                     String phone, String mealPreference,
                     String specialAssistance,
                     String frequentFlyerNo,
                     boolean existingProfile) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.idProof = idProof;
        this.email = email;
        this.phone = phone;
        this.mealPreference = mealPreference;
        this.specialAssistance = specialAssistance;
        this.frequentFlyerNo = frequentFlyerNo;
        this.existingProfile = existingProfile;
    }

    public boolean validatePassenger() {

        if(name == null || name.isEmpty())
            return false;

        if(idProof == null || idProof.isEmpty())
            return false;

        if(email == null || email.isEmpty())
            return false;

        if(phone == null || phone.isEmpty())
            return false;

        return true;
    }

    public void display() {

        System.out.println("-------------------------");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Gender : " + gender);
        System.out.println("ID Proof : " + idProof);
        System.out.println("Email : " + email);
        System.out.println("Phone : " + phone);
        System.out.println("Meal : " + mealPreference);
        System.out.println("Special Assistance : " + specialAssistance);
        System.out.println("Frequent Flyer No : " + frequentFlyerNo);
        System.out.println("Existing Profile : " + existingProfile);
    }
}