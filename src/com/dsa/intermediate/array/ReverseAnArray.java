package com.dsa.intermediate.array;

import java.util.Arrays;

public class ReverseAnArray {

    public static int swapNumbers(int a, int b){
        int temp=a;
        a=b;
        b=temp;
        System.out.println("a :"+a+" -- b :"+b);
        return b;
    }
    public static void main(String[] args) {
        int a[] ={1,3,4,5,11,6,7,8};
        int j=a.length-1;
        int i=0;
        while(i<j){
          //  a[i]=swapNumbers(a[i],a[j]);
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(a));
    }
}
