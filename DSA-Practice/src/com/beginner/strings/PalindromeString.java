/*
Q4. Is is Palindrome? - II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You have a string (A) and you have to return 1 if it is palindrome otherwise return 0.



Problem Constraints
1 <= A.size() <= 1000



Input Format
First argument containing a lowercase string A.



Output Format
You have to return either 0 or 1 as per the question.



Example Input
Input 1:

abcba
Input 2:

axax
Input 3:

abba


Example Output
Output 1:

1
Output 2:

0
Output 3:

1


Example Explanation
Explanation 1:

Clearly, all characters of abcba from backward is similar with characters from forward.
Explanation 2:

Clearly, all characters of axax from backward is not similar with characters from forward.
Explanation 3:

Clearly, all characters of abba from backward is similar with characters from forward.

* */
package com.beginner.strings;

public class PalindromeString {
    static boolean palindrome(String s) {  // Using StringBuilder

        StringBuilder sb = new StringBuilder("");
        for (int i = s.length() - 1; i >= 0; i--) {
            sb.append(s.charAt(i));
        }
        if (sb.toString().equals(s))
            return true;
        else
            return false;
    }

    static boolean palindrome2(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(palindrome2("abc"));
        System.out.println(palindrome2("abcba"));
    }
}
