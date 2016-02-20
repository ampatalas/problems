package com.ampatalas.main;

import java.math.BigInteger;

public class Fibonacci {

    public static BigInteger fibonacci(int number) {
        if (number < 1) throw new IllegalArgumentException("Minimal argument is 1");
        if (number == 1) return BigInteger.ZERO;
        if (number == 2) return BigInteger.ONE;

        BigInteger nMinusTwo = BigInteger.ZERO;
        BigInteger nMinusOne = BigInteger.ONE;
        BigInteger result = BigInteger.ZERO;

        for (int i = 3; i <= number; i++) {
            result = nMinusTwo.add(nMinusOne);
            nMinusTwo = nMinusOne;
            nMinusOne = result;
        }
        return result;
    }
}
