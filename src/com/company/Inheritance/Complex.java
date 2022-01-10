package com.company.Inheritance;

//Use of the super keyword - Refers to superclass (parent) objects
class Building{
    int one;

    Building(int one) {
        this.one = one;
    }
}

class Garden extends Building{

    public Garden(int one) {
        super(one);
        System.out.println("Welcome");
    }

    public void display(){
        System.out.println("Details are: " +super.one);
    }
}


public class Complex {
    public static void main(String[] args) {
        Garden garden = new Garden(10);
        garden.display();

    }
}
