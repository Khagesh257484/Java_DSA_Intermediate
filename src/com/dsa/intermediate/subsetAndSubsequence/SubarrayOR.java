package com.dsa.intermediate.subsetAndSubsequence;

import java.util.Arrays;

public class SubarrayOR {
    public static int solve(int[] A) {
        long n = A.length, ans = 0, sum = 0;
        int i, j;
        for (i = 0; i < n; i++) {
            sum = 0;
            for (j = i; j < n; j++) {
                sum = sum | A[j];
                ans = ans + sum;
            }

        }
        return (int) (ans % ((int) Math.pow(10, 9) + 7));
    }

    public static int optimized(int[] A) {
        long n = A.length;
        long Total_subarrays = (long) (n * (n + 1) / 2);
        long ans = 0;
        int mod = (int) Math.pow(10, 9) + 7;    // 1e9 = 10 to the power nine, we can write in this way
        for (int i = 0; i < 32; i++) {
            long C1 = Total_subarrays;
            long zero = 0;
            for (int j = 0; j < n; j++) {
                if (((A[j] >> i) & 1) > 0) {
                    C1 = C1 - (zero * (zero + 1) / 2);
                    zero = 0;
                } else {
                    zero++;
                }
            }
            C1 = C1 - (zero * (zero + 1) / 2);
            ans = (ans % mod + (C1 * (long) Math.pow(2, i) % mod) % mod) % mod;
        }
        return (int) ans;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {7, 8, 9, 10};
        int result = solve(a);
        System.out.println(result);
        System.out.println(solve(b));
        System.out.println(optimized(b));
    }
}
