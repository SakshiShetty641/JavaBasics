package com.company.javabasics;

public class Operators {
    public static void main(String[] args) {
        /**
         * Arithematic Operators
         * Assignment Operators
         * Logical Operators
         * Comparison Operators
         */

        // Arithematic Operators - "+, -, *, /"
        int a = 5;
        int b = 7;
        int sum = a + b;
        System.out.println(sum);

        int diff = a - b;
        System.out.println(diff);

        int mul = a * b;
        System.out.println(mul);

        int div = a / b;
        System.out.println(div);  //coz its int type will truncate all values after 0.

        // ==> To get remainder
        int mod = a % b;
        System.out.println(mod);

        double c = 8;
        double d = 3;
        double divv = 8 / 3;
        System.out.println(divv);

        // Unary operator =>> ++, --
        int num = 5;
        System.out.println(num++);   //==> first will assign 1 to num and then add
        System.out.println(num);

        System.out.println(++num);  //==> first will add 1 and then assign to num
        System.out.println(num);

        int number = 5;
        System.out.println(number--);
        System.out.println(number);

        System.out.println(--number);
        System.out.println(number);


        //Comparison Operators
        // ==> == equal to
        // ==> != not equal to
        // > < greater than, lesser than


        // TODO: 18/04/22 - Logical Operators -> &&-and  ||-Or
        int a1 = 10;
        int b1 = 20;

        // Or operator - returns true when both the conditions is true

        if (a > 30 && b > 30)
            System.out.println("Numbers are graeter than 30");
        else
            System.out.println("Numbers are less than 30");

        // Or operator - returns true when atleast one is true

        int c1 = 20;
        int d1 = 30;
        if(c1 > 10 || d1 >40)
            System.out.println("Atleast one is greater than the given number");

        // Not Operator - !
        boolean isAdult = true;
        if(!isAdult)
            System.out.println("Adult");
        else
            System.out.println("Not adult");
    }
}
