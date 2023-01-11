/*
Q3. Palindromic Integer
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Take an integer A as input, determine whether it is palindromic or not.

A palindrome integer is an integer X for which reverse(X) = X where reverse(X) is X with its digits reversed. For e.g., reverse(123) = 321. Note : There will be no zeros at the start of a number.


Problem Constraints

1 <= A <= 106



Input Format

First and the only line contains a single integer A.



Output Format

Print Yes if it is palindromic, else print No.



Example Input

Input 1:

 120
Input 2:

 1001
Input 3:

 131


Example Output

Output 1:

 No
Output 2:

 Yes
Output 3:

 Yes


Example Explanation

Explanation 1:

 For A = 120, reverse(A) = reverse(120) = 021 = 21 (removing leading zeroes). 120 is not equal to 21
Explanation 2:

 For A = 1001, reverse(A) = reverse(1001) = 1001, which is same as A.
Explanation 3:

 For A = 131, reverse(A) = reverse(131) = 131, which is same as A.
* */

package com.beginner;

public class IsPalindromicNumber {

    public static boolean isPalindrome(int n) {
        int originalNumber = n, reverseSum = 0;
        while (n != 0) {
            int remainder = n % 10;
            reverseSum = reverseSum * 10 + remainder;
            n = n / 10;
        }
        if (reverseSum == originalNumber)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(321));

    }
}
