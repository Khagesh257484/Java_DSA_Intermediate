/*
Q2. Equilibrium index of an array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given an array A of integers of size N.

Your task is to find the equilibrium index of the given array

The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.

NOTE:

Array indexing starts from 0.
If there is no equilibrium index then return -1.
If there are more than one equilibrium indexes then return the minimum index.



Problem Constraints
1 <= N <= 105
-105 <= A[i] <= 105


Input Format
First arugment is an array A .


Output Format
Return the equilibrium index of the given array. If no such index is found then return -1.


Example Input
Input 1:
A=[-7, 1, 5, 2, -4, 3, 0]
Input 2:

A=[1,2,3]


Example Output
Output 1:
3
Output 2:

-1


Example Explanation
Explanation 1:
3 is an equilibrium index, because:
A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
Explanation 1:

There is no such index.

* */

package com.dsa.intermediate.array.prefix;

public class EquilibriumIndex {

    // Brute force Approach
    public int bruteForce(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            int f = i, k = i, last = n - 1, leftSum = 0, rightSum = 0;
            while (f > 0) {
                leftSum += A[f - 1];
                f--;
            }
            while (k < last) {
                rightSum += A[k + 1];
                k++;
            }
            if (leftSum == rightSum) {
                return i;
            }

        }

        return -1;
    }

    public int usingPrefixSum(int[] A) {
        /*
         1) First create the prefix sum but ques is that how can we check prefix sum
             So what was the logic in brute force , that was if left sum=right sum then it is eql index.
             leftSum+RightSum=TotalSum

         2) Same logic we will apply here.
            find left sum : ps[i]-A[i]
                 totalSum=ps[n-1];
                 right sum : totalSum-ps[i]

        **/
        int n = A.length;
        int[] ps = new int[n];

        for (int i = 0; i < n; i++) {  // Will give prefix sum
            if (i == 0)
                ps[i] = A[i];
            else
                ps[i] = ps[i - 1] + A[i];
        }

        int totalSum = ps[n - 1];
        for (int i = 0; i < n; i++) {
            int leftsum = ps[i] - A[i];
            int righSum = totalSum - ps[i];
            if (leftsum == righSum)
                return i;
        }

        return -1;
    }

    public static void main(String[] args) {

        EquilibriumIndex ei = new EquilibriumIndex();
        int[] a = {-7, 1, 5, 2, -4, 3, 0};
        System.out.println(ei.usingPrefixSum(a));

        int[] b = {0, 1, 3, -2, -1};
        System.out.println(ei.usingPrefixSum(b));

        int[] c = {1, 2, -2, -1};
        System.out.println(ei.usingPrefixSum(c));

        int[] d = {1, 2, 5, 4, -1, -1, -2, 5, -1, 2, 12, -6};
        System.out.println(ei.usingPrefixSum(d));

    }
}
