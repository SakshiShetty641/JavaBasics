package com.company.Polymorphism;

//Main method can be overloaded, but we have to invoke the methods separately
//Main method can be overridden


public class Main {
    public static void main(String[] args) {
        System.out.println("Default Main Method");
        main(10);

    }

    public static void main(int args) {
        System.out.println("Overloaded main method");

    }

}
