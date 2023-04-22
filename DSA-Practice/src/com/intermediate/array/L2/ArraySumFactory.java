package com.intermediate.array.L2;

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

    public static int[] createSuffixSum(int[] arr){
        int[] suffixSum= new int[arr.length];


        return suffixSum;
    }

    public static int[] createEvenSum(int[] arr){
return null;
    }

    public static int[] createOddSum(int[] arr){
return null;
    }
}
