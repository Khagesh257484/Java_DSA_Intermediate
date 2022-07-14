package com.dsa.intermediate.subsetAndSubsequence;

import java.util.Arrays;

public class SumOfDifference {
    public static int differenceSum(int[] A) {
        long mod = 1000000000 + 7, max = 0, min = 0;
        int n = A.length;
        Arrays.sort(A);
        for (int i = 0; i < n; i++) {
            min = (min * 2) % mod;
            min = (min + A[i]) % mod;
        }

        for (int i = n - 1; i >= 0; i--) {
            max = (max * 2) % mod;
            max = (max + A[i]) % mod;
        }

        long ans = (max - min);

        if (ans < 0)
            return (int) (ans + mod);
        /*
         Why adding mod :
         because it is negative so make it positive
         as when max will be big then min but when u take mod max may become small than min due to taking modulo.
         for ex 19%5 is small than 62%5 but actually 62 iss big then 19

        * */
        else
            return (int)ans;

    }


    public static  int differenceSum2(int[] A){
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        System.out.println(differenceSum(a));
    }
}
