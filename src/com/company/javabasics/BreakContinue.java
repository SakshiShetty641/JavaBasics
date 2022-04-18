package com.company.javabasics;

public class BreakContinue {
    public static void main(String[] args) {

        // TODO: 18/04/22 - Use of break and continue statements

        //Break Statement
        int i = 0;
        while (true) {
            if (i == 3) {
                i = i + 1;
                continue;
            }

            System.out.println("Numbers are : " + i);
            i = i + 1;
            if (i > 10) {
                break;
            }
        }

    }
}

