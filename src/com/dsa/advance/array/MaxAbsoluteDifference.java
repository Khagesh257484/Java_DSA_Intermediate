/*
Q1. Maximum Absolute Difference
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an array of N integers, A1, A2, .... AN.

Return the maximum value of f(i, j) for all 1 ≤ i, j ≤ N. f(i, j) is defined as |A[i] - A[j]| + |i - j|, where |x| denotes absolute value of x.



Problem Constraints
1 <= N <= 100000

-109 <= A[i] <= 109



Input Format
First argument is an integer array A of size N.



Output Format
Return an integer denoting the maximum value of f(i, j).



Example Input
Input 1:

A = [1, 3, -1]
Input 2:


A = [2]


Example Output
Output 1:

5
Output 2:

0


Example Explanation
Explanation 1:

f(1, 1) = f(2, 2) = f(3, 3) = 0
f(1, 2) = f(2, 1) = |1 - 3| + |1 - 2| = 3
f(1, 3) = f(3, 1) = |1 - (-1)| + |1 - 3| = 4
f(2, 3) = f(3, 2) = |3 - (-1)| + |2 - 3| = 5

So, we return 5.
Explanation 2:

Only possibility is i = 1 and j = 1. That gives answer = 0.
* */

package com.dsa.advance.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MaxAbsoluteDifference {
    public static int maxArr(ArrayList<Integer> A) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < A.size(); i++) {
            max1 = Math.max(max1, A.get(i) + i);

            max2 = Math.max(max2, -A.get(i) + i);
           // max2 = Math.max(max2, A.get(i) - i);

            min1 = Math.min(min1, A.get(i) + i);
            min2 = Math.min(min2, -A.get(i) + i);
            //min2 = Math.min(min2, A.get(i) - i);  // in this, just doing simple math calculation that multiply with -ve sign
        }
        //System.out.println("Max1 = " + max1 + " :: " + "Max2 = " + max2 + " :: " + "Min1 = " + min1 + " :: " + "Min2 = " + min2);
        return Math.max(max1 - min1, max2 - min2);
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, -3, 1));
        System.out.println(maxArr(list));


    }
}
