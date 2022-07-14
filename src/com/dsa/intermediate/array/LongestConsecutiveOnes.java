
package com.dsa.intermediate.array;

/*
Q1. Length of longest consecutive ones
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given a binary string A. It is allowed to do at most one swap between any 0 and 1. Find and return the length of the longest consecutive 1’s that can be achieved.


Input Format

The only argument given is string A.
Output Format

Return the length of the longest consecutive 1’s that can be achieved.
Constraints

1 <= length of string <= 1000000
A contains only characters 0 and 1.
For Example

Input 1:
    A = "111000"
Output 1:
    3

Input 2:
    A = "111011101"
Output 2:
    7
See Expected Output

* */
public class LongestConsecutiveOnes {
    public static int solve(String A) {
        int n = A.length();
        int ans = 0;
        // Counting total one in a String
        int total_one = 0;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '1') {
                total_one++;
            }
        }

        if(total_one==A.length())
            return total_one;
        //

        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == '0') {
                int lco = 0, rco = 0;
                for (int j = i - 1; j >= 0; j--) {  // Counting left One
                    if (A.charAt(j) == '1')
                        lco++;
                    else
                        break;
                }
                for (int j = i + 1; j < n; j++) {   // Counting Right One
                    if (A.charAt(j) == '1')
                        rco++;
                    else
                        break;
                }
                if (lco + rco < total_one)
                    ans = Math.max(ans, lco + rco + 1);
                else
                    ans = Math.max(ans, lco + rco);
            }

        }// Second for close
        return ans;
    }

    public static void main(String[] args) {
        String a = "111011110000000";
        System.out.println(solve(a));

        String b = "1101001110111";
        System.out.println(solve(b));
    }
}
