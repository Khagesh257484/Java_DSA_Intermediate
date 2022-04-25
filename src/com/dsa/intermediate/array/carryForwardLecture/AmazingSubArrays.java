package com.dsa.intermediate.array.carryForwardLecture;

public class AmazingSubArrays {
    public static void main(String[] args) {
        AmazingSubArrays amazingSubArrays=new AmazingSubArrays();
        System.out.println(amazingSubArrays.getAmazingString("pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn"));
    }

    public int getAmazingString(String A){
        String v="aeiouAEIOU";
        int x=0;
        for(int i=0;i<A.length();i++){
            if(v.contains(String.valueOf(A.charAt(i)))){
                x=x+A.length()-i;
            }
        }
        return x % 10003;
    }
}