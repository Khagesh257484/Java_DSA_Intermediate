package com.dsa.intermediate.recursion;

/*
 Question : Find the sum of N natural numbers from 1 to n
* */
public class SumOfNaturalNumbers {
    public int sum(int n) {
        if (n == 1)
            return 1;
        else
            return sum(n - 1) + n;
    }

    public static void main(String[] args) {
        SumOfNaturalNumbers test = new SumOfNaturalNumbers();
        System.out.println(test.sum(5));
        System.out.println(test.sum(1));
    }

}
