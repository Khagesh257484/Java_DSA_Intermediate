package com.dsa.intermediate.subsetAndSubsequence;

import java.util.ArrayList;

public class SubsequencesSumEqualToK {
    public static int solve(int[] A, int B) {
        int n = A.length;

        for (int i = 0; i < Math.pow(2, n); i++) {
            ArrayList<Integer> al = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (i << j)) != 0) {
                    al.add(A[j]);
                }
                if (al.get(j) == B)
                    return 1;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] a = {1, 20, 13, 4, 5};
        System.out.println(solve(a,18));
    }

}
