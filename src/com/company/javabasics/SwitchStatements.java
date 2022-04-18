package com.company.javabasics;

public class SwitchStatements {
    public static void main(String[] args) {

        // TODO: 18/04/22 - Use o switch statements
        /* break Keyword - When Java reaches a break keyword, it breaks out of the switch block.
         When a match is found, and the job is done, it's time for a break. There is no need for more testing.
         */
        int day = 10;
        switch (day) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Thursday - Sunday");
        }
    }
}
