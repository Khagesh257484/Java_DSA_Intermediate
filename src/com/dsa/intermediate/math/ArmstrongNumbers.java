package com.dsa.intermediate.math;

import java.util.Scanner;

public class ArmstrongNumbers {
    public static void armstrongBtw2numbers(int n){
        for(int i=1;i<=n;i++){
            int j=i,sum=0;
            while(j!=0){
                int rem=j%10;
                sum=sum+rem*rem*rem;
                j/=10;
            }
            if(sum==i){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        armstrongBtw2numbers(n);
    }
}
