/*
Q3. Full Numeric Pyramid
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given an integer N as input, print the corresponding Full Numeric Pyramid pattern for N.

For example if N = 5 then pattern will be like:

0 0 0 0 1 0 0 0 0
0 0 0 2 3 2 0 0 0
0 0 3 4 5 4 3 0 0
0 4 5 6 7 6 5 4 0
5 6 7 8 9 8 7 6 5

NOTE: There should be exactly one extra space after each number for each row.


Problem Constraints

2 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the Full Pyramid pattern corresponding to the given N.

NOTE:

There is no extra space before the first integer of any row.
There is an extra space after the last integer of any row.
All the integers in any row are space separated.


Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

0 1 0
2 3 2
Output 2:

0 0 1 0 0
0 2 3 2 0
3 4 5 4 3



Example Explanation

 Print the pattern as described.

* */

package com.beginner.starPatterns;

public class Pattern5HardQuestion {
    static void printPattern(int n) {
        int p1 = 0;

        for (int i = 1; i <= n; i++) { // Outer loop
            // Space loop
            for (int s = i; s < n; s++) {
                System.out.print("0 ");
            }
            // Printing number - increasing order
            for (int j = i; j <= 2 * i - 1; j++) {
                System.out.print(j + " ");
            }
            //Decreasing loop
            int dec = 2 * i - 2;
            for (int k = 2; k <= i; k++) {
                System.out.print(dec + " ");
                dec--;
            }
            // Space loop
            for (int s = i; s < n; s++) {
                System.out.print("0 ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printPattern(5);
    }
}
