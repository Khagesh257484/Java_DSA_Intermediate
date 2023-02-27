/*
Q1. Insert that
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Write a program to input N numbers array, a number X and a number Y from user and insert an element Y in it at specified position X. X is based on 1-based indexing.

Note: When an element is inserted at position X, all elements that were already present at position >= X, gets shifted to one position right, not replaced.

Problem Constraints

1 <= N <= 100

1 <= A[i] <= 1000

1 <= X <= N

1 <= Y <= 1000

Input Format

First line is N which represents number of elements.

Second line contains N space separated integers.

Third line is X position where Y has to be inserted.

Fourth line is Y which is the value to be inserted.

Output Format

N+1 space separated integers of the input array after inserting the element at required position.

Example Input

Input 1:

5

2 3 1 4 2

3

5

Example Output

Output 1:

2 3 5 1 4 2

Example Explanation

Explanation 1:

Clearly after inserting 5 at 3rd position, new array is 2 3 5 1 4 2.

* */
package com.beginner.array;

import java.util.Arrays;

public class InsertInArray {
    static int[] insertElementInArray(int[] arr, int element, int pos) {
        int[] resultArray = new int[arr.length + 1];

        for (int i = 0; i < resultArray.length; i++) {
            if (i < pos) {
                resultArray[i] = arr[i];
            } else if (i == pos) {
                resultArray[i] = element;
            } else {
                resultArray[i] = arr[i-1];
            }
        }
        return resultArray;
    }

    // In scaler version it is 1 based indexing, so element will insert at actual index(position -1)
    static int[] insertElementInArray2(int[] arr, int pos, int element) {
        int[] resultArray = new int[arr.length + 1];

        for (int i = 0; i < resultArray.length; i++) {
            if (i < pos-1) {
                resultArray[i] = arr[i];
            } else if (i == pos-1) {
                resultArray[i] = element;
            } else {
                resultArray[i] = arr[i-1];
            }
        }
        return resultArray;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 6};
       // System.out.println(Arrays.toString(arr));

        int[] result=insertElementInArray(arr,8,3);
        System.out.println(Arrays.toString(result));

        // 2nd test cases
        int[] a={2,3,1,4,2};
        int[] result2=insertElementInArray2(a,3,5);
        System.out.println(Arrays.toString(result2));

    }

}
