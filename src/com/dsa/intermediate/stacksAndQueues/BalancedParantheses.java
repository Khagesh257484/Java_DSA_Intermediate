/*
Q2. Balanced Parantheses!
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a string A consisting only of '(' and ')'.

You need to find whether parentheses in A are balanced or not, if it is balanced then return 1 else return 0.



Problem Constraints
1 <= |A| <= 105



Input Format
First argument is an string A.



Output Format
Return 1 if parantheses in string are balanced else return 0.



Example Input
Input 1:

 A = "(()())"
Input 2:

 A = "(()"


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 Given string is balanced so we return 1.
Explanation 2:

 Given string is not balanced so we return 0.

* */

package com.dsa.intermediate.stacksAndQueues;

import java.util.Stack;

public class BalancedParantheses {

    // (()())
    public int solve(String A) {
        int n = A.length();
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if (ch == '(') {
                st.push(A.charAt(i));
            } else if (ch == ')') {
                boolean val = handleClosing(st, '(');
                if (!val)
                    return 0;
            }
        }
        if (st.size() == 0)
            return 1;
        else
            return 0;
    }

    public boolean handleClosing(Stack<Character> st, char ch) {
        if (st.size() == 0)   // If any extra closing bracket is present then it will handle
            return false;
        else if (st.peek() != ch)
            return false;
        else {
            st.pop();
            return true;
        }
    }

    public int isBalancedParanthesis(String A) {
        Stack<Character> s1 = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '(') {
                s1.push(A.charAt(i));
            } else if (s1.isEmpty()) {
                return 0;
            } else if (A.charAt(i) == ')') {
                s1.pop();
            }

        }
        return s1.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        BalancedParantheses bl = new BalancedParantheses();
        System.out.println(bl.solve("(()())"));
        System.out.println(bl.solve("(()"));
        System.out.println(bl.isBalancedParanthesis("(()())"));
        System.out.println(bl.isBalancedParanthesis("(()"));
    }
}
