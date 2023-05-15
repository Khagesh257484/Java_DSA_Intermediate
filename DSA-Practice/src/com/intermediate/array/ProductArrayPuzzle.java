/*
Q2. Product array puzzle
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values. Solve it without using the division operator.


Input Format

The only argument given is the integer array A.
Output Format

Return the product array.
Constraints

2 <= length of the array <= 1000
1 <= A[i] <= 10
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [120, 60, 40, 30, 24]

Input 2:
    A = [5, 1, 10, 1]
Output 2:
    [10, 50, 5, 50]
* */

package com.intermediate.array;

import java.util.Arrays;

public class ProductArrayPuzzle {
    public static int[] solve(int[] arr, int[] prefixProduct, int[] suffixProduct) {
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0)
                result[i] = suffixProduct[i + 1];
            else if (i == n - 1) {
                result[i] = prefixProduct[i - 1];
            } else
                result[i] = prefixProduct[i - 1] * suffixProduct[i + 1];
        }
        return result;
    }

    public static int[] usingDivisionOperator(int[] arr) {
        int product = 1;
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            result[i]=product/arr[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        int[] prefixProduct = ArraySumFactory.prefixProductArray(arr);
        int[] suffixProduct = ArraySumFactory.suffixProductArray(arr);
        System.out.println(Arrays.toString(solve(arr, prefixProduct, suffixProduct)));
        System.out.println(Arrays.toString(usingDivisionOperator(arr)));
//        System.out.println(Arrays.toString(prefixProduct));
//        System.out.println(Arrays.toString(suffixProduct));
    }
}
