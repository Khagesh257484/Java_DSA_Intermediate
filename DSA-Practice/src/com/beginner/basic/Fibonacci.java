/*
Q2. IsFibonacci
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Laxman is newbie in programming. He just learned how to generate fibonacci series, he told this to his elder brother, so his brother gave him an interesting problem.


The problem is, given an integer N, task is to check whether the given number exist in fibonacci sequence or not.


INPUT


The first line contains an integer, T, denoting the number of test cases.

Next T lines contains an integer, N.


OUTPUT:


For each test case , print “Yes” if the number exists in fibonacci sequence, else print “No”.


CONSTRAINTS:


• 1 ≤ T ≤ 10^5


• 1 ≤ N ≤ 10^9

SAMPLE INPUT


1

8


SAMPLE OUTPUT


Yes


EXPLANATION


Fibonacci Series is: 0 1 1 2 3 5 8, As 8 is the part of Fibonacci series so the output is "Yes"
* */

package com.beginner.basic;

import java.util.Scanner;

public class Fibonacci {
    static int fibonacciPattern(int n) {
        int fn = 0, sn = 1, result = 0;
        n = n - 2;
        while (n != 0) {
            result = fn + sn;
            fn = sn;
            sn = result;
            n--;
        }
        return result;
    }

    static void checkFibonacciNumber(int inputNumber) {
        int first_term = 0;
        int second_term = 1;
        int next_term = 0;

        while (next_term < inputNumber) {
            next_term = first_term + second_term;
            first_term = second_term;
            second_term = next_term;
        }
        if (next_term == inputNumber) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacciPattern(9));
        Scanner sc = new Scanner(System.in);
        int operation = sc.nextInt();
        for (int i = 1; i <= operation; i++) {
            int number = sc.nextInt();
            checkFibonacciNumber(number);
        }
    }
}
