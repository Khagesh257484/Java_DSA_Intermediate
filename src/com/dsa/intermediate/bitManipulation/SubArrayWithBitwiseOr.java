package com.dsa.intermediate.bitManipulation;

import java.util.ArrayList;

public class SubArrayWithBitwiseOr {
    public static Long solve(int A, ArrayList<Integer> B) {
        int zeroCount=0;
        for (int i = 0; i < B.size(); i++) {
            if(B.get(i)==0)
                zeroCount++;
        }
        long b = A * (A + 1) / 2;
        return b - zeroCount;
    }

    public static void main(String[] args) {

        ArrayList<Integer> al=new ArrayList<>();
//        al.add(0);
//        al.add(1);
        al.add(1);
        al.add(0);
        al.add(1);
        System.out.println(solve(3,al));
    }
}
