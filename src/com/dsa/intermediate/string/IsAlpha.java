package com.dsa.intermediate.string;

/*
Q6. Isalpha()
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved..
Get help from TA.
Problem Description

You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of the character array are alphabetical (a-z and A-Z), else return 0.



Problem Constraints

1 <= |A| <= 105



Input Format

Only argument is a character array A.



Output Format

Return 1 if all the characters of the character array are alphabetical (a-z and A-Z), else return 0.



Example Input

Input 1:

 A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y']
Input 2:

 A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Output

Output 1:

 1
Output 2:

 0


Example Explanation

Explanation 1:

 All the characters are alphabets.
Explanation 2:
 All the characters are NOT alphabets i.e ('#', '2', '0', '2', '0').
* */
public class IsAlpha {
    public int solve(char[] A) {
        if (A == null) {
            return 0;
        }
        for (int i = 0; i < A.length; i++) {
            if (!(A[i] >= 'A' && A[i] <= 'Z') && !(A[i] >= 'a' && A[i] <= 'z')) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

    }
}
