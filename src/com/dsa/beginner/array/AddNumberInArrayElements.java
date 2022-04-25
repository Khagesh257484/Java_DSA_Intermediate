package com.ggl.practice.array;

public class AddNumberInArrayElements {

    public static int[] solve(final int[] a, int b) {

        // fetching array element and adding b(int type value) in each array element
        for(int i=0;i<a.length;i++){
            //System.out.print(a[i]+b+" ");
            a[i]=a[i]+b;
        }
        // We can return the same array from function, have to return a not a[]
        return a;
    }

    public static void main(String[] args) {
        int a[]={4,6,7,8,9};
        int b[]=solve(a,3);

        // traverse the element of bth array

        for(int i=0;i<b.length;i++){
            System.out.print(b[i]+" ");
        }

    }
}
