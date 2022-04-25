package com.company.java.dsa.series;

import java.util.Scanner;

/*
We use the integers , , and  to create the following series:
You are given  queries in the form of , , and . For each query, print the series corresponding to the given , , and  values as a single line of  space-separated integers.

Series is : (a+ 2^0*b ),(a+ 2^0*b + 2^1*b),....(a+2^0*b+2^1*b+....+2^n-1*b)

Input Format
The first line contains an integer,q , denoting the number of queries.
Each line i of the q subsequent lines contains three space-separated integers describing the respective a,b ,n and  values for that query.


*/
public class SeriesPrinting2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int n=sc.nextInt();  // number of terms

        int first_term=a+(int)Math.pow(2,0)*b;
        int term;

        for(int i=1;i<=n;i++){
            System.out.print(first_term+" ");
            term=(int)Math.pow(2,i)*b;
            first_term=term+first_term;
        }


    }

}
