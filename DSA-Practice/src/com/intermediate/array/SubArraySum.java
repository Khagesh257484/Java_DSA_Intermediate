/*
 Print the sum of all sub arrays in separate line
 int[] arr={10,20,30}

 output=
 10
 30
 60
 20
 50
 30
* */

package com.intermediate.array;

public class SubArraySum {
    public static void sum(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += arr[i];
        }
        System.out.print(sum + "\t");
    }

    public static void subArraySum(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                sum(arr, i, j);
            }
        }
    }

    public static void subArraySum_optimized(int[] arr, int n) {
        int[] pref = new int[n];
        pref = ArraySumFactory.createPrefixSum(arr);

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int sum = 0;
                if (i == 0)
                    sum = pref[j];
                else
                    sum = pref[j] - pref[i - 1];

                System.out.print(sum + "\t");
            }
        }
    }

    public static void subArraySum_moreOptimized(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                System.out.print(sum + "\t");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int n = arr.length;
        subArraySum(arr, n);
        System.out.println();
        subArraySum_optimized(arr, n);
        System.out.println();
        subArraySum_moreOptimized(arr,n);

    }
}
