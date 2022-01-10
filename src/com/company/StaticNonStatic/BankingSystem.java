package com.company.StaticNonStatic;

/**
 * A static method is a method that belongs to a class,
 * but it does not belong to an instance of that class and this method can be called without the instance or object of that class
 */
public class BankingSystem {


    public static void print() {
        System.out.println("Prints the bank details");
    }

    /**
     * Static block of code executes even before the main block
     */
    static {
        System.out.println("This is a static block of code");
    }

    public static void main(String[] args) {

        //To call a static method class name . method name

        BankingSystem.print();
    }

}
