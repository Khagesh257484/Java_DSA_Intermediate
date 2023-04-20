package com.intermediate.array.L2;

import java.util.Scanner;

public class EvenOddElementSum {


    // Version 1
    /*
     This Process taking N time to complete the task in worst case and q time for query
     TC : O(NQ)
    * */
    public static int elementSum_BruteForce(int start, int end, String type, int[] arr) {
        int sum = 0;
        if (type.equalsIgnoreCase("odd")) {
            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) {
                    sum = sum + arr[i];
                }
            }
        } else {
            for (int i = start; i <= end; i++) {
                if (i % 2 == 0)
                    sum = sum + arr[i];
            }
        }
        return sum;
    }

    // Version 2
    /*
     1) Create Even Prefix Sum and Odd Prefix Sum
     2) Check start and end index i.e. odd or even and type
     3) Then Perform operation using formula, No need to find the sum by traversing array from start to end.
    * */

    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 6, 5, 4};
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of Query .. ");
        int query = sc.nextInt();
        for (int i = 0; i < query; i++) {
            System.out.println("Enter start index");
            int start = sc.nextInt();
            System.out.println("Enter end index");
            int end = sc.nextInt();
            System.out.println("Enter Type : Only Odd or Even");
            String type = sc.next();

            // Version 1 : Brute Force : TC= O(N^2)
            int sum = elementSum_BruteForce(start, end, type, arr);
            System.out.println(sum);


//            int[] evenSum=ArrayFactory.createEvenIndexPrefixSum(arr,arr.length);
//            int[] oddSum=ArrayFactory.createOddIndexPrefixSum(arr,arr.length);
        }

    }
}
