package com.dsa.intermediate.array;

/*
 Question : In given integer array find the second largest number

 A= {2,4,6,8,5,9,11,14,16,7,18,3}

 Ans : Sec_Largest= 16
* */
public class SecondLargetElement {
    public static int solve(int[] A) {
        int n = A.length; // Taking n variable cause it is some faster than a.length; Time complexity of a.length=O(1)
        // Edge cases
        if (n < 1) {
            return -1;
        }

        int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            // Checking for max number
            if (A[i] > max1) {
                max2 = max1;
                max1 = A[i];
            }
            // suppose max number comes more than 1 times in an array then above logic will fail so have to check it for this.
            if (A[i] > max2 && A[i] < max1) {
                max2 = A[i];
            }
        }
        if (max2 > 1)
            return max2;

        return -1;
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 13, 9, 18, 13, 14, 16, 13, 18, 3};

        int a1[]={4,4,4,4,4};
        System.out.println(solve(a));
        System.out.println(solve(a1));

    }
}
