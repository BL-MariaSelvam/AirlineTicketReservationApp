package com.demo;
import java.time.LocalDate;

public class User {
    private String name;
    private String email;
    private String phone;
    private LocalDate dob;
    private String passportId;
    private String password;
    private String role;
    private boolean active;
    private boolean rememberMe;

    public User(String name, String email, String phone, LocalDate dob,
                String passportId, String password, String role) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.dob = dob;
        this.passportId = passportId;
        this.password = password;
        this.role = role;
        this.active = true;
        this.rememberMe = false;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public LocalDate getDob() {
        return dob;
    }

    public String getPassportId() {
        return passportId;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isRememberMe() {
        return rememberMe;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRememberMe(boolean rememberMe) {
        this.rememberMe = rememberMe;
    }

    public void deactivate() {
        active = false;
    }

    public void updateProfile(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }
}