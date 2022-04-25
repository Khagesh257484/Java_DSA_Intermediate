package com.ggl.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class SeperateOddAndEven {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();

        for (int i = 1; i <= operation; i++) {
            int array_size = sc.nextInt();
            int[] arr = new int[array_size];

            int evenSize = 0;
            int oddSize = 0;

            // Taking array element from user and checking even & odd
            for (int j = 0; j < array_size; j++) {
                arr[j] = sc.nextInt();
                if (arr[j] % 2 == 0) {
                    evenSize++;
                } else {
                    oddSize++;
                }
            }

            // Creating array Even and Odd size
            int[] even_array = new int[evenSize];
            int[] odd_array = new int[oddSize];
//            System.out.println("Even array length : " + even_array.length);
//            System.out.println("Odd array length : " + odd_array.length);
//            System.out.println(Arrays.toString(arr));

            // Iterating odd and even value
            int k = 0, l = 0;
            for (int m = 0; m < arr.length; m++) {
                if (arr[m] % 2 == 0) {
                    even_array[k] = arr[m];
                    k++;
                } else {
                    odd_array[l] = arr[m];
                    l++;
                }
            }
            printArray(odd_array);
            printArray(even_array);

        }
    }
}
