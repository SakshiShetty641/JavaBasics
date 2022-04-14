package com.company.javabasics;

public class JavaBasics {
    /*
    * Variables - container to store a value */

    // TODO: 13/04/22 - Data Types --> Primitive and Non-Primitive
    //Primitive datatypes -  includes byte, short, int, long, float, double, boolean and char & has a fixed size
    //Non - Primitive Data types - String, array, classes ==> includes methods, functions to perform operations, no fixed size

    public static void main(String[] args) {
        String fname = "Sakshi";
        String lname = "Shetty";

        System.out.println(fname.length());

        //Concatenate
        System.out.println(fname + " and " +lname);

        //In java - indexing starts from 0....
        System.out.println(fname.charAt(0));

        //In java - Strings are immutable, once added cannot be changed
        System.out.println(fname.replace('a', 'b'));

        // TODO: 13/04/22 - Substring
        /* Substring - part of string when 0 to 3 includes 0 but excludes 3 so it will be 0 to 2 */
        System.out.println(fname.substring(0,5));

    }
}
