package com.dsa.intermediate.string;
/*
Q1. Amazing Subarrays
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
You are given a string S, and you have to find all the amazing substrings of S.

An amazing Substring is one that starts with a vowel (a, e, i, o, u, A, E, I, O, U).

Input

Only argument given is string S.
Output

Return a single integer X mod 10003, here X is the number of Amazing Substrings in given the string.
Constraints

1 <= length(S) <= 1e6
S can have special characters
Example

Input
    ABEC

Output
    6

Explanation
    Amazing substrings of given string are :
    1. A
    2. AB
    3. ABE
    4. ABEC
    5. E
    6. EC
    here number of substrings are 6 and 6 % 10003 = 6.
* */
public class AmazindSubarray {
    public int solve(String A) {
        String v="aeiouAEIOU";
        int x=0;
        for(int i=0;i<A.length();i++){
            if(v.contains(String.valueOf(A.charAt(i)))){
                x=x+A.length()-i;
            }
        }
        return x % 10003;
    }

    public  int solve2(String A) {
        int ans=0;

        for(int i=0;i<A.length();i++){
            for(int j=i;j<A.length();j++){
                String sub=A.substring(i,j+1);
//               System.out.println(sub);
                if(sub.charAt(0)=='A' || sub.charAt(0)=='E' || sub.charAt(0)=='I' || sub.charAt(0)=='O' || sub.charAt(0)=='U' || sub.charAt(0)=='a' || sub.charAt(0)=='e' ||sub.charAt(0)=='i' || sub.charAt(0)=='o' || sub.charAt(0)=='u'){
                    ans++;
                }
            }
        }
        return ans%10003;
    }
}
