package com.company.java.dsa.basic;

/*

Reverse Sum
Given an integer, find the sum of the number and its reverse.
Example Input:
N = 536
Example Output:
1171
Explanation:
536 + 635 = 1171


* */
public class ReverseSum {

    public static void reverseSum(int number){
        // 536 , 635 , reverseSum=536+635=1171
        int originalNumber=number;
        int reverseNumber=0,remainder;
        while(number!=0){
            remainder=number%10;
            reverseNumber=reverseNumber*10+remainder;
        }

    }

    public static void main(String[] args) {

    }
}
