package com.dsa.intermediate.math;

public class ABandModulo {

    // Will get TLE in this
    public int solve(int A, int B) {
        int max = Math.max(A, B), ans = 0;
        for (int i = 1; i <= max; i++) {
            int r1 = A % i;
            int r2 = B % i;
            if (r1 == r2)
                ans = i;
        }
        return ans;
    }

    public int solve2(int A, int B) {

        return Math.abs(A-B);
    }

    public static void main(String[] args) {
        ABandModulo modulo=new ABandModulo();
        System.out.println(modulo.solve(6816621,8157697));
        System.out.println(modulo.solve2(6816621,8157697));
    }
}
