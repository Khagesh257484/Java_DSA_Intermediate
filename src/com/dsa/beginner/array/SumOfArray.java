package com.ggl.practice.array;

import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array_size= sc.nextInt();

        // Declaring size of an array
        int a[]=new int[array_size];

        // Taking input from user for each array element
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }

        // Traversing the array element and find sum of array elements
        int array_sum=0;
        for(int i=0;i<a.length;i++){
            array_sum=a[i]+array_sum;
        }
        System.out.println(array_sum);
    }
}
