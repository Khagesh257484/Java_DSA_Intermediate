package com.ggl.practice.basic;

import java.util.Scanner;

public class PrimeNumberCheckMultipleInput {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();

        while(number-->0){
            int a=sc.nextInt();
            int sum=0;
            for(int i=1; i<a; i++){
                if(a%i==0){
                    sum=sum+i;
                }
            }
            if(sum==a){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}
