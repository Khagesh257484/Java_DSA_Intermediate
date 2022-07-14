/*
Q3. Find subsequence
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given two strings A and B, find if A is a subsequence of B.

Return "YES" if A is a subsequence of B, else return "NO".


Input Format

The first argument given is the string A.
The second argument given is the string B.
Output Format

Return "YES" if A is a subsequence of B, else return "NO".
Constraints

1 <= lenght(A), length(B) <= 100000
'a' <= A[i], B[i] <= 'z'
For Example

Input 1:
    A = "bit"
    B = "dfbkjijgbbiihbmmt"
Output 1:
    YES

Input 2:
    A = "apple"
    B = "appel"
Output 2:
    "NO"

* */

package com.dsa.intermediate.subsetAndSubsequence;

public class FindSubsequences {
    public static String subsequenceInAnotherString(String A, String B) {
        if (checkSubsequences(A, B, A.length(), B.length()))
            return "YES";
        else
            return "NO";
    }

    public static boolean checkSubsequences(String A, String B, int m, int n) {
        if (m == 0)
            return true;
        if (n == 0)
            return false;
        if (A.charAt(m - 1) == B.charAt(n - 1))
            return checkSubsequences(A, B, m - 1, n - 1);

        return checkSubsequences(A, B, m, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(subsequenceInAnotherString("Apple", "Appel"));
        System.out.println(subsequenceInAnotherString("bit", "dfbtkjijgbbiihbmmt"));
        System.out.println(subsequenceInAnotherString("bit", "tdfbtkjijgbbiihbmm"));

    }
}
