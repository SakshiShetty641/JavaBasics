package com.company.javabasics;

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {

        /**
         *
         The Math. random() function returns a floating-point, pseudo-random number in the range 0 to less than 1
         (inclusive of 0, but not 1)
         */
        Scanner sc = new Scanner(System.in);
        int num = (int) (Math.random() * 100);
        int userNum = 0;

        do {
            System.out.println("Guess the number");
            userNum = sc.nextInt();

            if (userNum == num) {
                System.out.println("Correct Number");
                break;
            } else if (userNum > num)
                System.out.println("Your numb is too large");
            else
                System.out.println("Your number is too small");
        }
        while (userNum > 0);
        System.out.println("Negative number is not allowed");
    }
}
