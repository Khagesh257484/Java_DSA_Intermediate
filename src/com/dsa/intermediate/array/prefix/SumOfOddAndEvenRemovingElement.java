package com.dsa.intermediate.array.prefix;

/*
Q2. Count ways to make sum of odd and even indexed elements equal by removing an array element
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array, arr[] of size N, the task is to find the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Problem Constraints
1 <= n <= 105
-105 <= A[i] <= 105


Input Format
First argument contains an array A of integers of size N


Output Format
Return the count of array indices such that removing an element from these indices makes the sum of even-indexed and odd-indexed array elements equal.



Example Input
Input 1:
A=[2, 1, 6, 4]
Input 2:

A=[1, 1, 1]


Example Output
Output 1:
1
Output 2:

3


Example Explanation
Explanation 1:
Removing arr[1] from the array modifies arr[] to { 2, 6, 4 } such that, arr[0] + arr[2] = arr[1].
Therefore, the required output is 1.
Explanation 2:

Removing arr[0] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Removing arr[1] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Removing arr[2] from the given array modifies arr[] to { 1, 1 } such that arr[0] = arr[1]
Therefore, the required output is 3.

* */

import java.util.Arrays;

public class SumOfOddAndEvenRemovingElement {
    public int[] even_Sum(int[] A) {
        int[] psEven = new int[A.length];
        psEven[0] = A[0];
        for (int i = 1; i < A.length; i++) {
            if (i % 2 == 0)
                psEven[i] = psEven[i - 1] + A[i];
            else
                psEven[i] = psEven[i - 1];
        }
        return psEven;

    }

    public int[] odd_sum(int[] A) {
        int[] psOdd = new int[A.length];
        psOdd[0] = 0;
        for (int i = 1; i < A.length; i++) {
            if (i % 2 != 0)
                psOdd[i] = psOdd[i - 1] + A[i];
            else
                psOdd[i] = psOdd[i - 1];
        }
        return psOdd;
    }

        public int solve (int[] A){
            int[] psEvenSum = even_Sum(A);
            int[] psOddSum = odd_sum(A);
            int count = 0, sumE = 0, sumO = 0, n = A.length;
            for (int i = 1; i < A.length; i++) {
               /* if (i == 0) {
                    sumE = psEvenSum[n - 1] - psEvenSum[i];
                    sumO = psOddSum[n - 1] - psOddSum[i];
                } else {
                    sumE = psEvenSum[i - 1] + psOddSum[n - 1] - psOddSum[i];
                    sumO = psOddSum[i - 1] + psEvenSum[n - 1] - psEvenSum[i];
                }*/
                sumE = psEvenSum[i - 1] + psOddSum[n - 1] - psOddSum[i];
                sumO = psOddSum[i - 1] + psEvenSum[n - 1] - psEvenSum[i];
                if (sumE == sumO) {
                    count++;
                }

            }
            return count;

        }

        public static void main (String[]args){
            SumOfOddAndEvenRemovingElement removingElement = new SumOfOddAndEvenRemovingElement();
            int[] a = {2, 1, 6, 4};
            System.out.println(removingElement.solve(a));
        }
    }
