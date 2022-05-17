package com.dsa.intermediate.recursion;

import java.util.Scanner;
/*
Q4. Print reverse string
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
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
public class ReverseString {
    /*
     Substring method of String class will help here. What this method does. This method basically remove the character from string zero to given length.
     String s="Khagesh";
     System.out.println(s.substring(1));   // hagesh : remove from 0 to 1
     System.out.println(s.substring(3));   // gesh : Remove from 0 to 3

     String s="Khagesh";
     remove k and append this in end : hagesh+k , New String will be hageshk
      How can we append, charAt(0) method will help it to append

    * */

    public static String reverse(String s){
        if(s==null || s.length()<=1)
            return s;
        else
            return reverse(s.substring(1))+s.charAt(0);
    }

    public static String reverse2(String s){
        if(s==null || s.length()<=1)
            return s;
        else
            return s.charAt(s.length()-1)+reverse2(s.substring(0,s.length()-1));

    }

    public static void main(String[] args) {
        /*Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(reverse(s));*/

        String s="Scaler";
        System.out.println(reverse2(s));

//        System.out.println(s.charAt(s.length()-1));
//        System.out.println(s.substring(0,s.length()-1)+s.charAt(0));


    }
}
