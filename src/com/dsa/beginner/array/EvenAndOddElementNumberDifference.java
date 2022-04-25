package com.ggl.practice.array;

import java.util.Scanner;

public class EvenAndOddElementNumberDifference {

    /*
    * 1) find the difference of even number and odd number in an array. Difference should be show in the +ve form only
    *
    * 2) Input : First line contains a single integer T.

    Each of the next T lines begin with an integer denoting the length of the array A (|A|),
* followed by |A| integers which indicate the elements in the array.
    *
    * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();

        for (int i = 1; i <= operation; i++) {
            int array_size = sc.nextInt();
            int evenNumberCount = 0;
            int oddNumberCount = 0;

            //creating array of given user size
            int a[] = new int[array_size];

            // reading input from user
            for (int j = 0; j < a.length; j++) {
                a[j] = sc.nextInt();
                int n = (a[j] % 2 == 0) ? evenNumberCount++ : oddNumberCount++;
                // System.out.print(a[j]+" ");
            }
            int difference = evenNumberCount - oddNumberCount;

            if (difference < 0) {
                System.out.println("Difference is : " + difference);
            } else {
                System.out.println("Difference is : " + difference);
            }

        }
    }
}
