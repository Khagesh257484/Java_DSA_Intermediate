package com.company.java.dsa.pattern;

import java.util.Scanner;

/*
  Print below pattern for n=5

0 0 0 0 1 0 0 0 0
0 0 0 2 3 2 0 0 0
0 0 3 4 5 4 3 0 0
0 4 5 6 7 6 5 4 0
5 6 7 8 9 8 7 6 5

* */
public class FullNumericPyramidPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {  // Outer loop or main loop, will run based on your rows

            // Space Loop
            for(int space=i;space<n;space++){
                System.out.print("0"+" ");
            }
            // Increase loop
            for (int j = i; j <= 2*i-1; j++) {
                System.out.print(j + " ");
                /*
                *  1st iteration : i=1, (i-1)
                * */
            }
            // decrease loop
            int dec=2*i-2;
            for(int k=2;k<=i;k++){
                System.out.print(dec+" ");
                dec--;
            }
            // Space Loop
            for(int space=i;space<n;space++){
                System.out.print("0"+" ");
            }

            System.out.println();
        }


    }
}
