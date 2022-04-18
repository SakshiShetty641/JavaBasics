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

        //==> when more than 1 statement inside if then we need to use {}
        System.out.println("Enter the amount you have : ");
        int cash = sc.nextInt();
        if (cash < 50) {
            System.out.println("You cannot buy anything");
            System.out.println("Please get more cash");
        } else if (cash < 100 && cash > 50  )
            System.out.println("you can buy 1 thing");
        else
            System.out.println("You can buy");
    }

}
