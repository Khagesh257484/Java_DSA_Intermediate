package com.dsa.intermediate.math;

import java.util.Scanner;

// number which has only 2 factors including the number is called the prime number if more than 2 then it is not
// for a number 1 and number itself will be the factor, so after one or less than number if any factor exist for a number then it will not be prime number

// 1 is not prime number

public class isPrime {

    // brute force
    public static boolean brute_force(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
            break;
        }
        return true;
    }

    // Optimal : Not working but check this approach once
    public static boolean optimal1(int n) {
        int count = 0;
        if (n <= 1) {
            return false;
        }

        if (n == 3 || n == 5 || n == 7) {
            return true;
        }
        for (int i = 2; i <= 10; i++) {
            if (n % i == 0) {
                count++;
                return false;
            }
            // break;
        }
        if (count > 0) {
            return false;
        }
        return true;
    }

    public static void isPrime(int n) {
        if (n <= 1) {
            System.out.println("NO");
        }
        if (n == 2 || n == 3) {
            System.out.println("YES");
        }

        int count = 0;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println(brute_force(n));
        System.out.println(optimal1(n));

        sc.close();
    }
}
