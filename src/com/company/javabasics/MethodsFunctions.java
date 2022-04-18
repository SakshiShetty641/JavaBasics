package com.company.javabasics;

public class MethodsFunctions {

    /**
     * When method is static, we can directly call the method in the main class
     */

    public static void display() {
        System.out.println("Hello Java");
    }

    /**
     * When method is not static, we need to create a object of main class then use it
     */
    public void print(){
        System.out.println("This is a java program");
    }

    public static void sum(int a, int b){
        int sum = a + b;
        System.out.println(sum);
    }

    public static void main(String[] args) {
        display();
        MethodsFunctions methodsFunctions = new MethodsFunctions();
        methodsFunctions.print();
        sum(10 ,40);

    }
}
