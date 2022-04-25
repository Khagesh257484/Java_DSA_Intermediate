package com.company.java.dsa.string;

public class ReverseString {

    public static String reverseString(String s){
        if(s==null || s.length()==0){
            return "String can't be null or it should contain at least one charecter";
        }
        String reverse="";
        for(int i=s.length()-1;i>=0;i--){
            reverse+=s.charAt(i);
        }
        return reverse;
    }

    public static String reverseStringSecondWay(String s){
        char []ch=s.toCharArray();
        char []chn=new char[ch.length];
        int i=0, j=chn.length-1,k=0;
        while(k<=j){                     // s="Khagesh"
            chn[i]=ch[j];
            j--;
            i++;
        }
        String s1=new String(chn);
        return s1;
    }

    public static void main(String[] args) {
        String s="Khagesh ";
       String s1=reverseStringSecondWay(s);
        System.out.println(s1);
    }
}
