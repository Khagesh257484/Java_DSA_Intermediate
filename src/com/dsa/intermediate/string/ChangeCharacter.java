/*
Q3. Change character
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a string A of size N consisting of lowercase alphabets.

You can change at most B characters in the given string to any other lowercase alphabet such that the number of distinct characters in the string is minimized.

Find the minimum number of distinct characters in the resulting string.



Problem Constraints
1 <= N <= 100000

0 <= B < N



Input Format
The first argument is a string A.

The second argument is an integer B.



Output Format
Return an integer denoting the minimum number of distinct characters in the string.



Example Input
A = "abcabbccd"
B = 3

Example Output
2

Example Explanation
We can change both 'a' and one 'd' into 'b'.So the new string becomes "bbcbbbccb".
So the minimum number of distinct character will be 2.

* */

package com.dsa.intermediate.string;

import java.util.Arrays;
import java.util.HashSet;

public class ChangeCharacter {

    // This code will change only linear 3 character
    public static int changeLinearCharacter(String A, int B) {
        char[] ch = A.toCharArray();
        HashSet hs = new HashSet();
        char check = ch[0];
        int count = 0;
        for (int i = 1; i < ch.length; i++) {
            if (count <= B && ch[i] != check) {
                ch[i] = check;
                count++;
            }
        }

        for (int i = 0; i < ch.length; i++) {
            hs.add(ch[i]);

        }
        return hs.size();
    }

    // This method will work
    public static int ChangeCharacter(String A, int B) {
        int[] charArry = new int[26];
        int count = 0, dist = 0;
        if (B == 0)
            return A.length();
        for (int i = 0; i < A.length(); i++) {
            charArry[A.charAt(i) - 'a']++;
            if (charArry[A.charAt(i) - 'a'] == 1)
                dist++;

        }

        System.out.println('a'-'a');
        System.out.println(dist);
        System.out.println(Arrays.toString(charArry));
        Arrays.sort(charArry);
        System.out.println(Arrays.toString(charArry));

        for (int i = 0; i < charArry.length; i++) {
            if (charArry[i] == 0)
                continue;
            if (charArry[i] > B)
                break;
            dist--;
            B = B - charArry[i];

        }
        return dist;

    }

    public static void main(String[] args) {
        System.out.println(changeLinearCharacter("abcabbccd", 3));

    }

    /*
     String s = "abacbcdedf";
        char[] ch = s.toCharArray();     // Convert into charArray
        s = s.replace('a', 'k');        // Replace all a character with k
        System.out.println(s);
        s=s.replaceFirst("b","m");     // Replace only first occurrence of character b
        System.out.println(s);
        s=s.replaceFirst("b","m");   // Replace First occurrence of character b
        System.out.println(s);
        Character.toString(s.charAt(2));
    * */
}
