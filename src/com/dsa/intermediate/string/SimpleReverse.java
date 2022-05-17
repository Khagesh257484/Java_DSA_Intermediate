package com.dsa.intermediate.string;

/*
Q2. Simple Reverse
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved..
Get help from TA.
Problem Description

Given a string A, you are asked to reverse the string and return the reversed string.



Problem Constraints

1 <= |A| <= 105

String A consist only of lowercase characters.



Input Format

First and only argument is a string A.



Output Format

Return a string denoting the reversed string.



Example Input

Input 1:

 A = "scaler"
Input 2:

 A = "academy"


Example Output

Output 1:

 "relacs"
Output 2:

 "ymedaca"


Example Explanation

Explanation 1:

 Reverse the given string.

 * */
public class SimpleReverse {

    // First way but TLE
    public String solve1(String A) {
        String reverse = "";
        for (int i = A.length() - 1; i >= 0; i--) {
            reverse += A.charAt(i);
        }
        return reverse;
    }

    // Second Way to revese but again TLE
    public String solve2(String A) {
        String reverse = "";
        char ch;
        for (int i = 0; i < A.length(); i++) {
            ch = A.charAt(i);
            reverse = ch + reverse;
        }
        return reverse;
    }

    // Third Way : Converting String into CharArray then using swap
    public String solve3(String A) {
        char[] s = A.toCharArray();
        int n = A.length();
        for (int i = 0; i < n / 2; i++) {
            char tmp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = tmp;
        }
        return new String(s);
    }

    // Fourth Way : Using StringBuilder
    public String solve4(String A) {
       StringBuilder sb=new StringBuilder(A);
       return sb.reverse().toString();
    }

    public static void main(String[] args) {
        SimpleReverse reverse = new SimpleReverse();
        String s = "Khagesh";
        System.out.println(reverse.solve4(s));
    }
}
