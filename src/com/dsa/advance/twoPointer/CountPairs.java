/*
Q6. Count of pairs with the given sum
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given a sorted array of distinct integers A and an integer B, find and return how many pair of integers ( A[i], A[j] ) such that i != j have sum equal to B.


Input Format

The first argument given is the integer array A.
The second argument given is integer B.
Output Format

Return the number of pairs for which sum is equal to B.
Constraints

1 <= length of the array <= 100000
1 <= A[i] <= 10^9
1 <= B <= 10^9
For Example

Input 1:
    A = [1, 2, 3, 4, 5]
    B = 5
Output 1:
    2

Input 2:
    A = [5, 10, 20, 100, 105]
    B = 110
Output 2:
    2
* */

package com.dsa.advance.twoPointer;

// 1 2 3 4 5
public class CountPairs {
    public static int solve(int[] A, int B) {
        int count = 0, i = 0, j = A.length - 1;
        while (i < j) {
            if (A[i] + A[j] == B) {
                count++;
                j--;
            } else if (A[i] + A[j] > B) {
                j--;
            } else
                i++;
        }

        return count;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(solve(a, 5));

        int[] b = {5, 10, 20, 100, 105};
        System.out.println(solve(b, 120));
        System.out.println(solve(b, 110));

    }
}
