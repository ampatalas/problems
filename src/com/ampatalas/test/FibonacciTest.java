package com.ampatalas.test;

import com.ampatalas.main.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class FibonacciTest {

    @Test(expected = IllegalArgumentException.class)
    public void fibonacci0() {
        Fibonacci.fibonacci(0);
    }

    @Test
    public void fibonacci1() {
        Assert.assertEquals(BigInteger.ZERO, Fibonacci.fibonacci(1));
    }

    @Test
    public void fibonacci2() {
        Assert.assertEquals(BigInteger.ONE, Fibonacci.fibonacci(2));
    }

    @Test
    public void fibonacci3() {
        Assert.assertEquals(BigInteger.ONE, Fibonacci.fibonacci(3));
    }

    @Test
    public void fibonacci10() {
        Assert.assertEquals(new BigInteger("34"), Fibonacci.fibonacci(10));
    }

    @Test
    public void fibonacci100() {
        Assert.assertEquals(new BigInteger("218922995834555169026"), Fibonacci.fibonacci(100));
    }

}