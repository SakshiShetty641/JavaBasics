package com.company.javabasics;

public class Exceptions {
    // TODO: 18/04/22 - Exception handling

    /**
     * An exception is an unwanted or unexpected event, which occurs during the execution of a program i.e at run time,
     * that disrupts the normal flow of the program’s instructions
     */

    //Try and Catch block
    public static void main(String[] args) {

        /**
         * The try statement allows you to define a block of code to be tested for errors while it is being executed.
         * The catch statement allows you to define a block of code to be executed, if an error occurs in the try block.
         */

        int[] marks = {90, 95, 96};
        try {
            System.out.println(marks[3]);
        } catch (Exception e) {
            System.out.println("Student in the class");
        }

    }

}
