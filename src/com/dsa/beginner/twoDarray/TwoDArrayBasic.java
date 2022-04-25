package com.ggl.practice.twoDarray;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrayBasic {

    public static void twoDArrayBasic(int arr[][]) {
        System.out.println("The length oof matrices is equal to number of rows available in your matrices.... : " + arr.length);

        // Length of arrays in 2D array
        System.out.println("First Array length : " + arr[0].length);
        System.out.println("Second Array length : " + arr[1].length);
        System.out.println("Third Array length : " + arr[2].length);

        // find element from specific index [row][column] : That means from which row which column you want to read
        //[0][3], [0][1], [2][2],[1][1]
        System.out.println("Element at position [0][3] : " + arr[0][3]);
        System.out.println("Element at position [0][1] : " + arr[0][1]);
        System.out.println("Element at position [2][2] : " + arr[2][2]);
        System.out.println("Element at position [1][1] : " + arr[1][1]);

        // Adding matrix elements
        int i = arr[2][2] + arr[0][1];
        System.out.println("Adding matrix elements : "+i);

        // Check to avoid ArrayIndexOutOfBound Exception at run time
        int number = 8;
        if (number > arr[0].length) {
            System.out.println("Number can't be greater than your array length");
        }
    }

    public static void print2dArrayInOneLine(int arr[][]){
        // will print like that 1 2 3 4 5 6...
        for(int i=0;i< arr.length;i++){
            for(int j=0;i<arr[i].length;j++){
                System.out.println(arr[i][j]+" ");
            }
        }
    }

    public static void print2dArrayInArrayFormat(int arr[][]){
        // Will print like that [[1, 2, 3], [4, 5, 6]]
        System.out.println(Arrays.deepToString(arr));

    }

    public static void print2dArrayInArrayByArrayFormat(int arr[][]){
        /*
        *  Will print in below format
        *  [1, 2, 3]
        *  [4, 5, 6]
        *
        * */

        for(int i=0;i< arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static void main(String[] args) {
        // Creating  matrices
       // int[][] arr = {{1, 2, 3, 5}, {4, 6}, {3, 5, 9}};  // Containing with 3 arrays
        //twoDArrayBasic(arr);

        // Taking input from user : user type matrices
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no of Rows");
        int row=sc.nextInt();
        System.out.println("Enter no of columns");
        int col=sc.nextInt();
        int a[][]=new int[row][col];  // Creating 2d array from user input
        System.out.println("Your 2d Array length is : "+a.length);

        // taking array element from user
        System.out.println("Enter Array elements..");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                a[i][j]=sc.nextInt();
            }
        }


    } // main end
}
