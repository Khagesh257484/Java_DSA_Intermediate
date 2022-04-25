package com.company.java.dsa.pattern;

import java.util.ArrayList;

public class FibonacciPattern_2Way {
    public static void main(String[] args) {
        int ft=0,lt=1,nt;
        ArrayList<Integer> al=new ArrayList<>();
        al.add(ft);
        al.add(lt);

        int k=1;
        for(int i=1;i<=5;i++){
            if(k<=i){
                nt=ft+lt;
                al.add(nt);
                ft=lt;
                lt=nt;
                k++;
            }
        }
        System.out.println(al.get(3));

        // Print in Pattern
        int m=0;
        for (int i = 0; i <= al.size(); i++) {
            for (int j = 0; j <=i; j++) {
                System.out.print(al.get(m)+" ");
                m++;
            }
            System.out.println();
        }

    }
}
