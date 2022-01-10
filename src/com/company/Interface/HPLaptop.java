package com.company.Interface;

public class HPLaptop implements Laptop {

    @Override
    public void scan() {
        System.out.println("HP Laptop can scan");
    }

    @Override
    public void print() {
        System.out.println("HP Laptop can print");

    }

    public static void main(String[] args) {
        HPLaptop details = new HPLaptop();
        details.scan();
        details.print();
    }
}
