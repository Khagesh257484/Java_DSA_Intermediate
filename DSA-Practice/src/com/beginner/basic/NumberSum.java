/*
Q3. Number Sum
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Write a function that takes a positive number A as an argument and returns the sum of all numbers from 1 to A.


Problem Constraints
1 <= A <= 109


Input Format
The first argument is a single integer A.


Output Format
Return a single integer that is the sum of all numbers from 1 to A.


Example Input
Input 1:
A = 4
Input 2:

A = 10


Example Output
Output 1:
7
Output 2:

55


Example Explanation
Explanation 1:
1 + 2 + 3 + 4 = 7
Explanation 2:

1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 55



See Expected Output
* */

package com.beginner.basic;

import java.util.Scanner;

public class NumberSum {
    public static int sum(int A){
        int sum=0;
        for(int i=1;i<=A;i++){
            sum+=i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=sum(20);
        System.out.println(sum);
    }
}
