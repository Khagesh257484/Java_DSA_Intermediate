package com.dsa.intermediate.array.prefix;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public ArrayList<Integer> getEvenPrefixSum(ArrayList<Integer> A) {

        ArrayList<Integer> psEven = new ArrayList<>();
        psEven.add(A.get(0));
        for (int i = 1; i < A.size(); i++) {
            if (i % 2 == 0) {
                psEven.add(psEven.get(i - 1) + A.get(i));
            } else {
                psEven.add(psEven.get(i - 1));
            }
        }
        return psEven;
    }

    public ArrayList<Integer> getOddPrefixSum(ArrayList<Integer> A){
        ArrayList<Integer> psOdd=new ArrayList<>();
        psOdd.add(0);
        for(int i=1;i<A.size();i++){
            if(i%2!=0){
                psOdd.add(psOdd.get(i-1)+A.get(i));
            }else{
                psOdd.add(psOdd.get(i-1));
            }
        }
        return psOdd;
    }

    public static void main(String[] args) {
        Test test = new Test();
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(2, 1, 6, 4));
        System.out.println(test.getEvenPrefixSum(a));
        System.out.println(test.getOddPrefixSum(a));
    }
}
