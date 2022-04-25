package com.ggl.practice.array;

import java.util.Scanner;

public class MaxAndMinOfArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array_size=sc.nextInt();
        // Declaring size an array
        int []a=new int[array_size];
        // taking user input from the user for each array elements
        for(int i=0;i<a.length;i++){
             a[i]=sc.nextInt();    // [i]a : can't declare, will give an error
        }

        // Declaring variable and assigning value
        int max_number = 0;
        int min_number=a[0];
        for(int i=0;i<a.length;i++){

            // Condition for max number
            if(a[i] >max_number) {
                max_number = a[i];
            }else if(a[i]<min_number){
                min_number=a[i];
            }

        }
        System.out.println(max_number+" "+min_number);

    }
}
