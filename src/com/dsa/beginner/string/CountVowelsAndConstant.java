package com.company.java.dsa.string;

import java.util.Arrays;

/*
You are given lowercase string (A) and you have to tell count of vowels and consonants in it.
Input : interviewbit
Output : [5 7]
* */
public class CountVowelsAndConstant {
    public static int[] solve(String A) {
        int[] count = new int[2];
        char[] ch = A.toCharArray();
        int vowel = 0, consonants = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' || ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') {
                vowel++;
            }
            else{
                consonants++;
            }
        }
        count[0]=vowel;
        count[1]=consonants;

        return count;
    }

    public static void main(String[] args) {
       int a[]=solve("interviewbit");
        System.out.println(Arrays.toString(a));
    }
}
