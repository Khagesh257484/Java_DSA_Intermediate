package com.dsa.intermediate.array;

import java.util.Arrays;
import java.util.Scanner;

/*
  Ques : Take an integer array from the user and separate odd and even number from the array and return odd and even number in separete array
Example :



* */
public class SeperateOddEven2 {

    public static void oddAndEvenElements(int[] A, int[] even, int[] odd) {
        // Edge cases
        if (A.length == 0)
            System.out.println("Array can't be empty");
        else if (even.length == 0)
            System.out.println(0);
        else if (odd.length == 0)
            System.out.println(0);

        // Storing odd and even elements in odd and even array
        int ev = 0, od = 0;
        for (int i = 0; i < A.length; i++) {  // TC : O(N)
            if (A[i] % 2 == 0) {
                even[ev] = A[i];
                ev++;
            } else if(A[i]%2 !=0) {
                odd[od] = A[i];
                od++;
            }

        }

        // Printing Odd and Even array elements
        for(int i=0;i<even.length;i++){
            System.out.print(even[i]+" ");
        }
        System.out.println();

        // Printing odd
        for(int i=0;i< odd.length;i++){
            System.out.print(odd[i]+" ");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  // 2 Operations
        for (int i = 0; i < t; i++) {   // TC : O(t)
            int n = sc.nextInt();
            int a[] = new int[n];      // SC : O(N)
            int even = 0, odd = 0;
            for (int j = 0; j < n; j++) {  // TC : O(N)
                a[j] = sc.nextInt();
                if (a[j] % 2 == 0)
                    even++;
                else
                    odd++;
            }  // Array for

            int[] evenArray = new int[even];      // SC : O(N)
            int[] oddArray = new int[odd];       // SC : O(N)

            // Calling method
            oddAndEvenElements(a, evenArray, oddArray);

        } // Operation for
    }
}
