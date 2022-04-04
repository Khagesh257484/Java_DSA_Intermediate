package com.dsa.intermediate.array;

import java.util.Arrays;
import java.util.Scanner;

/*
Ques: Given an integer array A and an integer B, you have to print the same array after rotating it B times towards the right.

NOTE: You can use extra memory.

Input Format :
The first line begins with an integer A denoting the length of an array, and then A integers represent the array elements.
The second line contains a single integer B.

Output Format :
Print an array of integers which is the Bth right rotation of input array A, on a separate line

I/P : A = [1,2,3,4];
      B = 2;

O/P :  3 4 1 2


Solution :
 1) Reverse the array

 2) Rever

* */
public class RotateArrayFromRightToLeft {
    public static int[] rotateArray(int A[], int B) {
        int n = A.length;
        int j = A.length;
        // Reversing array using SWAP technique
        for (int i = 0; i < j; i++) {
            if (i < j) {
                int temp = A[j - 1];
                A[j - 1] = A[i];
                A[i] = temp;
                j--;
            }
        }

        // Reverse Starting Bth element
        int k = B;
        for (int i = 0; i < k; i++) {
            if (i < k) {
                int temp = A[k - 1];
                A[k - 1] = A[i];
                A[i] = temp;
                k--;
            }
        }

        // Reverse Last N-B element
        int l = B ,m= A.length;
        for (int i = l; i < m; i++) {
            if(i<m){
                int temp=A[m-1];
                A[m-1]=A[i];
                A[i]=temp;
                m--;
            }
        }
        return A;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];  // Taking array size

        for (int i = 0; i < a.length; i++) {  // taking input from users
            a[i] = sc.nextInt();
        }
        int b = sc.nextInt();

        // Calling method
        int c[] = rotateArray(a, b);
        System.out.println(Arrays.toString(c));


        sc.close();

    }
}
