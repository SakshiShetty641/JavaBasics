package com.company.StaticNonStatic;

//Non-static methods can access any static method and static variable, without creating an instance of the object.

class Details{

    public void display(){
        System.out.println("Display the details");
    }
}

public class Nonstatic {
    public static void main(String[] args) {
        Details details = new Details();
        details.display();
    }

}
