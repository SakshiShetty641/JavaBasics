package com.company.Streams;

@FunctionalInterface
interface Cab {
    public void bookCab(String Source, String Destination);
}

public class Test {
    public static void main(String[] args) {
        Cab cab = ((Source, Destination) -> System.out.println("The cab is booked from " + Source + " To " + Destination));
        cab.bookCab("Mumbai", "Pune");
    }
}
