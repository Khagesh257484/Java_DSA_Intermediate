package com.dsa.intermediate.array.carryForwardLecture;
/*
Ques: You have given a string A having Uppercase English letters.
You have to find how many times subsequence "AG" is there in the given string.
NOTE: Return the answer modulo 109 + 7 as the answer can be very large.

Problem Constraints :
1 <= length(A) <= 105

Input Format :
First and only argument is a string A.

Output Format :
Return an integer denoting the answer.

Example :
Input 1:
 A = "ABCGAG"
Output : 3

Input 2:
 A = "GAB"
Output : 0

* */

public class SubsequenceStringPair {
    public int solve(String s) {
        int ans = 0, count = 0;
        char[] ch = s.toCharArray();

        for(int i=0;i<ch.length;i++){
            if(ch[i]=='A')
                count++;
            else if(ch[i]=='G')
                ans+=count;
        }
        return ans;
    }

    public static void main(String[] args) {
        SubsequenceStringPair ssp = new SubsequenceStringPair();
        String s = "ABCGAG";
        int pair_count = ssp.solve(s);
        System.out.println(pair_count);
    }
}
