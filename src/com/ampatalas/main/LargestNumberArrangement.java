package com.ampatalas.main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Write a function that given a list of non negative integers, arranges them such
 * that they form the largest possible number.
 * For example, given [50, 2, 1, 9], the largest formed number is 95021.
 */
public class LargestNumberArrangement {

    public static String arrangement(int[] list) {
        if (list.length == 0) return "";
        List<Integer> objList = IntStream.of(list).boxed().collect(Collectors.toList());
        Collections.sort(objList, new DigitComparator());
        String result = "";
        for (Integer integer : objList) {
            result += integer;
        }
        return result;
    }

    private static class DigitComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer first, Integer second) {
            int firstDigit = 0;
            int secondDigit = 0;

            while (firstDigit == secondDigit) {
                firstDigit = firstDigit(first);
                secondDigit = firstDigit(second);

                first = first % 10;
                second = second % 10;
            }
            return Integer.compare(secondDigit, firstDigit);
        }

        private int firstDigit(int n) {
            while (n < -9 || 9 < n) n /= 10;
            return Math.abs(n);
        }
    }

}
