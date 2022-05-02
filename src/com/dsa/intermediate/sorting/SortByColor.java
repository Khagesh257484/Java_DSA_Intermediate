package com.dsa.intermediate.sorting;

import java.util.Arrays;

/*
Q1. Sort by Color
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved..
Get help from TA.
Problem Description
Given an array with N objects colored red, white, or blue, sort them so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent red, white, and blue, respectively.

Note: Using the library sort function is not allowed.



Problem Constraints
1 <= N <= 1000000
0 <= A[i] <= 2


Input Format
First and only argument of input contains an integer array A.


Output Format
Return an integer array in asked order


Example Input
Input 1 :
    A = [0 1 2 0 1 2]
Input 2:

    A = [0]


Example Output
Output 1:
    [0 0 1 1 2 2]
Output 2:

    [0]


Example Explanation
Explanation 1:
    [0 0 1 1 2 2] is the required order.

* */
public class SortByColor {

    /*
     Ques : Is sorting array in single loop better than sorting in more than one loop?

Sorting in a single loop, though it seems to be better, is not an efficient approach. Below are some points to be taken into consideration before using single loop sorting:

Using a single loop only helps in shorter code
The time complexity of the sorting does not change in a single loop (in comparison to more than one loop sorting)
Single loop sorting shows that number of loops has little to do with time complexity of the algorithm.

    * */

    // TC : O(N^2) SC : O(1) 
    public int[] sortColors(int[] A) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] > A[i + 1]) {
                int temp = A[i];
                A[i] = A[i + 1];
                A[i + 1] = temp;

                // updating the value of i = -1
                // so after getting updated for i++
                // in the loop it becomes 0 and
                // the loop begins from the start.

                i = -1;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        SortByColor color = new SortByColor();
        int[] a = {0, 1, 2, 0, 1, 2};
        int[] b = {5, 6, 2, -4, 3, -8, 7, -9};
        System.out.println(Arrays.toString(color.sortColors(a)));
        System.out.println(Arrays.toString(color.sortColors(b)));
    }
}
