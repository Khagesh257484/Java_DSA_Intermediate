/*
Q2. Special Subsequences "AG"
Unsolved
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

package com.dsa.intermediate.subsetAndSubsequence;

public class SpecialSubsequences {

    // Note : In case of modulo, take always long data type
    public int solve(String A) {
        long n = A.length();
        long count_a = 0;
        long ans = 0;
        int mod = (int) Math.pow(10, 9) + 7;
        for (long i = 0; i < n; i++) {
            if (A.charAt((int) i) == 'A') {
                count_a++;
            } else if (A.charAt((int) i) == 'G') {
                ans =(ans+ count_a)%mod;
            }
        }
        return (int) ans %mod;
    }
}
