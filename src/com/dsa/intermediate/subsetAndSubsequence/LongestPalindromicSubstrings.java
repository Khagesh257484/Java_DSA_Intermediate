/*
Q7. Longest Palindromic Substring
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A of size N, find and return the longest palindromic substring in A.

Substring of string A is A[i...j] where 0 <= i <= j < len(A)

Palindrome string:
A string which reads the same backwards. More formally, A is palindrome if reverse(A) = A.

Incase of conflict, return the substring which occurs first ( with the least starting index).



Problem Constraints
1 <= N <= 6000



Input Format
First and only argument is a string A.



Output Format
Return a string denoting the longest palindromic substring of string A.



Example Input
A = "aaaabaaa"


Example Output
"aaabaaa"


Example Explanation
We can see that longest palindromic substring is of length 7 and the string is "aaabaaa".
* */

package com.dsa.intermediate.subsetAndSubsequence;

public class LongestPalindromicSubstrings {
    public String longestPalindrome(String A) {
        int n = A.length();
        String ans = "";
        String s1 = "";
        String s2 = "";
        for (int i = 0; i < A.length(); i++) {
            s1 = check_palindrome(A, i, i);          // Odd length
            s2 = check_palindrome(A, i, i + 1);   // Even length

            if (s1.length() > ans.length())
                ans = s1;

            if (s2.length() > ans.length())
                ans = s2;

        }
        return ans;
    }

    private String check_palindrome(String a, int i, int j) {
        while (i >= 0 && j < a.length()) {
            if (a.charAt(i) != a.charAt(j))
                break;
            i--;
            j++;
        }
        int startIndex = i++;
        int endIndex = j;
        return a.substring(i, j);
    }

    public static void main(String[] args) {
        LongestPalindromicSubstrings ls = new LongestPalindromicSubstrings();
        System.out.println(ls.longestPalindrome("abb"));

    }
}
