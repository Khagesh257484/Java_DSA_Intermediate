/*
Q1. Special Subsequences "AG"
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.

NOTE: Return the answer modulo 109 + 7 as the answer can be very large.



Problem Constraints
1 <= length(A) <= 105



Input Format
First and only argument is a string A.



Output Format
Return an integer denoting the answer.



Example Input
Input 1:

 A = "ABCGAG"
Input 2:

 A = "GAB"


Example Output
Output 1:

 3
Output 2:

 0


Example Explanation
Explanation 1:

 Subsequence "AG" is 3 times in given string
Explanation 2:

 There is no subsequence "AG" in the given string.

* */

package com.intermediate.array;

public class SpecialStringSubsequence {
    public static int solve_bruteForce(String A) {
        char[] ch = A.toCharArray();
        int pair = 0;
        for (int i = 0; i < A.length(); i++) {
            for (int j = i + 1; j < A.length(); j++) {
                if (ch[i] == 'a' && ch[j] == 'g')
                    pair++;
            }
        }
        return pair;
    }

    public static int solve_optimized(String A) {
        int a_count = 0, pairCount = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == 'a')
                a_count++;
            else if (A.charAt(i) == 'g') {
                pairCount += a_count;
            }
        }
        return pairCount;
    }

    public static void main(String[] args) {
        String s = "acgdgag";
        System.out.println(solve_bruteForce(s));
        System.out.println(solve_optimized(s));

    }
}
