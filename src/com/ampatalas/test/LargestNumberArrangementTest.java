package com.ampatalas.test;

import com.ampatalas.main.LargestNumberArrangement;
import org.junit.Assert;
import org.junit.Test;

public class LargestNumberArrangementTest {

    @Test
    public void noNumbers() {
        int[] input = {};
        Assert.assertEquals("", LargestNumberArrangement.arrangement(input));
    }

    @Test
    public void oneNumber() {
        int[] input = {1};
        Assert.assertEquals("1", LargestNumberArrangement.arrangement(input));
    }

    @Test
    public void singleDecidingDigit() {
        int[] input = {50, 2, 1, 9};
        Assert.assertEquals("95021", LargestNumberArrangement.arrangement(input));
    }

    @Test
    public void twoDecidingDigits() {
        int[] input = {55, 56, 1, 9};
        Assert.assertEquals("956551", LargestNumberArrangement.arrangement(input));
    }

}