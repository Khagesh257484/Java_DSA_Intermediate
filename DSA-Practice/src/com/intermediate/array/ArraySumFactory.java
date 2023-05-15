package com.intermediate.array;

import java.util.Arrays;

public class ArraySumFactory {
    public static int[] createPrefixSum(int[] arr) {
        int[] prefSum = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                prefSum[0] = arr[0];
            } else {
                prefSum[i] = prefSum[i - 1] + arr[i];
            }
        }
        return prefSum;
    }

    public static int[] createSuffixSum(int[] arr) {
        int n = arr.length;
        int[] suffixSum = new int[n];
        suffixSum[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i + 1] + arr[i];
        }
        return suffixSum;
    }

    public static int[] createEvenPrefixSum(int[] arr) {
        int[] evenSum = new int[arr.length];
        evenSum[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (i % 2 != 0)
                evenSum[i] = evenSum[i - 1];
            else
                evenSum[i] = evenSum[i - 1] + arr[i];
        }
        return evenSum;
    }

    public static int[] createOddPrefixSum(int[] arr) {
        int[] oddSum = new int[arr.length];
        oddSum[0] = 0;
        oddSum[1] = arr[1];
        for (int i = 2; i < arr.length; i++) {
            if (i % 2 != 0)
                oddSum[i] = oddSum[i - 1] + arr[i];
            else
                oddSum[i] = oddSum[i - 1];
        }
        return oddSum;
    }

    public static int[] rightMaxSum(int[] arr) {
        int n = arr.length;
        int[] rightMax = new int[n];
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }
        return rightMax;
    }

    public static int[] leftMaxSum(int[] arr) {
        int n = arr.length;
        int[] leftMax = new int[n];
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }
        return leftMax;
    }

    public static int[] prefixProductArray(int[] arr) {
        int[] prefProd = new int[arr.length];
        prefProd[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefProd[i] = prefProd[i - 1] * arr[i];
        }
        return prefProd;
    }

    public static int[] suffixProductArray(int[] arr) {
        int n = arr.length;
        int[] suffProd = new int[n];
        suffProd[n - 1] = arr[n - 1];
        for (int i = n - 2; i >=0; i--) {
            suffProd[i] = suffProd[i + 1] * arr[i];
        }
        return suffProd;
    }

    public static class ArraySumFacClient {
        public static void main(String[] args) {
            int[] arr = {2, 4, 2, 7, 1, 8, 12, 9};

            int[] prefixSum = createPrefixSum(arr);
            int[] suffixSum = createSuffixSum(arr);
            int[] evenPrefixSum = createEvenPrefixSum(arr);
            int[] oddPrefixSum = createOddPrefixSum(arr);
            int[] leftMax = leftMaxSum(arr);
            int[] rightMax = rightMaxSum(arr);

            System.out.println(Arrays.toString(prefixSum));
            System.out.println(Arrays.toString(suffixSum));
            System.out.println(Arrays.toString(evenPrefixSum));
            System.out.println(Arrays.toString(oddPrefixSum));
            System.out.println(Arrays.toString(leftMax));
            System.out.println(Arrays.toString(rightMax));
        }
    }
}
