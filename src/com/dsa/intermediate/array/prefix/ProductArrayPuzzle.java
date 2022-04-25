package com.dsa.intermediate.array.prefix;
/*
Ques: Given an array of integers A, find and return the product array of the same size where the ith element of the product array will be equal to the product of all the elements divided by the ith element of the array.

Note: It is always possible to form the product array with integer (32 bit) values.

Input Format :
The only argument given is the integer array A.

Output Format :
Return the product array.

Constraints :
1 <= length of the array <= 1000
1 <= A[i] <= 10

For Example :
Input 1:
    A = [1, 2, 3, 4, 5]
Output 1:
    [120, 60, 40, 30, 24]

Input 2:
    A = [5, 1, 10, 1]
Output 2:
    [10, 50, 5, 50]

* */


import java.util.Arrays;

public class ProductArrayPuzzle {
    public int[] solve(int[] A){
        int n=A.length;
        int[] prod_arr=new int[n];
        //Creating prefix product array
        for(int i=0; i<n;i++){
            if(i==0)
                prod_arr[i]=A[i];
            else
                prod_arr[i]=prod_arr[i-1]*A[i];
        }

        int product=prod_arr[n-1];
        // divide product with all array elements
        for(int i=0;i<n;i++){
            A[i]=product/A[i];
        }
        return A;
    }

    public static void main(String[] args) {
 ProductArrayPuzzle arrayPuzzle=new ProductArrayPuzzle();
        int a[]={1,2,3,4,5};
        System.out.println(Arrays.toString(arrayPuzzle.solve(a)));
    }
}
