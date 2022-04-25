package com.ggl.practice.basic;

import java.util.Scanner;

public class ValidTriagnle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int sum=180;

        if(a+b+c==sum){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}
