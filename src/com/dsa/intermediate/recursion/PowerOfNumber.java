package com.dsa.intermediate.recursion;
/*
 Question : Find the power of number
      Ex :

      2^5 = 32
      2^6 = 64

* */

public class PowerOfNumber {


    public int power(int n, int m) {
        if (n == 1)    // Power of zero number will be zero
            return 1;
        if (m == 0)   // If power of any number is zero then it will be one
            return 1;

        // In this question, Don't worry about overflow. This is basic approach
        // return n * power(n, m - 1);

        // For Even and Odd number, we can calculate in different way.
        // if number has even power  : a^n/2 * a^n/2 = a
        // If number has odd power : a^n/2 * a^n/2 * a = a^(n+1)
        // So for even number we can calculate it earlier and can store in one variable
        // We can also return directly
        // return power(n,m/2)* power(n*m/2) :for Even number and Odd number have to multiple with a but here we are calling same code again and again which is not good practice, so to avoid this we should take one variable and can call this variable


        // Second Way to Solve this but for 2^40, it is also not working
        int pow = power(n, m / 2);
        if (m % 2 == 0)
            return pow * pow;
        else
            return pow * pow * n;
    }

    public static void main(String[] args) {
        PowerOfNumber power = new PowerOfNumber();
        System.out.println(power.power(2, 5));
        System.out.println(power.power(2, 25));

        // But for Big number like 2^40 it is giving zero
        System.out.println(power.power(2, 40));

    }
}
