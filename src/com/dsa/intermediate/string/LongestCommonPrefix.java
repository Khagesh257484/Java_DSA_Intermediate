/*
Q5. Longest Common Prefix
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given the array of strings A, you need to find the longest string S, which is the prefix of ALL the strings in the array.

The longest common prefix for a pair of strings S1 and S2 is the longest string S which is the prefix of both S1 and S2.

Example: the longest common prefix of "abcdefgh" and "abcefgh" is "abc".



Problem Constraints
0 <= sum of length of all strings <= 1000000



Input Format
The only argument given is an array of strings A.



Output Format
Return the longest common prefix of all strings in A.



Example Input
Input 1:

A = ["abcdefgh", "aefghijk", "abcefgh"]
Input 2:

A = ["abab", "ab", "abcd"];


Example Output
Output 1:

"a"
Output 2:

"ab"


Example Explanation
Explanation 1:

Longest common prefix of all the strings is "a".
Explanation 2:

Longest common prefix of all the strings is "ab".


* */

package com.dsa.intermediate.string;

public class LongestCommonPrefix {

    // https://www.interviewbit.com/blog/longest-common-prefix/

    public static String longestCommonPrefix(String[] A) {
        if (A.length == 0)
            return "";
        String prefix = A[0];
        for (int i = 1; i < A.length; i++)
            while (A[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        return prefix;
    }

    public static void main(String[] args) {

        String[] A = {"abcdefgh", "aefghijk", "abcefgh"};
        String[] B = {"abab", "ab", "abcd"};
        System.out.println(longestCommonPrefix(A));
        System.out.println(longestCommonPrefix(B));
    }
}
