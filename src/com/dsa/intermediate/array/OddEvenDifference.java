package com.dsa.intermediate.array;

/*
  Ques: Given an integer array, find out the difference of even and odd sum of numbers
  {1,4,3,7,9,11,12,14,6}
  return sum_even -sum_odd;

  Ques 2: for same given array find the difference of Max_evenNumber and Max_oddNumber

* */
public class OddEvenDifference {
    public static int evenAndOddSumDifference(int[] A) {
        int sum_even = 0, sum_odd = 0, n = A.length, difference;

        // edge cases
        if (n == 0) {
            return -1;
        }

        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                sum_even += A[i];
            } else {
                sum_odd += A[i];
            }
        }

        return difference = sum_even - sum_odd;
    }

    public static int maxEvenOddDifference(int[] A) {
        int n = A.length;
        if (n == 0) {
            return -1;
        }
        int max_even = Integer.MIN_VALUE, max_odd = Integer.MIN_VALUE, min_odd=Integer.MAX_VALUE ,difference;

        for (int i = 0; i < n; i++) {
            if (A[i] % 2 == 0) {
                // Max Even Condition
                if (A[i] > max_even) {
                    max_even = A[i];
                }
            } else {
                // Ques: Return max_odd and min_odd if user send max_odd and min_odd respectively

                // Condition for max_odd
                if (A[i] > max_odd)
                    max_odd = A[i];

                // Condition for Min odd
                if(min_odd >A[i]){
                    min_odd=A[i];
                }

            }
        }

        return difference=max_even-min_odd;
    }

    public static void main(String[] args) {
        int a[] = {5, 17, 100, 1};
        System.out.println(evenAndOddSumDifference(a));
        System.out.println(maxEvenOddDifference(a));

    }

}
