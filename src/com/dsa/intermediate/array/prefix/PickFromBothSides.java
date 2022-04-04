package com.dsa.intermediate.array.prefix;

import java.util.Arrays;

public class PickFromBothSides {
    public int[] suffixArray(int[] a) {
        int n = a.length;
        int[] suf = new int[n];

        suf[n - 1] = a[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] + a[i];
        }

        return suf;
    }

    public int[] prefixSumArray(int[] a) {
        int n = a.length;
        int[] ps = new int[n];
        ps[0] = a[0];
        for (int i = 1; i < n; i++) {
            ps[i] = ps[i - 1] + a[i];
        }
        return ps;
    }

    public static void main(String[] args) {
        PickFromBothSides pkbs = new PickFromBothSides();
        //int arr[] = {15, 10, 25, 5, 10, 20};
        int arr[] = {5, -2, 3, 1, 2};
        int[] ps = pkbs.prefixSumArray(arr);
        int[] sf = pkbs.suffixArray(arr);

        for(int i=0;i<arr.length;i++){

        }

    }
}
