package com.ggl.practice.patterns;

import java.util.Scanner;

/*

 Question : Print below pattern for n=4;


* */
public class StarPattern2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i, j, k;

        for(i=1;i<=n;i++){

            // Space for loop
            for(j=1;j<=(n-i);j++){
                System.out.print("s "); // s for space here
            }

            // star for loop
            for(k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
