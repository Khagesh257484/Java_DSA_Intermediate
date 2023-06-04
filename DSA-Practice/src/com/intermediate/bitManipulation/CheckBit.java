/*
 Question : For a given number check that ith bit is ON or OFF , if on return true else false

 Ex 1: n=21 , i=2     Output :: true
 Ex 2 : n=34 , i =3   Output :: False
* */

package com.intermediate.bitManipulation;

public class CheckBit {
    public static boolean checkBit(int n,int i){
        if(((n>>i)&1)==1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkBit(21,2));
        System.out.println(checkBit(10,0));
        System.out.println(checkBit(34,3));
    }
}
