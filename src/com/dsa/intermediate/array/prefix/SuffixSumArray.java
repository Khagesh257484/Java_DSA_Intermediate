package com.dsa.intermediate.array.prefix;

import java.util.Arrays;

/*
Input: arr[] = { 15, 10, 25, 5, 10, 20 } , N = 6
Output: suffixSum[] = { 85, 70, 60, 35, 30, 20}

Explanation: While traversing the array from back, keep adding element from the back with element at current index.
suffixSum[5] = 20,
suffixSum[4] =suffixSum[5] + arr[4] = 20+10 = 30 ,
suffixSum[3] = suffixSum[4] + arr[3] = 30+5 = 35 and so on.

* */
public class SuffixSumArray {
    public int[] suffixArray(int[] a) {
        int n = a.length;
        int[] suf = new int[n];

        suf[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] + a[i];
        }

        return suf;
    }

    public static void main(String[] args) {

        SuffixSumArray suf = new SuffixSumArray();
        //int arr[] = {15, 10, 25, 5, 10, 20};
        int arr[] = {5, -2, 3, 1, 2};
        int a[] = suf.suffixArray(arr);
        System.out.println(Arrays.toString(a));


    }
}
