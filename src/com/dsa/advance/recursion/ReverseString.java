/*
Q4. Print reverse string

Problem Description
Write a recursive function that, given a string S, prints the characters of S in reverse order.

Problem Constraints
1 <= |s| <= 1000

Input Format
First line of input contains a string S.

Output Format
Print the character of the string S in reverse order.

Example Input
Input 1:
 scaleracademy

Input 2:
 cool

Example Output
Output 1:
 ymedacarelacs

Output 2:
 looc

Example Explanation
Explanation 1:

 Print the reverse of the string in a single line.

* */

package com.dsa.advance.recursion;

import java.util.Scanner;

public class ReverseString {
    static void reverse(String str) {
        if ((str == null) || (str.length() <= 1))
            System.out.println(str);
        else {
            System.out.print(str.charAt(str.length() - 1));
            reverse(str.substring(0, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        reverse(s);
    }
}
