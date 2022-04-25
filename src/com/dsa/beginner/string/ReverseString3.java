package com.company.java.dsa.string;

import java.util.Scanner;

/*
 I/P : Programming is fun
 O/P : gnimmargorP si nuf
* */
public class ReverseString3 {

    // Same thing can be done by reverse() function of StringBuilder Class
    static String reverseString(String s) {
        String reverse = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        return reverse;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        //  String s="Programming is fun";
        String[] strArr = s.split(" ");
        String reverseWord = "";
        for (int i = 0; i < strArr.length; i++) {
            String reverse = reverseString(strArr[i]);
            reverseWord += reverse + " ";
        }
        System.out.println(reverseWord.trim());   // trim : using to remove starting and end space.
    }
}
