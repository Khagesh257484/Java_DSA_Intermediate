package com.dsa.intermediate.recursion;

public class PowerOfNumber2 {
    public int pow(int A, int B, int C) {
        if (A == 1)
            return 1;
        if (B == 0)
            return 0;
        /*if (A == 0)
            return 0;*/

        long p = pow(A, B / 2, C);


        if (B % 2 == 0)
            return (int) ((p * p) % C);
        else
            return (int) (((p * p) % C) * (A % C)) % C;
    }

    public static void main(String[] args) {

        PowerOfNumber2 pn = new PowerOfNumber2();
        System.out.println(pn.pow(-1, 1, 20));
        System.out.println(pn.pow(2, 4, 3));

    }
}
