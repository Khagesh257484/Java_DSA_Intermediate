package com.company.java.dsa.pattern;

import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper pyramid Pattern
        for (int i = 1; i <= n; i++) {  // n=3 , space= 2 1
            // Space Loop
            for (int j = i; j < n; j++) {
                System.out.print("S ");
            }

            // star loop , n=3 : 1,3,5
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower pyramid pattern n=3, space= 1, 2(increment by one ) , star= 3 1 (decrement by 2 )
        for(int i=n-1;i>=1;i--){
            // Space loop : 1 2
            for(int j=1;j<=n-i;j++){ // i=3-1=2,j=3-i=3-1=2
                System.out.print("S ");
            }
            // Star print
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
