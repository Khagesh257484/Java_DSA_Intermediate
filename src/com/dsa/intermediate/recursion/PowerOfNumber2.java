package com.dsa.intermediate.recursion;

public class PowerOfNumber2 {
    public int pow(int A, int B, int C) {
        if (A == 0)
            return 0;
        if (B == 0)
            return 1;

        long p = (long) (pow(A, B / 2, C)) % C;
        long halfPow = ((p % C) * (p % C)) % C;

        if (B % 2 == 0)
            return (int) (halfPow);
        else
            return (int) ((halfPow * (A % C) + C) % C) % C;
    }


    public static void main(String[] args) {

        PowerOfNumber2 pn = new PowerOfNumber2();
        System.out.println(pn.pow(-1, 1, 20));
        System.out.println(pn.pow(2, 4, 3));

    }
}
