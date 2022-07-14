package com.dsa.intermediate.Hashing;
/*
Q3. Colorful Number
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a number A, find if it is COLORFUL number or not.

If number A is a COLORFUL number return 1 else, return 0.

What is a COLORFUL Number:

A number can be broken into different contiguous sub-subsequence parts.
Suppose, a number 3245 can be broken into parts like 3 2 4 5 32 24 45 324 245.
And this number is a COLORFUL number, since product of every digit of a contiguous subsequence is different.


Problem Constraints
1 <= A <= 2 * 109



Input Format
The first and only argument is an integer A.



Output Format
Return 1 if integer A is COLORFUL else return 0.



Example Input
Input 1:

 A = 23
Input 2:

 A = 236


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 Possible Sub-sequences: [2, 3, 23] where
 2 -> 2
 3 -> 3
 23 -> 6  (product of digits)
 This number is a COLORFUL number since product of every digit of a sub-sequence are different.
Explanation 2:

 Possible Sub-sequences: [2, 3, 6, 23, 36, 236] where
 2 -> 2
 3 -> 3
 6 -> 6
 23 -> 6  (product of digits)
 36 -> 18  (product of digits)
 236 -> 36  (product of digits)
 This number is not a COLORFUL number since the product sequence 23  and sequence 6 is same.



See Expected Output

* */


import java.util.HashSet;

/*

 int a= 236;

 1) need to find out subsequence: it can be 2 3 6 23 26 36 236  (A sub array can be subsequences but subseq can't be sub array )

 2) Using module technique we can find last digit which is 2 3 6 but how can be find out 23 26 236 , so for this we can use same technique but
 in different way

 3) We will use hashset data structure here cause hashset does not contain any duplicate value, so if contains then return false.
   As per question if product of digit can exist in subsequence then it will not a colorful number.

   and it is product of digit so have to store product of digit in hashset

* */
public class ColorfulNumbers {
    public static void main(String[] args) {
        System.out.println(colorful(23));
        System.out.println(colorful(236));
        System.out.println(colorful(436));
    }

    public static int colorful(int A) {
        int sum = 1, originalNumber = A;

        HashSet<Integer> hs = new HashSet();
        while (A > 0) {
            int r = originalNumber % 10;
            sum *= r;

            if (hs.contains(sum))
                return 0;
            else
                hs.add(sum);

            originalNumber = originalNumber / 10;
            if (originalNumber == 0) {
                A = A / 10;
                originalNumber = A;
                sum = 1;
            }
        }

        return 1;
    }


}
