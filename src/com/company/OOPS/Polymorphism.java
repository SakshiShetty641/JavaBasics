package com.company.OOPS;

// TODO: 18/04/22 - To understand the concept of polymorphism

/**
 * Polymorphism is defined as the ability of a message to be displayed in more than one form.
 * In Java polymorphism is mainly divided into two types:
 * Compile-time Polymorphism
 * Runtime Polymorphism
 * <p>
 * Compile-time polymorphism - type of polymorphism is achieved by function overloading
 * Method Overloading: When there are multiple functions with the same name but different parameters then these functions are said to be overloaded.
 */

//Compile time b'coz while writing the code it detects the error

class School {
    int count;
    String board;

    public void print(int count) {
        System.out.println("The count is : " + count);
    }

    public void print(String board) {
        System.out.println("the board is : " + board);
    }

    public void print(int count, String board) {
        System.out.println("The count of students is : " + count + " and the board is : " + board);
    }

}

public class Polymorphism {
    public static void main(String[] args) {
        School school = new School();
        school.print(78);
        school.print("SSC");
        school.print(100, "SSC");
    }

}
