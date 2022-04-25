package com.ggl.practice.basic;

import java.util.Scanner;

public class PerfectNumberCheckWithMultipleInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        // Need a loop that run n times
        for (i=1;i<=n;i++){
            int a=sc.nextInt();
            int sum=0;
            for (int j=1;j<a;j++){
                if(a%j==0){
                    sum=sum+j;
                }
            }
            if(sum==a){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

            // print square of number
            //System.out.println("Square of Number is : "+(a*a));
        }

    }
}
