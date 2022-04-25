package com.dsa.beginner.basic;

import java.util.Scanner;

public class ReveseANumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rem,revSum=0;

        // n=564
        while(n>0){
            rem=n%10;
            revSum=revSum*10+rem;
            n=n/10;
        }
        System.out.println(revSum);
        System.out.println(n);
    }
}
