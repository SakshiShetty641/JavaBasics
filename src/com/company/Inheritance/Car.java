package com.company.Inheritance;

//Basic concept of inheritance
//If the class Vehicle is final then Not able to extend

class Vehicle {
    public void horn() {
        System.out.println("Horn Horn");
    }

    public void colour() {
        System.out.println("Black Color");
    }
}

public class Car extends Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.horn();
        car.colour();
    }
}
