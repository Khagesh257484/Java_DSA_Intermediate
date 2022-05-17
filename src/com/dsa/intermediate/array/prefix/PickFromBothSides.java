package com.dsa.intermediate.array.prefix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PickFromBothSides {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> A=new ArrayList<>(Arrays.asList(5, -2, 3 , 1, 2));
        PickFromBothSides pickFromBothSides=new PickFromBothSides();
        System.out.println( pickFromBothSides.findMaxSum(A,3));
    }

    public int findMaxSum(ArrayList<Integer> A, int B){
        int k=B, sum=Integer.MIN_VALUE, maxSum=Integer.MIN_VALUE;
        ArrayList<Integer> prefixSum=getPrefixSum(A);
        printArray(prefixSum);
        if(B==A.size()){
            return prefixSum.get(A.size()-1);
        }
        for(int i=0;i<B;i++){
            int ele=B-i;
            System.out.println("ele::"+ele);
            if(i==0){
                System.out.println("sum of range ["+(A.size()-ele)+" , "+(A.size()-1)+"]");
                sum=prefixSum.get(A.size()-1)-prefixSum.get(A.size()-ele-1);
            }else{
                System.out.println("sum of range "+(i-1)+" + Sum [ "+(A.size()-ele)+" , "+(A.size()-1)+" ]");
                sum=prefixSum.get(i-1)+(prefixSum.get(A.size()-1)-prefixSum.get(A.size()-ele-1));
            }
            maxSum=Math.max(sum, maxSum);
        }


        return maxSum;
    }

    public ArrayList<Integer> getPrefixSum(ArrayList<Integer> A){
        ArrayList<Integer> prefixSum=new ArrayList<>();
        prefixSum.add(A.get(0));
        for(int i=1;i<A.size();i++){
            prefixSum.add(prefixSum.get(i-1)+A.get(i));
        }
        return prefixSum;
    }

    public void printArray(ArrayList<Integer> A){
        for(Integer ele: A){
            System.out.print(ele+" ");
        }
        System.out.println();
    }

}