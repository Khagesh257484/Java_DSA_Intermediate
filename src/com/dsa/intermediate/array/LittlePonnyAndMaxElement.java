package com.dsa.intermediate.array;
/*
 Question : Little Ponny is given an array, A, of N integers. In a particular operation, he can set any element of the array equal to -1.
He wants your help in finding out the minimum number of operations required such that the maximum element of the resulting array is B. If it is not possible, then return -1.

Ex:
Input 1:
 A = [2, 4, 3, 1, 5]
 B = 3
Output 1: 2

Input 2: A = [1, 4, 2]
 B = 3
Output 2: -1

Observation :
1) Have to check how many elements is greater than the Bth element
2) have to check that this element is exists or not for that have to check same thing with if conditions.


* */

public class LittlePonnyAndMaxElement {
    public static int solve(int[] A, int B) {   // TC= O(N), SC=O(1)
        int n = A.length, count = 0, exist = 0;
        for (int i = 0; i < n; i++) {
            // Checking b exists or not
            if (A[i] == B) {
                exist++;
            }
            if (A[i] > B) {
                count++;
            }
        }

        if (exist >= 1 && count >= 1) {
            return count;
        }
        return -1;
    }


    public static void main(String[] args) {

        int a[] = {24, 33, 13, 11, 30, 28, 19, 8, 30, 25, 42, 6, 30, 49, 3, 49, 24, 13, 3, 50};
        int b = 13;
        System.out.println(solve(a, b));

        int a1[] = {1, 4, 2, 6, 7};
        int b1 = 3;
        System.out.println(solve(a1, b1));
    }
}
