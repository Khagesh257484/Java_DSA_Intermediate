package com.dsa.intermediate.array;

import java.util.Scanner;

/*
Ques: Find the max and min number of an array
int a[]= {5,-6,-5,9,4,8,-7,10,3,11,2}

O/P =[-7,11]

*/
public class MaxMin {
    public static void maxMin(int arr[], int n) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < n; i++) {
            // Max Element
            if (arr[i] > max)
                max = arr[i];

            // Min Element
            if (arr[i] < min)
                min = arr[i];
        }

        System.out.println(max+" "+min);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        maxMin(arr, n);
        sc.close();
    }
}
