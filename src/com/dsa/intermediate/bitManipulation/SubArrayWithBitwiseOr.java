package com.dsa.intermediate.bitManipulation;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayWithBitwiseOr {
    public static Long solve(int A, ArrayList<Integer> B) {
        int zeroCount = 0;
        for (int i = 0; i < B.size(); i++) {
            if (B.get(i) == 0)
                zeroCount++;
        }
        long b = A * (A + 1) / 2;
        return b - zeroCount;
    }

    public static long getNumberOfSubArrays(int A, int[] B) {
        long aLength = A;
        long totalSubArray = aLength * (aLength + 1) / 2;
        long totalconZero = 0, zeroCount = 0;

        for (int i = 0; i < aLength; i++) {
            if (B[i] == 0) {
                zeroCount++;
            }
            if (B[i] == 1 || i == aLength - 1) {
                if (zeroCount == 1) {
                    totalconZero++;
                } else {
                    totalconZero = totalconZero + (zeroCount * (zeroCount + 1) / 2);
                }
                zeroCount = 0;
            }
        }

        return totalSubArray - totalconZero;


    }

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>(Arrays.asList(1, 0, 1));
        System.out.println(solve(3, al));
    }
}
