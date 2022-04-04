package com.dsa.intermediate.math;

import java.util.Scanner;

public class IsPerfectNumber {

    // brute force approach (time limit exceed)
    public static boolean brute_force(int n) {

        // edge cases
        if (n <= 0) {
            return false;
        }

        int sum = 0;
        for (int i = 1; i < n; i++) {
            // why n%i condition, cause we are checking for proper divisor as per definition and can't include number itself
            // divisor or factor is one which can divide number and remainder should come 0 only
            if (n % i == 0) {
                sum += i;
            }
        }
        // Checking that sum of factor should equal to the number.
        if (sum == n) {


            return true;
        }
        return false;
    }

    // Optimal solution 1
    // time : O(srt(n)), Space : O(1)
    public static boolean optimal1(int n) {
        // because 1 is number and it has only one factor, which including number itself. as per definition number should not include only factors sum should equal to the number
        if (n == 1 || n <= 0) {
            return false;
        }

        // declaring sum=1 because 1 is already factor of any number, then have to start loop with 2
        int sum = 1;

        for (int i = 2; i * i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;  // for n=6, it will give only 3, if we break here but it should equal to 6
                // Then how can we get 3 more to make sum equal to number
                // if we divide number with ith value number/i : 6/2=3,
                if (i * i != n) {
                    sum += n / i;
                }
            }
        }

        if (sum == n) {
            return true;
        }

        return false;
    }

    // Optimal 2
    public static boolean optimal2(int n) {
        // 6 : 1 2 3
        // 28 : 1 2 4 7 14
        // observation : last factor of both number is just half of the number, so we can iterate loop till n/2 instead of n
        // Time : O(n/2) because iterating loop till n/2 , Space : O(1)

        // edge cases
        if(n<=0){
            return false;
        }

        int sum = 0;
        for (int i = 1; i < n / 2 + 1; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n) {
            return true;
        }

        return false;
    }


    // optimal 3 : Euclid-Euler Theorem [Accepted]
    // write logic here for this

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(brute_force(n));
        // System.out.println(optimal1(n));
        System.out.println(optimal2(n));

    }
}
