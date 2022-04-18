package com.company.javabasics;

import java.util.Scanner;

public class LoopsEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        do {
            System.out.println("Input a number : ");
            num = sc.nextInt();
            System.out.println("The number you have entered : " + num);
        }
        while (num >= 0);
        System.out.println("End....");
    }
}
