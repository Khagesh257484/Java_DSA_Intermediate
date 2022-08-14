/*
Q1. Count of divisors
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A, find and return the count of divisors of each element of the array.

NOTE: The order of the resultant array should be the same as the input array.



Problem Constraints
1 <= length of the array <= 100000
1 <= A[i] <= 106



Input Format
The only argument given is the integer array A.



Output Format
Return the count of divisors of each element of the array in the form of an array.



Example Input
Input 1:

 A = [2, 3, 4, 5]
Input 2:

 A = [8, 9, 10]


Example Output
Output 1:

 [2, 2, 3, 2]
Output 1:

 [4, 3, 4]


Example Explanation
Explanation 1:

 The number of divisors of 2 : [1, 2], 3 : [1, 3], 4 : [1, 2, 4], 5 : [1, 5]
 So the count will be [2, 2, 3, 2].
Explanation 2:

 The number of divisors of 8 : [1, 2, 4, 8], 9 : [1, 3, 9], 10 : [1, 2, 5, 10]
 So the count will be [4, 3, 4].

* */

/*
  Observation : It is simple observation that have to count divisor or factor of each element of the array and add each element factor
  count(Total factor of each element) in an array and return it.

* */
package com.dsa.advance.math.primenumbers;

import java.util.Arrays;

public class CountOfDivisors {

    // It is brute force approach will have TC : O(N^2)
    public int[] solve_naive(int[] A) {
        int n = A.length;
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            int a = countDivisor(A[i]);
            res[i] = a;
        }
        return res;
    }

    int countDivisor(int a) {
        int count = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5};
        int[] b = {8, 9, 10};
        CountOfDivisors cd = new CountOfDivisors();
        System.out.println(Arrays.toString(cd.solve_naive(a)));
        System.out.println(Arrays.toString(cd.solve_naive(b)));
    }
}
