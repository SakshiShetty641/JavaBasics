package com.company.Inheritance;

//Concept of Constructor Overloading in Inheritance


class A {
    public A() {
        System.out.println("Hello all to programming");
    }
}

class B extends A {
    public B() {
        System.out.println("Hello all to Java");
    }
}

public class Welcome {
    public static void main(String[] args) {
        //Even though the object of child class is created, first invokes parent constructor, then child constructor
        B details = new B();
    }

}
