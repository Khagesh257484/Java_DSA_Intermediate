package com.company.java.dsa.string;

public class SplitString {
    public static void main(String[] args) {

        // We can split a string like blow technique. either on the basis of space or any special character
        String s="My Name is Khagesh Sharma";
        String []strArray=null;
        strArray=s.split(" ");

        for(int i=0;i< strArray.length;i++){
            System.out.println(strArray[i]);
        }

    }
}
