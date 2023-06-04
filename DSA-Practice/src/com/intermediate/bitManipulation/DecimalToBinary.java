/*
 Question : Convert a given decimal number into binary form.
        10 : 1010
* */

package com.intermediate.bitManipulation;

public class DecimalToBinary {

    public static void decimalToBinary(int n) {
        int[] binaryNum = new int[32];
        int i = 0;
        while (n > 0) {
            int digit = n % 2;
            binaryNum[i] = digit;
            // binaryNum[i++]=n%2;
            n = n / 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binaryNum[j]);
        }
    }

    public static void decimalToBinaryUsingBitManipulation(int n) {
        for (int i = 31; i >= 0; i--) {
            int k = n >> i;
            if ((k & 1) > 0)
                System.out.print(1);
            else
                System.out.print(0);
        }
    }

    public static void main(String[] args) {
        decimalToBinary(10);
        System.out.println();
        decimalToBinaryUsingBitManipulation(10);
        System.out.println();
    }

}
