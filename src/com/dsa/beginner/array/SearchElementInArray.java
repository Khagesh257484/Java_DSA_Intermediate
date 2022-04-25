package com.ggl.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class SearchElementInArray {

    public static int searchElementInArray(int[] arr, int element){
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                count++;
            }
        }
        if(count>0){
            return 1;
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
       /* int []arr={10,20,30,3,7,6,9,11,14,18};
        int element=6;
       int foundElement= searchElementInArray(arr,element);
        System.out.println(foundElement);*/

        /*for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                count++;
            }
        }

        if(count>0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
*/

        // With user input

        Scanner sc=new Scanner(System.in);
        int operation=sc.nextInt();

        for(int i=1;i<=operation;i++){
            int array_size= sc.nextInt();
            int []arr=new int[array_size];

            // Taking input from user
            for(int j=0;j<array_size;j++){
                arr[j]=sc.nextInt();
            }

            int element=sc.nextInt();
           int elementFound= searchElementInArray(arr,element);
            System.out.println(elementFound);
        }
    }
}
