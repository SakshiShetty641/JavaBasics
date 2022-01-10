package com.company.Polymorphism;

//If a parent class has a static method and a child class extends the parent class then it should also have static method

class Parent{
    public static void display(){
        System.out.println("Hello, Welcome");
    }
}

class Child extends Parent{
    public static void display(){
        System.out.println("Display hello");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.display();

        Child child = new Child();
        child.display();
    }
}
