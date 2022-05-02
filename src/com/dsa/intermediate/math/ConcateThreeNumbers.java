package com.dsa.intermediate.math;

/*

 * */
public class ConcateThreeNumbers {
    public int solve(int A, int B, int C) {
        int min = Math.min(A, B);
        min = Math.min(min, C);

        int max = Math.max(A, B);
        max = Math.max(max, C);
        System.out.println(max + " :: " + min);
        if (A < max)
            System.out.println("Hii");


            String s = "";
        if (B > min && B < max || B == max || B == min )
            s += String.valueOf(B) + String.valueOf(max);
        else if (A > min && A < max || A == max || A == min)
            s += String.valueOf(A) + String.valueOf(max);
        else if (C > min && C < max || C == max || C == min )
            s = String.valueOf(min)+String.valueOf(C) + String.valueOf(max);

        int i = Integer.parseInt(s);
        return i;
    }

    public static void main(String[] args) {
        ConcateThreeNumbers concate = new ConcateThreeNumbers();
//        System.out.println(concate.solve(55, 43, 47));
//        System.out.println(concate.solve(10, 20, 30));
        System.out.println(concate.solve(28, 97, 32));

    }

}
