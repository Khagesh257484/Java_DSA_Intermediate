package com.ggl.practice.patterns;

import java.util.Scanner;

/*

Question : for n=3 & s is space here
S S *
S * * *
* * * * *

* */

public class StarPattern5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k,increament=0;

        for(i=1;i<=n;i++){ //n=3
            // Space loop
            for(j=1;j<=(n-i);j++){
                System.out.print("S ");
            }
            // Star loop
            for(k=1;k<=(i+increament);k++){ // 1 3 5
                System.out.print("* ");
            }
            increament++;
            System.out.println();
        }
    }
}
