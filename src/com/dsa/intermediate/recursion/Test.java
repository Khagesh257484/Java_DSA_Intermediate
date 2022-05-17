package com.dsa.intermediate.recursion;

public class Test {
    public int power(int a, int n) {
        if (a == 1)
            return 1;
        if (n == 0)
            return 1;

        int pow = power(a, n / 2);
        if (n % 2 == 0)
            return pow * pow;
        else
            return pow * pow * a;
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.power(2,10));
        System.out.println(test.power(2,9));
        //System.out.println(test.sum(1));
    }
}
