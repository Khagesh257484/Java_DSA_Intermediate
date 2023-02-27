/*
Q2. Vowels vs Consonants - II
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given lowercase string (A) and you have to tell the count of vowels and consonants in it.



Problem Constraints
1 <= A.size() <= 1000



Input Format
First and only argument containing a lowercase string A.



Output Format
You have to return an array of two elements representing count of vowels and consonants in the input string respectively.



Example Input
Input 1:

interviewbit
Input 2:

scaler


Example Output
Output 1:

[5 7]
Output 2:

[2 4]


Example Explanation
Explanation 1:

Clearly, interviewbit has 4 vowels and 7 consonants.
Explanation 2:

Clearly, scaler has 2 vowels and 4 consonants.



See Expected Output
* */

package com.beginner.strings;

import java.util.Arrays;

public class VowelConstantsCount {
    static int[] countVowelsConstant(String s) {
        int[] result = new int[2];
        int constants = 0, vowels = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                vowels++;
            } else {
                constants++;
            }
        }
        result[0] = vowels;
        result[1] = constants;
        return result;
    }

    public static void main(String[] args) {
        String s = "InterViEWBIt";
        int[] ans=countVowelsConstant(s);
        System.out.println(Arrays.toString(ans));
    }
}
