/*
Q2. Maximum & Minimum Magic
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A of size N where N is even.

Divide the array into two subsets such that

1.Length of both subset is equal.
2.Each element of A occurs in exactly one of these subset.
Magic number = sum of absolute difference of corresponding elements of subset.

Note: You can reorder the position of elements within the subset to find the value of the magic number.

For Ex:-
subset 1 = {1, 5, 1},
subset 2 = {1, 7, 11}
Magic number = abs(1 - 1) + abs(5 - 7) + abs(1 - 11) = 12
Return an array B of size 2, where B[0] = maximum possible value of Magic number modulo 109 + 7, B[1] = minimum possible value of a Magic number modulo 109 + 7.



Problem Constraints
1 <= N <= 105

-109 <= A[i] <= 109

N is even



Input Format
The first argument given is the integer array A.



Output Format
Return an array B of size 2, where B[0] = maximum possible value of Magic number % 109 + 7,B[1] = minimum possible value of a Magic number % 109 + 7.



Example Input
Input 1:

 A = [3, 11, -1, 5]
Input 2:

 A = [2, 2]


Example Output
Output 1:

 [14, 10]
Output 2:

 [0, 0]


Example Explanation
Explanation 1:

 All possible magical numbers:-
 sub1 = {3, 11}, sub2 = {-1, 5}, Magic Number = abs(3 - -1) + abs(11 - 5) = 10
 sub1 = {3, -1}, sub2 = {11, 5}, Magic Number = abs(3 - 11) + abs(-1 - 5) = 14
 sub1 = {3, 5}, sub2 = {11, -1}, Magic Number = abs(3 - 11) + abs(5 - -1) = 14
 sub1 = {11, -1}, sub2 = {3, 5}, Magic Number = abs(11 - 3) + abs(-1 - 5) = 14
 sub1 = {11, 5}, sub2 = {3, -1}, Magic Number = abs(11 - 3) + abs(5 - -1) = 14
 sub1 = {-1, 5}, sub2 = {3, 11}, Magic Number = abs(-1 - 3) + abs(5 - 11) = 10
 maximum of all magic number = 14 % 10^9 + 7 = 14
 minimum of all magic number = 10 % 10^9 + 7 = 10
Explanation 2:

 Answer is evident.
* */

// Approach :
/*
    int[] A={3, 11, -1, 5}

    -> We need to check the sum of absolute difference of all possible subset

   ->  First sort the array : {-1,3,5,11}
    Possible subset of n/2 length
        [-1,3],[5,11] = 6+8=14
     &  [-1,5],[3,11] =4+6=10
      & [11,-1],[3,5] =8+6=14
       and all reverse subset of these 3 subsets like
       [5,11],[-1,3] =6+8=14
    & [3,11],[5,-1] = 2+12=14
    & [3,5],[-1,11] = 4+6=10

      Max =14 & Min=10

 -> Finding all and store all subset is more complicated and tedious task, so think another way

 -> We know that min is 10 and max 14 , if we subtract  distance element and add them then we will get the Max.
     For example:

     Get Max :   -1 & 11 has long distanced element, subtract then will get 12
                 and 3 & 5 is second long distance element, subtract then will get 2 & sum of 12+2=14

      Get Min :  To get min subtract small distance element and add them & each adjacent element is small distance element.
                 (-1-3) + (5-11) = 4+6 =10

 */
package com.dsa.advance.sorting;

import java.util.Arrays;

public class MaxMinMagic {
    public static int[] solve(int[] A) {
        int n = A.length;
        long max = 0, min = 0;
        long mod = 1000000007;

        // Sort the Array :
        Arrays.sort(A);

        // Get Max : To get max read array till N/2
        for (int i = 0; i < n/ 2; i++) {
            max = max + Math.abs(A[i] - A[n - i-1]);
            max = max % mod;
        }

        // Get Min : increment i by 2, cause at a time we will calculate the difference of 2
        for (int i = 0; i < n; i+=2) {
            min = min + Math.abs(A[i] - A[i + 1]);
            min = min % mod;
        }

        // create Array B of sieze 2
        int[] rseult = new int[2];
        rseult[0] = (int) max;
        rseult[1] = (int) min;

        return rseult;
    }

    public static void main(String[] args) {
        int[] A={3,11,-1,5};
        System.out.println(Arrays.toString(solve(A)));
    }
}
