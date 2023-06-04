/*
Q2. Add Binary Strings
Solved
Hint bulb icon
Stuck somewhere?
Using hints is now penalty free
Check Now
Problem Description
Given two binary strings A and B. Return their sum (also a binary string).


Problem Constraints
1 <= length of A <= 105

1 <= length of B <= 105

A and B are binary strings



Input Format
The two argument A and B are binary strings.



Output Format
Return a binary string denoting the sum of A and B



Example Input
Input 1:
A = "100"
B = "11"
Input 2:
A = "110"
B = "10"


Example Output
Output 1:
"111"
Output 2:
"1000"


Example Explanation
For Input 1:
The sum of 100 and 11 is 111.
For Input 2:

The sum of 110 and 10 is 1000.
* */

package com.intermediate.bitManipulation;

public class AddBinaryNumbers {

        public static String addBinaryStrings(String A, String B) {
        int a = A.length(), b = B.length(), carry = 0, i = 0;
        String result = "";

        while (i < a || i < b || carry != 0) {
            // String A's last digit
            int x = 0;
            if (i < a && A.charAt(a -1-i) == '1')
                x = 1;

            // String B's last element
            int y = 0;
            if (i < b && B.charAt(b - 1 - i) == '1')
                y = 1;

            result = (x + y + carry) % 2 + result;
            carry = (x + y + carry) / 2;
            i++;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(addBinaryStrings("110", "10"));
    }
}
