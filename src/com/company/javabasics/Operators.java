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

    }
}
