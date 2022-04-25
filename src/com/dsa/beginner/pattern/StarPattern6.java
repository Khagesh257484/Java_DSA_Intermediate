package com.ggl.practice.patterns;

import java.util.Scanner;

/*

* * * * *
S * * *
S S *

**/
public class StarPattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int i,j,k,increment=0;

        System.out.println("Let's do it first, put concentrate on this problem, break in to small part.");
        
        for(i=n;i>=1;i--){

            // Space Loop
            for(j=1;j<=(n-i);j++){
                System.out.print("S ");
            }

            // Star loop
            for(k=1;k<=(2*i-1);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
