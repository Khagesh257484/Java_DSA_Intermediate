package com.company.java.dsa.string;
/*
 I/P : Programming is fun
 O/P : gnimmargorP si nuf
* */
public class ReverseString4 {
    public static void main(String[] args) {
        String s="My Name is Khagesh Sharma";
        String []strArray=s.split(" ");
        String reverseWord="";
        for(int i=0;i< strArray.length;i++){
            StringBuilder sb=new StringBuilder(strArray[i]);
            reverseWord+=sb.reverse()+" ";
            sb=null;
        }
        System.out.println(reverseWord);
    }
}
