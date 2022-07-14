/*
Q1. Kth Symbol
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row A and index B, return the Bth indexed symbol in row A. (The values of B are 1-indexed.) (1 indexed).



Problem Constraints
1 <= A <= 20

1 <= B <= 2A - 1



Input Format
First argument is an integer A.

Second argument is an integer B.



Output Format
Return an integer denoting the Bth indexed symbol in row A.



Example Input
Input 1:

 A = 2
 B = 1
Input 2:

 A = 2
 B = 2


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 Row 1: 0
 Row 2: 01
Explanation 2:

 Row 1: 0
 Row 2: 01

* */

package com.dsa.intermediate.recursion;

// https://leetcode.com/problems/k-th-symbol-in-grammar/discuss/2105415/single-line-JAVA-recursive-sol-with-summarized-explanation
public class KthSymbol {
    public static int solve2(int A, int B) {
        if (A == 1 && B == 1)
            return 0;
        int mid = (int) Math.pow(2, A - 1) / 2;
        if (B <= mid)
            return solve2(A - 1, B);
        else
            return solve2(A - 1, B - mid) ^ 1;
    }

    public int solve(int A, int B) {
        return findInx(A - 1, B - 1);

    }

    // https://leetcode.com/problems/k-th-symbol-in-grammar/discuss/2160326/Detailed-and-Easy-to-Undestand-Recursive-solution
    public int findInx(int A, int B) {
        if (A == 0)
            return 0;

        int num = findInx(A - 1, B / 2);
        return B % 2 == 0 ? num : (num == 1 ? 0 : 1);
    }

    public static void main(String[] args) {
        KthSymbol k = new KthSymbol();
        System.out.println(k.solve(2, 1));
        System.out.println(k.solve(2, 2));

        System.out.println(solve2(2, 1));
        System.out.println(solve2(2, 2));
    }
}
