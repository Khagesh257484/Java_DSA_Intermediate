package com.dsa.intermediate.sorting;

import java.util.Arrays;

public class NobleIntegerP3 {
    // Sort an array in Descending Order
    // then check if (A[i]==i) then Noble integer is present else not
    public int solve(int[] A) {
        sortArrayInDescendingOrder(A);
        int ans = 0;
        if (A[0] == 0)
            return 1;
        for (int i = 1; i < A.length; i++) {
            if (A[i - 1] != A[i] && A[i] == i)
                return 1;
        }
        return -1;
    }

    private void sortArrayInDescendingOrder(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        for (int i = 0; i < n / 2; i++) {
            int temp = a[i];
            a[i] = a[n - 1 - i];
            a[n - 1 - i] = temp;
        }
    }

    public static void main(String[] args) {
        NobleIntegerP3 integerP3 = new NobleIntegerP3();
        int[] a = {3, 2, 1, 3};
        int[] b = {0, 2, 2, 4, 4, 5, 5, 6, 6};
        int[] c = {9, 12, 15, 18, 20};
        int[] d = {1, 1, 3, 3};
        int[] e = {-4, 7, 5, 3, 5, -4, 2, -1, -9, -8, -3, 0, 9, -7, -4, -10, -4, 2, 6, 1, -2, -3, -1, -8, 0, -8, -7, -3, 5, -1, -8, -8, 8, -1, -3, 3, 6, 1, -8, -1, 3, -9, 9, -6, 7, 8, -6, 5, 0, 3, -4, 1, -10, 6, 3, -8, 0, 6, -9, -5, -5, -6, -3, 6, -5, -4, -1, 3, 7, -6, 5, -8, -5, 4, -3, 4, -6, -7, 0, -3, -2, 6, 8, -2, -6, -7, 1, 4, 9, 2, -10, 6, -2, 9, 2, -4, -4, 4, 9, 5, 0, 4, 8, -3, -9, 7, -8, 7, 2, 2, 6, -9, -10, -4, -9, -5, -1, -6, 9, -10, -1, 1, 7, 7, 1, -9, 5, -1, -3, -3, 6, 7, 3, -4, -5, -4, -7, 9, -6, -2, 1, 2, -1, -7, 9, 0, -2, -2, 5, -10, -1, 6, -7, 8, -5, -4, 1, -9, 5, 9, -2, -6, -2, -9, 0, 3, -10, 4, -6, -6, 4, -3, 6, -7, 1, -3, -5, 9, 6, 2, 1, 7, -2, 5};


//        System.out.println(integerP3.solve(a));
//        System.out.println(integerP3.solve(b));
//        System.out.println(integerP3.solve(c));
//        System.out.println(integerP3.solve(d));

        System.out.println(integerP3.solve(e));

//        Arrays.sort(e);
//        System.out.println(Arrays.toString(e));


    }
}
