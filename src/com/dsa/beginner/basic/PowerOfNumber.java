package com.ggl.practice.basic;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();  // n
        int power = sc.nextInt();  // m
        // n^m(n*n*n.......m times)
        if (power == 0) {
            System.out.println(1);
        }
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = number * result;   // 2 * 1 = 2

        }
        System.out.println(result);

    }
}
