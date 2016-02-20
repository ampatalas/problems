package com.ampatalas.test;

import com.ampatalas.main.Fibonacci;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {

    @Test(expected = IllegalArgumentException.class)
    public void fibonacci0() {
        Fibonacci.fibonacci(0);
    }

    @Test
    public void fibonacci1() {
        Assert.assertEquals(0, Fibonacci.fibonacci(1));
    }

    @Test
    public void fibonacci2() {
        Assert.assertEquals(1, Fibonacci.fibonacci(2));
    }

    @Test
    public void fibonacci3() {
        Assert.assertEquals(1, Fibonacci.fibonacci(3));
    }

    @Test
    public void fibonacci10() {
        Assert.assertEquals(34, Fibonacci.fibonacci(10));
    }

}