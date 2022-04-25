package com.dsa.intermediate.bitManipulation;
/*
Problem Description
Write a function that takes an integer and returns the number of 1 bits it has.

Problem Constraints
1 <= A <= 109

Input Format
First and only argument contains integer A

Output Format
Return an integer as the answer

Example Input
Input1:
11

Example Output
Output1:
3

Example Explanation
Explaination1:
11 is represented as 1011 in binary.

* */

public class NumberOf1Bits {
    public  int SecondWay(int n){
        int count=0, x=1, num=n;
        while(num>0){
            if((n & x)!=0){
                count++;
            }
            x=x<<1;
            num=num>>1;
        }
        return count;
    }

    public int numSetBits(int A) {
        int count=0;
        for(int i=0;i<32;i++){
            if((A>>i&1)==1)
                count++;
        }

        return count;
    }

    public static void main(String[] args) {

        NumberOf1Bits number=new NumberOf1Bits();

        // Test cases : 11, 10, 406688036
        // This code will nor work for off Bit
        int count=number.numSetBits(11);
        int coutZero= number.SecondWay(11);
        System.out.println(count);
        System.out.println(coutZero);
    }
}
