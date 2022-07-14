package com.dsa.intermediate.math;

import java.util.HashMap;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1,1);
        hm.put(2,2);
        hm.put(4,1);

        for(int i=1;i<=4;i++){
            if(hm.get(1)==1)
                System.out.println("1 found one time");
            if(hm.get(2)==2)
                System.out.println("2 found 2 time");
        }
        System.out.println(hm.get(3));
        System.out.println(hm.get(2));
    }

}
