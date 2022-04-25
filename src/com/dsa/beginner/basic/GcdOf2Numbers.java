package com.ggl.practice.basic;

import java.util.Scanner;

public class GcdOf2Numbers {
    public static void main(String[] args) {

     /*   Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();*/

       int A=36;
       int B=24;
       int r=A%B;

       while(r!=0){
           A=B;
           B=r;
           r=A%B;

       }
        System.out.println(B);
    }
}
