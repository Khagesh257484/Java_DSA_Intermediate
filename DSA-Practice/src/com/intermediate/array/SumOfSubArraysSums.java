/*
 Question : Find the sum of all sub arrays sums.
 int[] arr={10,20,30}

 output : 200;
* */

package com.intermediate.array;

public class SumOfSubArraysSums {
    // Carry forward technique

    public static int sumOfAllSubArraysSum(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        System.out.println(sumOfAllSubArraysSum(arr, arr.length));
    }
}
