package com.company.java.dsa.string;

import java.util.Arrays;
/*
   If original String is equals to reverse string then it will be Palindrome String
      s1.equals(reversedString);
**/
public class PalindormeString {

    // First way to solve
    public static int solve(String A) {
        String reverse = "";
        for (int i = A.length() - 1; i >= 0; i--) {
         reverse+=A.charAt(i);
        }
        if(reverse.equals(A)){
            return 1;
        }else{
            return 0;
        }
    }

    // Second way to solve
    public static int secondWay(String A){
        int i=0,j=A.length()-1;
        while(i<j){
            if(A.charAt(i)!=A.charAt(j)){
                return 0;
            }
            i++;
            j--;
        }
        return 1;
    }

    public static void main(String[] args) {
        String s = "abba";
        System.out.println(solve(s));
        System.out.println(secondWay(s));


    }
}

/*
*
* */