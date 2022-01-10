package com.company.Inheritance;

//Two class base and sub-base

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class SubBase extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Derived{
    public static void main(String[] args) {
        Base base = new Base();  //Creation of object of the parent class
        //Here we can call method only of the parent class
        base.setX(8);
        System.out.println(base.getX());

        SubBase subBase = new SubBase();   //Creation of object of the child class
        //Here we can have both parent and child class methods
        subBase.setX(10);
        System.out.println("Child class setup of X" +subBase.getX());
        subBase.setY(9);
        System.out.println(subBase.getX());
    }
}
