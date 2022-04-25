package com.dsa.intermediate.array;

import java.util.Arrays;

public class Test {
    public  int[] rotateArray(int[] a, int k){
        while(k>0){
            int n=a.length;
            int j=n-1;
            for(;j>0;j--){
                int temp=a[j];
                if(j==0)
                    a[0]=temp;
                a[j]=a[j-1];
            }
            k--;
        }
        return a;
    }

    public static void main(String[] args) {
        Test test=new Test();
        int[] a={2,5,1,4,6};
        int[] resultArray=test.rotateArray(a,2);
        System.out.println(Arrays.toString(resultArray));
    }
}
