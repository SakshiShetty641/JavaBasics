package com.company.javabasics;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        //To take input System.in

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = sc.nextInt();
        System.out.println(age);

       //  For Strings
        System.out.println(" Please enter your name :");
        String name = sc.next();  // ==> next will only print one word even if you pass an entire statement
        System.out.println(name);


        // To print entire line ==> use sc.nextline
        System.out.println("Please enter address :");
        String sentence =  sc.nextLine();
        System.out.println(sentence);

    }
}
