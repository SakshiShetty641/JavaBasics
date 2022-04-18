package com.company.OOPS;

// TODO: 18/04/22 - To understand the concept of Inheritance

/**
 * Inheritance in Java is a concept that acquires the properties from one class to other classes;
 * For Inheritance we use the keyword extends
 * Types - Single, Multilevel, and Hierarchical types of inheritance
 */


/**
 * Note -  Multiple inheritance is not supported because it leads to deadly diamond problem.
 * Consider a case where class B extends class A and Class C and both class A and C have the same method display().
 * Now java compiler cannot decide, which display method it should inherit. To prevent such situation, multiple inheritances is not allowed in java.
 */

//Single level Inheritance
class Shape {
    public void area() {
        System.out.println("The calculated area is : ");
    }
}

class Triangle extends Shape {

}

public class Inheritance {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.area();
    }
}
