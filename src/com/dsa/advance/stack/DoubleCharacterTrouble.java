/*
Q2. Double Character Trouble
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a string A.

An operation on the string is defined as follows:

Remove the first occurrence of the same consecutive characters. eg for a string "abbcd", the first occurrence of same consecutive characters is "bb".

Therefore the string after this operation will be "acd".

Keep performing this operation on the string until there are no more occurrences of the same consecutive characters and return the final string.



Problem Constraints
1 <= |A| <= 100000



Input Format
First and only argument is string A.



Output Format
Return the final string.



Example Input
Input 1:

 A = abccbc
Input 2:

 A = ab


Example Output
Output 1:

 "ac"
Output 2:

 "ab"


Example Explanation
Explanation 1:

Remove the first occurrence of same consecutive characters. eg for a string "abbc",
the first occurrence of same consecutive characters is "bb".
Therefore the string after this operation will be "ac".
Explanation 2:

 No removals are to be done.

* */

package com.dsa.advance.stack;

import java.util.Stack;

public class DoubleCharacterTrouble {

    // Getting TLE
    public static String solve(String A) {
        String result = "";
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < A.length(); i++) {
            if (st.isEmpty() || st.peek() != A.charAt(i)) {
                st.push(A.charAt(i));
            } else
                st.pop();
        }

        while (!st.isEmpty()) {
            char ele = st.peek();
            st.pop();
            result += ele;
        }
        StringBuilder sb= new StringBuilder(result);
        sb.reverse();

        return sb.toString();

    }

    // Optimized
    public static String solve_optimal(String A){
        Stack<Character> st= new Stack<>();
        for(int i=0;i<A.length();i++){
            if(st.isEmpty() || st.pop()!=A.charAt(i))
                st.push(A.charAt(i));
            else
                st.pop();
        }

        StringBuilder sb= new StringBuilder();
        while(!st.empty()){
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "abccbd";
        System.out.println(solve(s));

        String s1="abccbc";
        System.out.println(solve(s1));

    }
}
