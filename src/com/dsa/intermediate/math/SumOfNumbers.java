package com.dsa.intermediate.math;

import java.util.Scanner;

/*
 Ques : Find sum of n natural number and n will be user input.  find for int, if range is not specified then find for long.

 Time Complexity : We always check time complexity for the large inputs.

* */
public class SumOfNumbers {
    // Brute force Approach
    public static int sum_brute(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }

    // Optimized way
    public static int sum_optimized(int n){
        return (n*(n+1)/2);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sum_brute(n));
        System.out.println(sum_optimized(n));
    }
}
