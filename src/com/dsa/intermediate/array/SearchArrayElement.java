package com.dsa.intermediate.array;

import java.util.Scanner;

/*
Question : you've given integer array search kth element in array that is exits or not, if exists print 1 otherwise print 0.
For each case print result in separate line
* */
public class SearchArrayElement {
    public static void search(int arr[], int n, int k) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (k == arr[i])
                count++;
        }
        if (count == 0)
            System.out.println(0);
        else
            System.out.println(1);

    }

    // Check for optimal one
    public static boolean search_optimal(int arr[], int n, int k){
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        for (int i = 1; i <= op; i++) {           // no of Operations
            int n = sc.nextInt();                // size
            int a[] = new int[n];               // declaring an array of size n
            for (int j = 0; j < n; j++) {      //  Fetching array elements from users
                a[j] = sc.nextInt();
            }
            int k = sc.nextInt();
            search(a, n, k);
        }
    }
}
