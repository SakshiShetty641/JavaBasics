package com.company.OOPS;

// TODO: 18/04/22 - Understand the use of constructors

/**
 * Rules For constructor
 * Name of constructor should be same as the name of the class
 * No return type
 * Constructor can be called only once - when an object is created the constructor is called
 */

class Shop {
    String items;
    int quantity;

    /**
     * Non - Parameterized Constructor. If we dont add a non Parameterized Constructor java will automatically add a default constructor
     */
//    public Shop() {
//        System.out.println("Constructor called.....");
//    }

    // Parameterized Constructor
    public Shop(String items, int quantity) {
        this.items = items;
        this.quantity = quantity;
    }


    /**
     * Copy Constructor -  is a special type of constructor that is used to create a new object using the existing object of a class that we have created previously.
     * It creates a new object by initializing the object with the instance of the same class.
     */


    public void details() {
        System.out.println(this.items);
        System.out.println(this.quantity);
    }
}

public class Constructors {
    public static void main(String[] args) {
        Shop shop = new Shop("soap", 16);
        shop.details();

    }

}
