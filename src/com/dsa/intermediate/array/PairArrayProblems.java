package com.dsa.intermediate.array;

import java.util.Scanner;
/*
   Link : https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true&h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&page=2

There is a large pile of socks that must be paired by color. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.

Example [1 2 3 1 2 4 5 4]
No of Pairs : 3

There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
* */
public class PairArrayProblems {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] hash = new int[n];
        for(int i=0; i<n; i++){
            hash[sc.nextInt()]++;
            //hash[i]=sc.nextInt();
        }
        long ans=0;
        for(int p: hash){
            ans+=p/2;
        }
        System.out.println(ans);
    }
}