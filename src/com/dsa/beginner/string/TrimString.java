package com.company.java.dsa.string;

/*
 You are given a character string A. You to trim(remove) both leading and trailing asterisk characters('*') in the string and return the resultant string.

 Input : A = "**h*e*l*lo*"
 Output : h*e*l*l*o

* */
public class TrimString {
    public static void main(String[] args) {
        String s = "**h*e*l*lo*";
        int length = s.length();
        String s1 = s.replaceAll("[*]", " ");
        String s2 = s1.trim();
       // System.out.println(s2);
        String s3=s2.replaceAll(" ","*");
        System.out.println(s3);



    }
}
