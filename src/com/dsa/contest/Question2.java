package com.dsa.contest;

public class Question2 {
    public int solve(String[] A, int B) {
        int pair_count = 0;
        /*for (int i = 0; i < A.length; i++) {
            if (Integer.parseInt(A[i]) % B == 0) {
                pair_count++;
            }
        }*/

String s="";


        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                s+=A[i];
                s+=A[j];
               // System.out.println(s);
                if(Integer.parseInt(s)%2==0){
                    pair_count++;
                }
                StringBuilder sb=new StringBuilder(s);
                if(Integer.parseInt(sb.reverse().toString())%2==0){
                    pair_count++;
                }
                s="";
            }
           // i++;
        }
       // System.out.println(pair_count);
        return pair_count;
    }

    public static void main(String[] args) {
        Question2 q2 = new Question2();
        String[] A = {"12", "15", "16"};
        System.out.println(q2.solve(A, 2));
        String[] A1 = {"12", "15", "16","1"};
        System.out.println(q2.solve(A1, 2));
    }
}

