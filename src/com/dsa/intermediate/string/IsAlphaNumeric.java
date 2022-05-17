package com.dsa.intermediate.string;
/*
Q5. Isalnum()
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved..
Get help from TA.
Problem Description
You are given a function isalpha() consisting of a character array A.

Return 1 if all the characters of a character array are alphanumeric (a-z, A-Z, and 0-9) else, return 0.



Problem Constraints
1 <= |A| <= 105



Input Format
Only argument is a character array A.



Output Format
Return 1 if all the characters of the character array are alphanumeric (a-z, A-Z and 0-9), else return 0.



Example Input
Input 1:

 A = ['S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0']
Input 2:

 A = ['S', 'c', 'a', 'l', 'e', 'r', '#', '2', '0', '2', '0']


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 All the characters are alphanumeric.
Explanation 2:

 All the characters are NOT alphabets i.e ('#').
* */
public class IsAlphaNumeric {
    public int solve(char[] A) {
        if(A.length==0)
            return 0;
        String str=String.valueOf(A);
        boolean value=str.matches("^[a-zA-Z0-9]*$");
        if(value)
            return 1;
        else
            return 0;
    }

    // Second way to solve it
    public  int Isalnum(char[] A) {
        for(int i=0;i<A.length;i++){
            if(!((A[i]>=65 && A[i]<=90) || (A[i]>=97 && A[i]<=122) || (A[i]>=48 && A[i]<=57))){
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        IsAlphaNumeric numeric=new IsAlphaNumeric();
        char[] ch={'S', 'c', 'a', 'l', 'e', 'r', 'A', 'c', 'a', 'd', 'e', 'm', 'y', '2', '0', '2', '0'};
        System.out.println(numeric.solve(ch));
    }
}
