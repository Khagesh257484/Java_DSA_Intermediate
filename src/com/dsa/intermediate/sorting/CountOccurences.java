/*
Q2. Count Occurrences
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Find the number of occurrences of bob in string A consisting of lowercase English alphabets.



Problem Constraints
1 <= |A| <= 1000


Input Format
The first and only argument contains the string A, consisting of lowercase English alphabets.


Output Format
Return an integer containing the answer.


Example Input
Input 1:

  "abobc"
Input 2:

  "bobob"


Example Output
Output 1:

  1
Output 2:

  2


Example Explanation
Explanation 1:

  The only occurrence is at second position.
Explanation 2:

  Bob occures at first and third position.

* */

package com.dsa.intermediate.sorting;

public class CountOccurences {
    public static int solve(String A) {
        String s = "bob";
        int n1 = s.length();
        int n = A.length();
        int count=0;

        for (int i = 0; i <= n-n1; i++) {
            if (A.charAt(i) == s.charAt(0)) {
                if (A.substring(i, i + n1).equals(s)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static int countBOB(String s){
        int ans=0;
        char[] c=s.toCharArray();
        for(int i=0;i<c.length-2;i++){
            if(c[i]=='b' && c[i+1]=='o' && c[i+2]=='b'){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(solve("abobcbob"));
        System.out.println(solve("bobobcbobc"));
        /*String s="abobcbob";
        String a="bob";
        System.out.println(s.charAt(1)==a.charAt(0));
        System.out.println(s.substring(1,4));
        System.out.println(s.substring(1,4).equals(a));*/

    }
}
