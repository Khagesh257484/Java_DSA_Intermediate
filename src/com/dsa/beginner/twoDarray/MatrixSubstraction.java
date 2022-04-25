package com.ggl.practice.twoDarray;

import java.util.Arrays;

public class MatrixSubstraction {

    public static  int[][] matrixSubstraction(int[][] A, int[][] B){
        int row=A.length;
        int col=A[0].length;
        int [][]substractionMatrix=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                substractionMatrix[i][j]=A[i][j]-B[i][j];
            }
        }
        return substractionMatrix;
    }

    public static void main(String[] args) {
        int [][]a={{2,3,5},{5,1,4}};
        int [][]b={{4,4,8},{1,2,3}};

        // Method Action


       // System.out.println(Arrays.deepToString(substractionMatrix)); // this also print matrix in different form
      /*  for(int i=0;i< substractionMatrix.length;i++){
            System.out.println(Arrays.toString(substractionMatrix[i]));
        }*/


    }
}
