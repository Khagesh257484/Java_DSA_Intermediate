package com.ggl.practice.basic;

import java.util.Scanner;

public class LcmOf2Numbers  {

    public static int gcd(int n1, int n2){
        int remainder=n1%n2;
        while(remainder !=0){
            n1=n2;
            n2=remainder;
            remainder=n1%n2;
        }
        return n2;
    }
    public static void main(String[] args) {
        /*
        * 1) One way : Can solve using brute force technique but it is not optimized we need optimized once
        *
        * 2) Optimized techniques lcm(a,b)
        *   1) a*b=lcm(a,b)*gcd(a,b)
        *      lcm(a,b) =(a*b)/gcd(a,b)
        *
        * */

        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int gcdOfNumber=gcd(n1,n2);
        int lcm=(n1*n2)/gcdOfNumber;
        System.out.println(lcm);
        //System.out.println(n2);
    }
}
