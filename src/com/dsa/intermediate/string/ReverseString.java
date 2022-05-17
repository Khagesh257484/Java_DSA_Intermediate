package com.dsa.intermediate.string;
/*
Q1. Reverse the String
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved..
Get help from TA.
Problem Description
You are given a string A of size N.

Return the string A after reversing the string word by word.

NOTE:

A sequence of non-space characters constitutes a word.
Your reversed string should not contain leading or trailing spaces, even if it is present in the input string.
If there are multiple spaces between words, reduce them to a single space in the reversed string.


Problem Constraints
1 <= N <= 3 * 105



Input Format
The only argument given is string A.



Output Format
Return the string A after reversing the string word by word.



Example Input
Input 1:
    A = "the sky is blue"
Input 2:
    A = "this is ib"


Example Output
Output 1:
    "blue is sky the"
Output 2:
    "ib is this"


Example Explanation
Explanation 1:
    We reverse the string word by word so the string becomes "the sky is blue".
Explanation 2:
    We reverse the string word by word so the string becomes "this is ib".

* */

import java.util.Arrays;
import java.util.regex.Pattern;

public class ReverseString {
    public String solve(String A) {
        Pattern pattern = Pattern.compile("\\s");            // (\\s : is used to compile white space)
        String[] s = pattern.split(A);               // Split String on the basis of given Pattern
        String reverse = "";

        for (int i = 0; i < s.length; i++) {
            if (i == s.length - 1)
                reverse = s[i] + reverse;
            else
                reverse = " " + s[i] + reverse;
        }

        return reverse;
    }

    public static void main(String[] args) {

        ReverseString reverse = new ReverseString();
        String s = "The Sky is blue";
        System.out.println(reverse.solve(s));
    }
}
