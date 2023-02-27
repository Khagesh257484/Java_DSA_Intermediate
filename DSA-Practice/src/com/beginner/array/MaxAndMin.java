/*
Q3. Max and Min of an Array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Write a program to print maximum and minimum elements of the input array A of size N. The only line of the input would contain a single integer N that represents the length of the array followed by the N elements of the input array A.

Problem constraints

1 <= N <= 1000

1 <= A <= 1000


Input Format

The first line contains a single integer N representing the length of the array A followed by N elements of the array A.


Output Format

A single line output containing two space-separated integers.
The first integer is the maximum value of the array.
The second integer is the minimum value of the array.


Example Input

Input 1:
5 1 2 3 4 5
Input 2:
4 10 50 40 80

Example Output

Output 1:
5 1
Output 2:
80 10
Note: There is no space after the minimum value in the output format. There is only a single space between the maximum and minimum value.


* */

package com.beginner.array;

public class MaxAndMin {
    static void maxMin(int[] arr) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max)
                max = arr[i];
        }
        System.out.println(max+" "+min);
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6};
        maxMin(a);

        int[] b={4,8,7,9,21,34,21,2,5,6,8,92,89,87,78};
        maxMin(b);

        int[] c={2,2,2,2,2,2};
        maxMin(c);
    }
}
