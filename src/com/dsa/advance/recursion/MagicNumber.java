package com.dsa.advance.recursion;

public class MagicNumber {
    public int solve(int A) {
        while (A > 9)
            A = digitSum(A);

        if (A == 1)
            return 1;
        else
            return 0;
    }
    int digitSum(int n) {
        if (n == 0)
            return 0;
        return n % 10 + digitSum(n / 10);
    }

    public static void main(String[] args) {
        MagicNumber mg = new MagicNumber();
        System.out.println(mg.solve(83557));
    }
}
