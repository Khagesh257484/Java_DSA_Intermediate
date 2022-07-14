package com.dsa.intermediate.Hashing;
/*
Q2. Check Palindrome - II
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A consisting of lowercase characters.

Check if characters of the given string can be rearranged to form a palindrome.

Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Problem Constraints
1 <= |A| <= 105

A consists only of lower-case characters.



Input Format
First argument is an string A.



Output Format
Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.



Example Input
Input 1:

 A = "abcde"
Input 2:

 A = "abbaee"


Example Output
Output 1:

 0
Output 2:

 1


Example Explanation
Explanation 1:

 No possible rearrangement to make the string palindrome.
Explanation 2:

 Given string "abbaee" can be rearranged to "aebbea" to form a palindrome.
* */

import java.util.HashMap;
import java.util.Map;

/*

Observation and Idea :

1) if String length is even then all character frequency should even

2) If String length is odd then middle character frequency should odd(only one)  and rest of character frequency should be even
    that means at most one character can have odd frequency only , if more than one then return false;

* */
public class CheckPalindrome2 {
    public static void main(String[] args) {
        System.out.println(solve("aabbccdd"));
        System.out.println(solve("aabccccdde"));
        System.out.println(solve("aabccccdd"));
    }
    public static int solve(String A) {

        // Creating Frequency Map to store frequency of each character
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < A.length(); i++) {
            hm.put(A.charAt(i), hm.getOrDefault(A.charAt(i), 0) + 1);
        }

        if(A.length()%2==0){
            int odd=0,even=0;
            for(Map.Entry<Character,Integer> entry: hm.entrySet()){
                if(entry.getValue()%2==0)
                    even++;
                else
                    odd++;
            }
            if(odd>0)
                return 0;
        }else{
            int odd=0,even=0;
            for(Map.Entry<Character,Integer> entry: hm.entrySet()){
                if(entry.getValue()%2==0)
                    even++;
                else
                    odd++;
            }
            if(odd>1)
                return 0;
        }

        return 1;
    }

    // 2nd way
    public static int checkPalindrome(String A){
        if(A.length()==1){
            return 1;
        }
        HashMap<String, Integer> hm=new HashMap<>();
        for(int i=0;i<A.length();i++){
            if(!hm.containsKey(A.charAt(i)+"")){
                hm.put(A.charAt(i)+"",1);
            }else{
                hm.put(A.charAt(i)+"", hm.get(A.charAt(i)+"")+1);
            }
        }

        int len=A.length();
        int oddCount=0;

        for(Map.Entry<String,Integer> entry:hm.entrySet()){
            if(len%2==0){
                if(entry.getValue()%2!=0)
                    return 0;
            }else{

                if(entry.getValue()%2!=0){
                    oddCount++;
                }
                if(oddCount>1){
                    return 0;
                }
            }
        }

        return 1;
    }
}
