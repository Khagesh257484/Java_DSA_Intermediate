package com.beginner.array;

public class Test {

    public static void printSubArray(int[] arr, int start, int end) {
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    public static int sum(int[] arr, int start, int end){
        int sum=0;
        for(int i=start;i<=end;i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                //printSubArray(arr, i, j);
                sum(arr,i,j);
            }
        }

    }
}
