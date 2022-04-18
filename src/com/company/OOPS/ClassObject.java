package com.company.OOPS;

// TODO: 18/04/22 - Defination of class and object

/**
 * Class ==> A class is a logical entity, A class does not allocate memory space when it is created, You can declare class only once.
 * Object ==>  Object is a physical entity, Object allocates memory space whenever they are created, You can create more than one object using a class.
 * new keyword ==> The Java new keyword is used to create an instance of the class. In other words,
 *                  it instantiates a class by allocating memory for a new object and returning a reference to that memory.
 * this keyword ==> The this keyword refers to the current object in a method or constructor.
 */


class Pen {
    String color;
    String type;

    public void use() {
        System.out.println("The color of the pen is : " + color + " & the type of the pen is : " + type);
        System.out.println("Writing something.....");
    }
}

class Student {
    String name;
    int age;

    public void display() {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "Gel Pen";
        pen1.use();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball pen";
        pen2.use();

        Student student = new Student();
        student.name = "Sakshi";
        student.age = 10;
        student.display();
    }
}
