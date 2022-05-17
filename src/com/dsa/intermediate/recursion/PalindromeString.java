package com.dsa.intermediate.recursion;
/*
Q1. Check Palindrome
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Write a recursive function that checks whether string A is a palindrome or Not.
Return 1 if the string A is a palindrome, else return 0.

Note: A palindrome is a string that's the same when read forward and backward.



Problem Constraints
1 <= A <= 50000

String A consists only of lowercase letters.



Input Format
The first and only argument is a string A.



Output Format
Return 1 if the string A is a palindrome, else return 0.



Example Input
Input 1:

 A = "naman"
Input 2:

 A = "strings"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 "naman" is a palindomic string, so return 1.
Explanation 2:

 "strings" is not a palindrome, so return 0.

* */

public class PalindromeString {

    // naman
    public int solve(String A) {
        if (A.length() == 0 || A.length() == 1)   // If there is only one character in string then it will be palindromic
            return 1;
        return isPal(A, 0, A.length() - 1);
    }

    public int isPal(String s, int start, int end) {
        if (s.charAt(start) != s.charAt(end))
            return 0;
        if (end>=start )
            return isPal(s, start + 1, end - 1);

        return 1;
    }

    public static void main(String[] args) {
        PalindromeString pal = new PalindromeString();
        String s = "strings";
        System.out.println(pal.solve(s));
    }
}
