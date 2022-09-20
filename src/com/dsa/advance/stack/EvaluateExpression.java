/*
Q3. Evaluate Expression
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
An arithmetic expression is given by a character array A of size N. Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, /. Each character may be an integer or an operator.



Problem Constraints
1 <= N <= 105



Input Format
The only argument given is character array A.



Output Format
Return the value of arithmetic expression formed using reverse Polish Notation.



Example Input
Input 1:
    A =   ["2", "1", "+", "3", "*"]
Input 2:
    A = ["4", "13", "5", "/", "+"]


Example Output
Output 1:
    9
Output 2:
    6


Example Explanation
Explaination 1:
    starting from backside:
    * : () * ()
    3 : () * (3)
    + : (() + ()) * (3)
    1 : (() + (1)) * (3)
    2 : ((2) + (1)) * (3)
    ((2) + (1)) * (3) = 9
Explaination 2:
    + : () + ()
    / : () + (() / ())
    5 : () + (() / (5))
    13 : () + ((13) / (5))
    4 : (4) + ((13) / (5))
    (4) + ((13) / (5)) = 6
* */

package com.dsa.advance.stack;

// https://stevenpcurtis.medium.com/evaluate-reverse-polish-notation-using-a-stack-7c618c9f80c0
// https://stevenpcurtis.medium.com/infix-postfix-prefix-and-reverse-polish-notation-299affa57acf
import java.util.Stack;

// https://www.youtube.com/watch?v=mNAX7clJoWY
public class EvaluateExpression {
    public static int evalRPN(String[] A) {
        Stack <Integer> stk=new Stack<>();
        int length = A.length;
         if(length==1) return Integer.parseInt(A[0]);  //Edge case if only one number is present
        int result=0;
        for (int i = 0; i < length; i++) {
            if (A[i].equals("+") || A[i].equals("-") || A[i].equals("*") || A[i].equals("/")) {
                String operator = A[i];
                int b = stk.pop();
                int a = stk.pop();
                if (operator.equals("+")) result = a+b;
                else if (operator.equals("-"))
                    result = a-b;
                else if (operator.equals("*"))
                    result = a*b;
                else if (operator.equals("/"))
                    result = a/b;

                stk.push(result);
            } else {
                int currElement = Integer.parseInt(A[i]);
                stk.push(currElement);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        String[] a={"2", "1", "+", "3", "*"};
        String[] b={"4", "13", "5", "/", "+"};

        System.out.println(evalRPN(a));
        System.out.println(evalRPN(b));
    }


}
