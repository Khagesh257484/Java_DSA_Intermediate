/*
Q3. Check Palindrome - II
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A consisting of lowercase characters.

Check if characters of the given string can be rearranged to form a palindrome.

Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Problem Constraints
1 <= |A| <= 105

A consists only of lower-case characters.



Input Format
First argument is an string A.



Output Format
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Example Input
Input 1:

 A = "abcde"
Input 2:

 A = "abbaee"


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No possible rearrangement to make the string palindrome.
Explanation 2:

 Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.
*/

// Solution Approach
/*
Check if characters of the given string can be rearranged to form a palindrome.

Ex : 1 -> s="ab" :
          ba != ab

Ex 2 - > s="aab"
         aba == aba  :: Freq of a=2 and b=1

Ex 3 -> s="aabbc"
         abcba = abcba  :: Freq of a=2, b=2 & c=1

Ex 4 -> s="abbaee"
          aebbea==aebbea  :: Freq of a=2,b=2,e=2

		if we add c
		  aebcbea==aebcbea :: Freq of a=2,b=2,e=2, c=1



Approach :

  1) Convert string into freq map

  2) Check freq characters as per above explanation, if any characters freq is greater than one then it can't be rearranged.
     & if all characters freq is odd then it also can't be rearranged.

  3) if in given string one characters with freq one and rest of characters freq is even then it can be rearranged.

* */

package com.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class Palindrome2 {
    // Package and class name can't be same
    public int solve(String A) {
        // Base Case
        if (A.length() == 1) {
            return 1;
        }

        // Creating Frequency Map.
        HashMap<String, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            if (!hm.containsKey(A.charAt(i) + "")) {
                hm.put(A.charAt(i) + "", 1);
            } else {
                hm.put(A.charAt(i) + "", hm.get(A.charAt(i) + "") + 1);
            }
        }

        // Checking Frequency concept as per approach.
        int len = A.length();
        int oddCount = 0;

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (len % 2 == 0) {
                if (entry.getValue() % 2 != 0)
                    return 0;
            } else {
                if (entry.getValue() % 2 != 0) {
                    oddCount++;
                }
                if (oddCount > 1) {
                    return 0;
                }
            }
        }

        return 1;
    }

    // Another Good Solution
    public static int solve2(String A) {
        int[] freq = new int[26];
        for (int i = 0; i < A.length(); i++)
            freq[A.charAt(i) - 97]++;
        int odd = 0;
        for (int a : freq)
            if (a % 2 == 1)
                odd++;
        if (odd > 1)
            return 0;
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(solve2("abcde"));
        System.out.println(solve2("aabbcddd"));
        System.out.println(solve2("aabbcdd"));
    }
}
