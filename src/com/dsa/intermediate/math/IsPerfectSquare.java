package com.dsa.intermediate.math;

import java.util.Scanner;

/*
 Check given number is perfect square or not.
* */
public class IsPerfectSquare {
    public static boolean perfect_brute(int n) {
        if(n==0)
            return false;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0 && n / i == i) {
                //System.out.println(i);
                return true;
            }
        }
        return false;
    }

    // i*i=n, that means i=root n, we can divide number by 2 or we can check square of ith number equal to the number
    // perfect square can't end with digit 2 3 7 8
    public static boolean perfect_optimized(int A) {
        int last_digit=A%10;
        if(last_digit==2 || last_digit==3 || last_digit==7 || last_digit==8 || A==0){
            return false;
        }
        for (int i = 1; i*i <= A; i++) {
            if (i * i == A) {
                return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int n=4;
        int n = sc.nextInt();
        System.out.println(perfect_brute(n));
        System.out.println(perfect_optimized(n));
    }
}
