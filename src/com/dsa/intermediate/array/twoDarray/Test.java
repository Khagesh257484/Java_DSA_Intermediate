package com.dsa.intermediate.array.twoDarray;

import java.util.Arrays;

public class Test {
    public static int[][] transposeMatrix(int[][] A) {
        int[][] tx = new int[A[0].length][A.length];
        for(int i=0;i<tx.length;i++){
            for(int j=0;j<tx[0].length;j++){
                tx[i][j]=A[j][i];
            }
        }

        return tx;
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2}, {4, 5}};
        System.out.println(Arrays.deepToString(transposeMatrix(a)));

    }
}
