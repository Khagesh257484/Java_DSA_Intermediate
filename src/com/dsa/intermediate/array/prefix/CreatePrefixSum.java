package com.dsa.intermediate.array.prefix;

import java.util.Arrays;

public class CreatePrefixSum {
    public static int[] createPrefixArray(int A[]) {
        int[] ps = new int[A.length];
        ps[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            ps[i]=ps[i-1]+A[i];
        }
        return ps;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(createPrefixArray(a)));

        int[] b = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(Arrays.toString(createPrefixArray(b)));

        int[] c = {0, 1, 3, -2, -1};
        System.out.println(Arrays.toString(createPrefixArray(c)));
    }
}
