package com.company;

public class Employee {
    int id;
    String name;
    double contact;

    public void display() {
        System.out.println(id);
        System.out.println(name);
        System.out.println(contact);
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.id = 1;
        employee.name = "Sakshi";
        employee.contact = 897642312;
        employee.display();
    }
}
