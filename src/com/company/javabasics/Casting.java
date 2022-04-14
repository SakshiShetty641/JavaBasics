package com.company.javabasics;

public class Casting {
    public static void main(String[] args) {

        // TODO: 14/04/22 -> Casting conversion  from one type top other

        /**
         * Implicit - when smaller value to larger value, automatically happens eg if int added to double
         * Explicit - when larger value to smaller value
         */

        // ==> Implicit
        double price = 100.00;
        double finalPrice = 100.00 + 18;
        System.out.println(finalPrice);

        // ==> Explicit
        int p = 100;
        int fp = p + (int)18.99; //Type casting to int will truncate all the numbers after the decimal
        System.out.println(fp);


    }

}
