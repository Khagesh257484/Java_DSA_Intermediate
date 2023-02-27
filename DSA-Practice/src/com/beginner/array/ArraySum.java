/*

Q4. Sum the Array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Write a program to print sum of elements of the input array A of size N.


Problem Constraints
1 <= N <= 1000

1 <= A <= 1000



Input Format
A list of length N



Output Format
A single integer containing sum of elements from the input array.



Example Input
Input 1:

5 1 2 3 4 5
Input 2:

4 10 50 40 80


Example Output
Output 1:

15
Output 2:

180

* */
package com.beginner.array;

import java.util.Scanner;

public class ArraySum {
    static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i]=sc.nextInt();
        }
        System.out.println(sumOfArray(a));
    }
}
