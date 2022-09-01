/*
Q4. MaxMod
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array A of size N, Groot wants you to pick 2 indices i and j such that

1 <= i, j <= N
A[i] % A[j] is maximum among all possible pairs of (i, j).
Help Groot in finding the maximum value of A[i] % A[j] for some i, j.



Problem Constraints
1 <= N <= 100000
0 <= A[i] <= 100000



Input Format
First and only argument in an integer array A.



Output Format
Return an integer denoting the maximum value of A[i] % A[j] for any valid i, j.



Example Input
Input 1:

 A = [1, 2, 44, 3]
Input 2:

 A = [2, 6, 4]


Example Output
Output 1:

 3
Output 2:

 4


Example Explanation
Explanation 1:

 For i = 3, j = 2  A[i] % A[j] = 3 % 44 = 3.
 No pair exists which has more value than 3.
Explanation 2:

 For i = 2, j = 1  A[i] % A[j] = 4 % 6 = 4.
* */

package com.dsa.advance.sorting;

public class MaxMod {

    // As per mod property if A%B will be maximum if A < B & A and B will be maximum possible value
    // Suppose you've 2 value in array and as per above point A and B will be maximum possible value and A < B
    // that  means A should be  second largest in the array & that is my answer.

    // Then find first and second largest  in array

    /*
    1) If n==1 & n==0 : return 0;

2) If all array elements are same then also answer will be zero.

3) if A%B will be max if A < B and A & B are maximum possible.
    10 % 20 = 20 & 10 < 20
	that means A should be second largest value of array. It is the answer( Second largest value of the array )

4) So what can we do, we can sort the array the return the second largest value of the array.
    * */

    // Approach 1 : You can do this using 2 for loop
    // Approach 2 : Sort the array and return second largest in array

    // Approach 3 :
    public static int solve(int[] A) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > first) {
                second = first;
                first = A[i];
            } else if (second < A[i] && A[i] != first) {
                second = A[i];
            }
        }
        if (second == Integer.MIN_VALUE)
            return 0;
        else
            return second;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 44, 3};
        int[] b = {2, 6, 4};
        int[] c = {44, 4, 2, 92, 9};
        int[] d = {927, 707, 374, 394, 279, 799, 878, 937, 431, 112};
        System.out.println(solve(a));
        System.out.println(solve(b));
        System.out.println(solve(c));
        System.out.println(solve(d));
    }
}
