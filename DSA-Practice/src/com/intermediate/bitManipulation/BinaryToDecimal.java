/*
 Question : Convert a Binary number into Decimal number
* */

package com.intermediate.bitManipulation;

public class BinaryToDecimal {
    public static int binaryToDecimal_StringInput(String s) {
        double power = 0, base = 2, result = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == '1') {
                result = result + Math.pow(base, power);
                // System.out.println(Math.pow(base, power));
            }
            power++;
        }
        return (int) result;
    }

    public static int binaryToDecimal_numberInput(int binaryNumber) {
        int n = binaryNumber;
        double power = 0, base = 2, result = 0;
        while (n != 0) {
            int digit = n % 10;
            if (digit == 1) {
                result = result + Math.pow(base, power);
            }
            power++;
            n = n / 10;
        }
        return (int) result;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal_StringInput("10110"));
        System.out.println(binaryToDecimal_numberInput(10110));
    }
}
