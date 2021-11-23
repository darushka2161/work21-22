package com.company;

public class Main {

    public static void main(String[] args) {
        ComplexNumbersFactory factory = new Factory();
        ComplexNumber complexNumber = new ComplexNumber(factory);
        System.out.println(complexNumber);
    }
}
