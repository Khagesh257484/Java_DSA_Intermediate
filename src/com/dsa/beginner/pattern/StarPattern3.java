package com.ggl.practice.patterns;

import java.util.Scanner;

/*
Question : Print below pattern for n=4 , n can be any number

* * * *
* * *
* *
*

* */
public class StarPattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;

        for(i=1;i<=n;i++){
            // loop to print star
            for(j=1;j<=n-(i-1);j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
