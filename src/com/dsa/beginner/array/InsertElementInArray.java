package com.company.java.dsa.array;

import java.util.Scanner;

public class InsertElementInArray {
    public static int[] insertElementInArray(int[] arr, int position, int element) {
        int[] newArr = new int[arr.length + 1];
        for (int i = 0; i <=arr.length; i++) {
            if (i < position - 1) {
                newArr[i] = arr[i];
            } else if (i == position - 1) {
                newArr[i] = element;
            } else {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int position=sc.nextInt();
        int element=sc.nextInt();

       int[]a= insertElementInArray(arr,position,element);

        // printing array
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
