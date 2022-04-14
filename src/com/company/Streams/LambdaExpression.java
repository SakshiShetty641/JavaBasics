package com.company.Streams;

@FunctionalInterface
interface Lambda {
    public void print();
}

public class LambdaExpression {

    public static void main(String[] args) {
        Lambda obj = () -> System.out.println("Lambda Expression");
        obj.print();
    }
}


