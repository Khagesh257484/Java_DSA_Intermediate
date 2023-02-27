/*
Q2. Remove that
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Write a program to input N numbers array from user and an integer X and print the array by deleting element at specified position X.

Problem Constraints

1 <= N <= 100

1 <= A[i] <= 1000

1 <= X <= N

Input Format

First line is N which means number of elements.

Second line contains N space separated integers.

Third line is X position which has to be deleted.
Output Format

N-1 space separated integers of the input array after deleting the element at required position.
Example Input

5
2 3 1 4 2
3
Example Output

2 3 4 2
Example Explanation

Clearly after removing A[3] = 1, remaining array is 2 3 4 2.

* */

package com.beginner.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class DeleteElementFromArray {
    static int[] deleteElementInArray(int[] arr, int pos) {
        int[] res = new int[arr.length - 1];
        for (int i = 0; i < res.length; i++) {
            if (i < pos - 1)
                res[i] = arr[i];
            else if (i == pos - 1) {
                continue;
            }
            else {
                res[i-1] = arr[i];
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 4, 2};
        int[] result = deleteElementInArray(arr, 3);
        System.out.println(Arrays.toString(result));

        int[] arr1={1,2,3,4,5,6,7,8};
        int[] rs=deleteElementInArray(arr1,4);
        System.out.println(Arrays.toString(rs));
    }
}
