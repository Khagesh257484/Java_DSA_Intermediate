package com.dsa.intermediate.array.carryForwardLecture;

public class AmazingSubarray {
    public int solve(String A) {
        int n = A.length();
        char[] ch = A.toCharArray(); // This is extra space which we are taking, we can remove it by using charAt(i) method
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (A.charAt(i) == 'a' || A.charAt(i) == 'e' || A.charAt(i) == 'i' || A.charAt(i) == 'o' || A.charAt(i) == 'u' || A.charAt(i) == 'A' || A.charAt(i) == 'E' || A.charAt(i) == 'I' || A.charAt(i) == 'O' || A.charAt(i) == 'U') {
                count=count+ A.length()-i;
            }
        }
        return count % 10003;
    }

    public int solve1(String A){
        String v="aeiouAEIOU";
        int x=0;
        for(int i=0;i<A.length();i++){
            if(v.contains(String.valueOf(A.charAt(i)))){
                x=x+A.length()-i;
            }
        }
        return x % 10003;
    }
    public static void main(String[] args) {
        AmazingSubarray subarray = new AmazingSubarray();
       // String s = "ABEC";
        String s="pGpEusuCSWEaPOJmamlFAnIBgAJGtcJaMPFTLfUfkQKXeymydQsdWCTyEFjFgbSmknAmKYFHopWceEyCSumTyAFwhrLqQXbWnXSn";
        System.out.println(subarray.solve(s));
        System.out.println(subarray.solve1(s));

      /*  String s1 = "kmlacdefghae";
        System.out.println(subarray.solve(s1));
        System.out.println(subarray.solve1(s1));*/
    }
}
