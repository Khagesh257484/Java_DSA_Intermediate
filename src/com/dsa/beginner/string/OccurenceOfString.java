package com.company.java.dsa.string;

/*
You are given two character strings A and B.
You have to find the first occurrence of string B in string A, as a substring, and return the starting position of first occurrence.
A substring is a contiguous sequence of characters within a string. For e.g "at" is a substring in "catalogue".

 A = "aabababaa"
 B = "ba"

* */
public class OccurenceOfString {
    public static int solve(String A, String B) {
        int a = A.indexOf(B);
        if (a >= 0)
            return a + 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        String A = "aabababaa";
        String B = "ba";
        System.out.println(solve(A, B));
    }
}
