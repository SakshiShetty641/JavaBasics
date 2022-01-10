package com.company.Polymorphism;

//Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritance.
//Compile-Time Polymorphism => The compiler examines the method signature at compile time and determines which method to invoke for a given method call.

//Overloading occurs when two or more methods in one class have the same method name but different parameters.
// Overriding occurs when two methods have the same method name and parameters. One of the methods is in the parent class, and the other is in the child class.

class Animal {
    public void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("The dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("The cat makes a sound meow");
    }
}


public class Zoo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();
        Dog dog = new Dog();
        dog.sound();
        Cat cat = new Cat();
        cat.sound();
    }
}
