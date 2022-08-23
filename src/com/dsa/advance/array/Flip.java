/*
Q1. Flip
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a binary string A(i.e., with characters 0 and 1) consisting of characters A1, A2, ..., AN. In a single operation, you can choose two indices, L and R, such that 1 ≤ L ≤ R ≤ N and flip the characters AL, AL+1, ..., AR. By flipping, we mean changing character 0 to 1 and vice-versa.

Your aim is to perform ATMOST one operation such that in the final string number of 1s is maximized.

If you don't want to perform the operation, return an empty array. Else, return an array consisting of two elements denoting L and R. If there are multiple solutions, return the lexicographically smallest pair of L and R.

NOTE: Pair (a, b) is lexicographically smaller than pair (c, d) if a < c or, if a == c and b < d.



Problem Constraints
1 <= size of string <= 100000



Input Format
First and only argument is a string A.



Output Format
Return an array of integers denoting the answer.



Example Input
Input 1:

A = "010"
Input 2:

A = "111"


Example Output
Output 1:

[1, 1]
Output 2:

[]


Example Explanation
Explanation 1:

A = "010"

Pair of [L, R] | Final string
_______________|_____________
[1 1]          | "110"
[1 2]          | "100"
[1 3]          | "101"
[2 2]          | "000"
[2 3]          | "001"

We see that two pairs [1, 1] and [1, 3] give same number of 1s in final string. So, we return [1, 1].
Explanation 2:

No operation can give us more than three 1s in final string. So, we return empty array [].
* */


package com.dsa.advance.array;

import java.util.Arrays;

public class Flip {

    public static int[] flip(String A) {
        int curr = 0, max = 0, l = 0, r = 0;

        // Create answer list to return it, initially we are setting -1 to left and right value.
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        // Convert 1 to -1 and 0 to 1, curr variable will help in this
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '1')
                curr--;
            else
                curr++;

            //  Using Kadane's algo here
            if (curr > max) {
                ans[0] = l + 1;
                ans[1] = r + 1;
                max = curr;
            }
            if (curr < 0) {
                curr = 0;
                l = i + 1;
                r = i + 1;
            } else
                r++;
        }
        if(max==0)
            return new int[0];
        else
            return ans;
    }


    public static void main(String[] args) {
        //int[] a={1,1,0,1,1};
//        int[] a = {1, 1, 1, 0};
//        System.out.println((a));
        System.out.println(Arrays.toString(flip("110110")));
    }
}
