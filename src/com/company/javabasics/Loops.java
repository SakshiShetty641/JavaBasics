package com.company.javabasics;

public class Loops {
    public static void main(String[] args) {

        // TODO: 18/04/22 - For Loop, While Loop, Do while loop

        // For loop
        /**
         * for (statement 1; statement 2; statement 3) {
         *   // code block to be executed
         * }
         * Statement 1 is executed (one time) before the execution of the code block.
         * Statement 2 defines the condition for executing the code block.
         * Statement 3 is executed (every time) after the code block has been executed.
         */
        for (int i = 0; i <= 5; i++)
            System.out.println("The numbers in the loop are :" + i);

        for (int a = 100; a > 1; a--)
            System.out.println(a);

        System.out.println("While Loop................");

        /**
         * While Loop - First checks for the condition and then prints the value
         */
        int a = 1;
        while (a <= 20){
            System.out.println(a);
            a++;

        }

        /**
         * Do while - First Executes once and then checks the condition
         */

        System.out.println("Do while Loop..............");
        int b = 1;
        do {
            System.out.println(b);
            b++;
        }
        while (b<=10);

    }
}
