package com.company.java.dsa.array;

public class IdentityMatrix {
    public static int solve(final int[][] A) {
        if (A.length != A[0].length) {
            System.out.println("Matrix should be Square matrix..");
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                if (i == j && A[i][j] != 1)
                    return 0;
                else if (i != j && A[i][j] != 0)
                    return 0;
            }
        }

        return 1;

    }

    public static void main(String[] args) {
        int[][] a = {{2, 0}, {0, 2}};
        int[][] b = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] c = {{1, 1, 0}, {0, 1, 0}, {0, 0, 1}};

        int a1 = solve(a);
//        int b1 = solve(b);
//        int c1 = solve(c);
        System.out.println(a1 + " ");

    }
}
