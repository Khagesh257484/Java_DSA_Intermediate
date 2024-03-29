/*
Q1. Balanced Paranthesis
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an expression string A, examine whether the pairs and the orders of “{“,”}”, ”(“,”)”, ”[“,”]” are correct in A.

Refer to the examples for more clarity.



Problem Constraints
1 <= |A| <= 100



Input Format
The first and the only argument of input contains the string A having the parenthesis sequence.



Output Format
Return 0 if the parenthesis sequence is not balanced.

Return 1 if the parenthesis sequence is balanced.



Example Input
Input 1:

 A = {([])}
Input 2:

 A = (){
Input 3:

 A = ()[]


Example Output
Output 1:

 1
Output 2:

 0
Output 3:

 1


Example Explanation
You can clearly see that the first and third case contain valid paranthesis.

In the second case, there is no closing bracket for {, thus the paranthesis sequence is invalid.


* */

package com.dsa.advance.stack;

import java.util.Stack;

public class BalancedParanthesis {
    public static int solve(String A) {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < A.length(); i++) {
                char ch = A.charAt(i);
                if (ch == '(' || ch == '{' || ch == '[') {
                    st.push(ch);
                } else if (st.isEmpty())
                    return 0;

                if (!st.empty()) {
                    // When you get closing bracket and stack top element is equal open bracket then start pop

                    if (A.charAt(i) == ')' && st.peek() == '(')
                        st.pop();
                    if (A.charAt(i) == '}' && st.peek() == '{')
                        st.pop();
                    if (A.charAt(i) == ']' && st.peek() == '[')
                        st.pop();
                }

            }
            return st.size() == 0 ? 1 : 0;

    }

    public static void main(String[] args) {
        String A="{([])}";
        System.out.println(solve(A));
    }
}
