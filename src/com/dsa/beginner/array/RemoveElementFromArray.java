package com.company.java.dsa.array;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static int[] removeElement(int[] arr, int element) {
        int[] newArr = new int[arr.length - 1];
        element=element-1;
        for (int i = 0; i < arr.length; i++) {
            if (i < element) {
                newArr[i] = arr[i];
            } else if (i == element) {
                continue;
            } else {
                newArr[i - 1] = arr[i];
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
        int idex=sc.nextInt();
        int[] a=removeElement(arr,idex);
       // System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
