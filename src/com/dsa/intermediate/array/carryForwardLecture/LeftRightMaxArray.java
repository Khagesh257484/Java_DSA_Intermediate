package com.dsa.intermediate.array.carryForwardLecture;
/*
Question : For given an array build left and right max array.
Input:
    int a[]={-3,6,2,4,5,2,8,-9}

Output :
   LeftMaxArray  : {-3,6,6,6,6,6,8,8}
   RightMaxArray : {8,8,8,8,8,8,8,-9}

Observation :

1) Check first 2 element from left and find which one is max
2) Check max and next element and find which one is max.
3) Replace element with the max value

* */

import java.util.Arrays;

public class LeftRightMaxArray {

    public int[] leftRightMaxArray(int[] A, boolean leftMax, boolean rightMax) {
        int n = A.length;
        if (leftMax) {
            int[] lm = new int[n];
            for (int i = 0; i < n; i++) {
                if (i == 0)
                    lm[i] = A[i];
                else
                    lm[i] = Math.max(lm[i - 1], A[i]);
            }
            return lm;
        }
        else if (rightMax) {
            int[] rm = new int[n];
            for (int i = n - 1; i >= 0; i--) {
                if (i == (n - 1))
                    rm[n - 1] = A[n - 1];
                else
                    rm[i] = Math.max(rm[i + 1], A[i]);
            }
            return rm;
        }

        return null;
    }

    public static void main(String[] args) {
        LeftRightMaxArray lm = new LeftRightMaxArray();
        int[] a = {-3, 6, 2, 4, 5, 2, 8, -9};
        System.out.println(Arrays.toString(lm.leftRightMaxArray(a, false, true)));

        int[] b = {-3, 6, 2, 4, 5, 2, -9};
        System.out.println(Arrays.toString(lm.leftRightMaxArray(b, false, true)));
    }
}
