package com.ggl.practice.patterns;

import java.util.Scanner;
/*
        for n=4, & s is space here
* * * *
s * * *
s s * *
s s s *

*/
public class StarPattern4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++){ // n=4

            // Space For loop
            for(j=1;j<=i-1;j++){
                System.out.print("s ");
            }

            //  * loop
            for(k=1;k<=n-(i-1);k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
