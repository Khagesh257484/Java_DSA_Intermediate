/*
Q1. Little Ponny and 2-Subsequence
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Little Ponny has been given a string A, and he wants to find out the lexicographically minimum subsequence from it of size >= 2. Can you help him?

A string a is lexicographically smaller than string b, if the first different letter in a and b is smaller in a. For example, "abc" is lexicographically smaller than "acc" because the first different letter is 'b' and 'c' which is smaller in "abc".





Problem Constraints

1 <= |A| <= 105

A only contains lowercase alphabets.



Input Format

The first and the only argument of input contains the string, A.



Output Format

Return a string representing the answer.



Example Input

Input 1:

 A = "abcdsfhjagj"
Input 2:

 A = "ksdjgha"


Example Output

Output 1:

 "aa"
Output 2:

 "da"


Example Explanation

Explanation 1:

 "aa" is the lexicographically minimum subsequence from A.
Explanation 2:

 "da" is the lexicographically minimum subsequence from A.
* */


/*
   Lexicographically means dictionary order....
*/

package com.dsa.intermediate.subsetAndSubsequence;

public class Lexicographically {
    public static String solve(String A) {
        String s = "";
        int index = 0;
        char ch = A.charAt(0);
        for (int i = 1; i < A.length() - 1; i++) {
            if (A.charAt(i) < ch) {
                ch = A.charAt(i);
                index = i;
            }
        }

        char ch2 = A.charAt(1);
        for (int i = index + 1; i < A.length(); i++) {
            if (A.charAt(i) < ch2)
                ch2 = A.charAt(i);
        }
        return s + ch + ch2;
    }

    public static void main(String[] args) {
        System.out.println(solve("abcdsfhjagj"));
        System.out.println(solve("ksdjgha"));
        System.out.println(solve("epujxwjiad"));  // ad

    }
}
