/*
Q2. Redundant Braces
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A denoting an expression. It contains the following operators '+', '-', '*', '/'.

Check whether A has redundant braces or not.

NOTE: A will be always a valid expression and will not contain any white spaces.



Problem Constraints
1 <= |A| <= 105



Input Format
The only argument given is string A.



Output Format
Return 1 if A has redundant braces else, return 0.



Example Input
Input 1:

 A = "((a+b))"
Input 2:

 A = "(a+(a+b))"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 ((a+b)) has redundant braces so answer will be 1.
Explanation 2:

 (a+(a+b)) doesn't have have any redundant braces so answer will be 0.
* */

package com.dsa.advance.stack;

import java.util.Stack;

public class RedundantBraces {
    public static int braces(String A) {
        // ((a+b))
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == ')') {
                char top = st.peek();
                st.pop();

                boolean flag = true; //there are redundant brackets

                while (!st.empty() && top != '(') {

                    // Check for operators in expression
                    if (top == '+' || top == '-' ||
                            top == '*' || top == '/')
                        flag = false;

                    top = st.peek();
                    st.pop();
                }

                if (flag == true)
                    return 1; // there are redundant brackets
            } else
                st.push(A.charAt(i));
        }
        return 0;

    }

    // Scaler Solution

    static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    public static int braces2(String A) {
        char s[] = A.toCharArray();
        int n = s.length;
        Stack<Character> st = new Stack<>();
        for (char c : s) {
            if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                char top = st.peek();
                if (!isOperator(top))
                    return 1;

                while (isOperator(st.peek()))
                    st.pop();

                if (st.peek() != '(') return 1;
                st.pop();
            } else if (isOperator(c)) {
                st.push(c);
            }
        }
        while (!st.isEmpty() && isOperator(st.peek())) st.pop();
        return st.isEmpty() ? 0 : 1;
    }

    public static void main(String[] args) {
        String s = "((a+b))";
        System.out.println(braces(s));
    }
}
