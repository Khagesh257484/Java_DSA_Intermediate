package com.intermediate.array;

public class ArrayFactory {
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
        int[] suffixSum = new int[arr.length];


        return suffixSum;
    }

    public static int[] createEvenIndexPrefixSum(int[] arr, int arrayLength) {
        int[] evenSum = new int[arrayLength];


        return evenSum;
    }


    public static int[] createOddIndexPrefixSum(int[] arr, int arrayLength) {
        int[] oddSum = new int[arrayLength];


        return oddSum;
    }
}
