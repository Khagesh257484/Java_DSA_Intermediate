package com.company.java.dsa.string;

/*
   Reverse a sentence in String and also word should be reversed with exact space.
   I/P : String s="My Name is Khagesh Sharma";
   O/P : amrahS hsegahK si emaN yM
* */

public class ReverseString2 {

    public static String reverseString(String s){
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        return reverse.trim();    // trim method will remove starting and ending space
    }
    public static void main(String[] args) {

        String s="My Name is Khagesh Sharma";
        System.out.println(reverseString(s));

    }
}
