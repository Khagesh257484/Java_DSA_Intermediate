/*
Q4. Reverse the Array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a constant array A.

You are required to return another array which is the reversed form of the input array.



Problem Constraints
1 <= A.size() <= 10000

1 <= A[i] <= 10000



Input Format
First argument is a constant array A.



Output Format
Return an integer array.



Example Input
Input 1:

A = [1,2,3,2,1]
Input 2:

A = [1,1,10]


Example Output
Output 1:

 [1,2,3,2,1]
Output 2:

 [10,1,1]


Example Explanation
Explanation 1:

Reversed form of input array is same as original array
Explanation 2:

Clearly, Reverse of [1,1,10] is [10,1,1]
* */

package com.intermediate.array;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArray(final int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 2, 6};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
}
