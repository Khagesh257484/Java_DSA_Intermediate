package com.dsa.intermediate.sorting;

import java.util.Arrays;

public class NobleInteger {
    public int solve(int[] A) {
        Arrays.sort(A);
        int ans = 0;
        int less = 0;

        if (A[0] == 0)
            ans++;

        for (int i = 1; i < A.length; i++) {
            if (A[i] != A[i - 1])
                less = i;
            if (A[i] == less)
                ans++;
        }
        return ans;
    }

    public static void main(String[] args) {

        NobleInteger integer = new NobleInteger();
        int[] a = {3, 2, 1, 3};
        int[] b = {1, 1, 3, 3};
        System.out.println(integer.solve(a));
        System.out.println(integer.solve(b));
    }
}
