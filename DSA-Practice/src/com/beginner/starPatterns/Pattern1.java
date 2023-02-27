/*
Q1. Stair Pattern
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Take an integer N as input, print the corresponding stair pattern for N.

For example if N = 4 then stair pattern will be like:

*
**
***
****

Problem Constraints

1 <= N <= 100



Input Format

First and only line of input contains a single integer N.



Output Format

Output the stair pattern corresponding to the given N.



Example Input

Input 1:

 2
Input 2:

 3


Example Output

Output 1:

 *
 **
Output 2:

 *
 **
 ***


Example Explanation

 Print the pattern as described.

* */

package com.beginner.starPatterns;

import java.util.Scanner;

public class Pattern1 {
    static void printPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                //System.out.print("* ");
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern(n);
    }

}
