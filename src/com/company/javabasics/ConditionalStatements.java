package com.company.javabasics;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        // TODO: 18/04/22 - If else, If - else if - else statements

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int age = sc.nextInt();
        if (age > 18)
            System.out.println("Admission Provided");
        else
            System.out.println("Admission Denied");
    }
}
