package com.company.Abstraction;

//Concept of abstraction - hiding certain details and showing only essential information to the user.

abstract class Bank {
    abstract void getInterest();

    public void branch() {
        System.out.println("Please provide branch");
    }
}

class SBI extends Bank {

    @Override
    void getInterest() {
        System.out.println("2% rate of interest");
    }

    @Override
    public void branch() {
        super.branch();
        System.out.println("SBI Branch is Malad");
    }
}

class HDFC extends Bank {

    @Override
    void getInterest() {
        System.out.println("3% rate of interest");
    }

    @Override
    public void branch() {
        super.branch();
        System.out.println("HDFC Branch is Mumbai");
    }
}

public class Main {
    public static void main(String[] args) {

        //Bank bank = new Bank(); => Cannot create object of bank class because it is abstract

        Bank details1 = new SBI();
        details1.getInterest();
        details1.branch();

        Bank details2 = new HDFC();
        details2.getInterest();
        details2.branch();
    }

}
