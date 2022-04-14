package com.company.javabasics;

import java.util.Arrays;

public class Array {
    // TODO: 14/04/22 - Array - Non primitive data type

    /**
     * In array index starts from 0 and ends at n-1
     * so if its 3 it will be 0 to 2
     * and if printed marks then gives combination of hashcode
     * If array is not initialized then it automatically assign null or zero value
     */
    public static void main(String[] args) {
        int marks[] = new int[3];  //==> *declaration and instantiation
        marks[0] = 38;    //==> *initialization
        marks[1] = 20;
        marks[2] = 42;

        System.out.println(marks);

        //==> To Print
        System.out.println(marks[2]);

        //==> To print entire array
        //Note - operator cannot be directly applied to array , use array.length
        for (int i = 0; i < marks.length; i++)
            System.out.println(marks[i]);

        //length
        System.out.println(marks.length);

        //Sort ==> Function available in Array class
        System.out.println("Before sorting.... " +marks[0]);
        Arrays.sort(marks);
        System.out.println("After sorting..... " +marks[0]);

        // * 1 dimensional array
        int [] result = {34, 76, 98, 100};

        // * 2 Dimensional array - eg -> marks of two students
        int [][] finalResult = {{34, 67, 23}, {56, 89, 23}};

        //To print 1st student & marks in first subject , [0] - 1st student & [0] - 1st subject
        System.out.println(finalResult[0][0]);

        //To print 2nd student marks in second subject , [1] - 2nd student & [1] - 2nd subject
        System.out.println(finalResult[1][1]);

    }
}