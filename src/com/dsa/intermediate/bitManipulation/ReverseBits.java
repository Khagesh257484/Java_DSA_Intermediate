package com.dsa.intermediate.bitManipulation;

public class ReverseBits {
    public static void main(String[] args) {
        int n=3;
//        System.out.println(getReversedBit(n));
        int[] A=new int[Integer.MAX_VALUE+10];
        int x=A.length;
        System.out.println(x);
    }

    public static long getReversedBit(int a){
        int[] A=new int[3200000];
        int n=A.length;
        int p= Integer.SIZE-1;
        int answer=0;
        while(p>=0 && a>0){

            if((a&1)!=0){
                answer= answer | (1<<p);
            }
            p--;
            a=a>>1;
        }
        return (long) Integer.toUnsignedLong(answer);
    }
}
