package com.ggl.practice.twoDarray;

public class AreMatricesSame {
    public static int areMatricesSame(int[][] A, int[][] B) {
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                if (A[i][j] != B[i][j]) {
                    count++;
                    break;
                }
            }
        }

        if(count >0){
            return 0;
        }else{
            return 1;
        }
    }

    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int matrice=areMatricesSame(a,b);
        System.out.println(matrice);




    }
}

