package com.ampatalas.main;

public class Fibonacci {

    public static int fibonacci(int number) {
        if (number < 1) throw new IllegalArgumentException("Minimal argument is 1");
        if (number == 1) return 0;
        if (number == 2) return 1;
        else return Fibonacci.fibonacci(number - 1) + Fibonacci.fibonacci(number - 2);
    }
}
