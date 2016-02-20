package com.ampatalas.main;

import java.util.Arrays;

/**
 * Problem:
 * Write three functions that compute the sum of the numbers in a given list using
 * - a for-loop,
 * - a while-loop,
 * - and recursion.
 */
public class ListSum {

    public int forLoop(int[] list) {
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        return sum;
    }

    public int whileLoop(int[] list) {
        int index = 0;
        int sum = 0;
        while (index < list.length) {
            sum += list[index++];
        }
        return sum;
    }

    public int recursive(int[] list) {
        if (list.length == 0) return 0;
        else {
            int[] subArray = Arrays.copyOfRange(list, 0, list.length - 1);
            return list[list.length - 1] + recursive(subArray);
        }
    }
}
