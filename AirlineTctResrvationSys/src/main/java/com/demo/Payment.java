package com.demo;

public interface Payment {

    boolean validate();

    void process(double amount);

    void refund(double amount);

}
