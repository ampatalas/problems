package com.ampatalas.main;

import java.util.Arrays;

/**
 * Write a function that combines two lists by alternatingly taking elements.
 * For example: given the two lists [a, b, c] and [1, 2, 3],
 * the function should return [a, 1, b, 2, c, 3].
 */
public class MergeLists {

    public Object[] merge(Object[] first, Object[] second) {
        Object[] result = new Object[first.length + second.length];
        int index = 0;
        while (first.length > 0 || second.length > 0) {
            if (first.length > 0) {
                result[index++] = first[0];
                first = Arrays.copyOfRange(first, 1, first.length);
            }

            if (second.length > 0) {
                result[index++] = second[0];
                second = Arrays.copyOfRange(second, 1, second.length);
            }
        }
        return result;
    }
}
