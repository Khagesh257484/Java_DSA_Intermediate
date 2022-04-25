package com.ggl.practice.twoDarray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        ArrayList<Integer>al=new ArrayList<>();
        Vector<Integer> v=new Vector<Integer>(12);
        for(int i=1;i<10;i++){
            v.add(i);
        }
        System.out.println(Arrays.toString(v.toArray()));
        System.out.println(v);

    }
}
