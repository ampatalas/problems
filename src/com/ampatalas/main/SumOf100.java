package com.ampatalas.main;

import java.util.Arrays;

public class SumOf100 {

    public static int COUNTER = 0;

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 100;
        solution(sum, numbers, "");
        System.out.println("Count: " + COUNTER);

    }

    public static void solution(int sum, int[] numbers, String result) {
        if (numbers.length > 0) {

            int firstNumberInArray = numbers[0];
            int[] newArray = Arrays.copyOfRange(numbers, 1, numbers.length);

            // addition
            int newSum = sum - firstNumberInArray;
            int[] newArrayClone = newArray.clone();
            solution(newSum, newArrayClone, result + firstNumberInArray + " ");

            if (newArray.length > 0) {
                // subtraction
                int newFirstNumber = -newArray[0];
                newArrayClone = newArray.clone();
                newArrayClone[0] = newFirstNumber;
                solution(newSum, newArrayClone, result + firstNumberInArray + " ");

                // merging
                int newDigit;
                if (firstNumberInArray < 0) {
                    newDigit = -Math.abs(newArray[0]);
                } else newDigit = Math.abs(newArray[0]);
                newFirstNumber = firstNumberInArray * 10 + newDigit;
                newArrayClone = newArray.clone();
                newArrayClone[0] = newFirstNumber;
                solution(sum, newArrayClone, result);
            } else return;
        } else {
            if (sum == 0) {
                System.out.println(result);
                COUNTER++;
            }
        }
    }
}
