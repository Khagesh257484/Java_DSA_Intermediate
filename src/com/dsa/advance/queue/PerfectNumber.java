/*
Q1. Perfect Numbers
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an integer A, you have to find the Ath Perfect Number.

A Perfect Number has the following properties:

It comprises only 1 and 2.

The number of digits in a Perfect number is even.

It is a palindrome number.

For example, 11, 22, 112211 are Perfect numbers, where 123, 121, 782, 1 are not.



Problem Constraints
1 <= A <= 100000



Input Format
The only argument given is an integer A.



Output Format
Return a string that denotes the Ath Perfect Number.



Example Input
Input 1:

 A = 2
Input 2:

 A = 3


Example Output
Output 1:

 22
Output 2:

 1111


Example Explanation
Explanation 1:

First four perfect numbers are:
1. 11
2. 22
3. 1111
4. 1221
Explanation 2:

First four perfect numbers are:
1. 11
2. 22
3. 1111
4. 1221
* */

/*
https://community.scaler.com/t/perfect-number-solution-using-java-700ms/11541

Perfect Number :
 Find Ath perfect number. If a number is comprises only digits of 1 & 2 and it has even length.'
 It must be palindromic number also.

11 : it's palindromic and contains only one
22 : same
1111 : same
1121 : it is not perfect number cause it is not palindromic but first condition satisfied that it contains only number 1 and 2.
1221 : it is palindromic.

2 : is not, it has odd length.
123 : is not, it contains 3
11111: is not it has odd length.

How can generate a perfect number :

-> Here one secret is hidden in number for example
   1221 : Divide this number is 2 part that is 12 and 21
    If we reverse 12 then 21 will answer and if we concate the number 12 and 21 = 1221 this is my perfect number/

-> 121 121 = 121121 = of 6 length
   12  21  = 1221 = 4 length
   11  11  = 1111 = 4 length
   122 221 = 122221 = 6 length

-> Suppose you have 2 number a & b and a < b
   find reverse of a and b that is a_ & b_
   and if you concate aa_ & bb_ then it will be also aa_ <bb_

   a=13 and b=15
   a < b && aa_ < bb_
   13 < 15 && 1331 < 1551

-> First five perfect number

Perfect : 11   22    1111   1221   2112    2222
Half    : 1    2      11      12    21      22

if we append 1 with 1 = 11
if we append 1 with 2 = 12
if we append 2 with 1 = 21
if we append 2 with 2 = 22
   If you can observer from here then we need 2 number initially 1 & 2 .

Below all combintation is of odd length so it is not possible
if we append 11 with 1= 111
if we append 11 with 2 = 112

Below all combination of even length, so it is possible.
if we append 12 with 11= 1211
if we append 12 with 22 = 122 2

->



* */

package com.dsa.advance.queue;

import java.util.LinkedList;
import java.util.Queue;

public class PerfectNumber {
    public static String solve(int A) {
        Queue<String> que= new LinkedList<>();    // creating string type cause knowing length of string is easy.
        que.add("1");que.add("2");     // To Generate a number add 1 & 2 initially
        int count=0;
        while(count<=A && !que.isEmpty()){  // fetch value from queue until you did not reach till Ath and queue is not empty

            String str= que.poll();   // 1
          //  System.out.println("1 : "+str);
            count++;
            if(count==A){
                StringBuilder sb= new StringBuilder();
                sb.append(str);  // 1 will append
         //       System.out.println("2  : "+sb.toString());

                int i=str.length()-1;  // 0

                while (i>=0){
                    sb.append(str.charAt(i));
           //         System.out.println("3 : "+sb.toString());
                    i--;
                }
             //   System.out.println("4 : "+sb.toString());
                return sb.toString();
            }
            que.add(str+"1");
            que.add(str+"2");
        }
        return  "";
    }

    public String solve2(int A) {
        Queue < String > q = new LinkedList < String > ();
        if (A == 1)
            return "11";
        else if (A == 2)
            return "22";
        q.add("1");
        q.add("2");
        int cur = 2;
        String ans = new String();
        while (q.size() < A) {
            StringBuilder sb = new StringBuilder(q.peek());
            q.remove();
            sb.append("1");
            q.add(sb.toString());
            cur++;
            if (cur == A)
                ans = sb.toString();
            sb.deleteCharAt(sb.length() - 1);
            sb.append("2");
            cur++;
            if (cur == A)
                ans = sb.toString();
            q.add(sb.toString());
        }
        StringBuilder sb = new StringBuilder(ans);
        return ans + sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solve(4));
    }
}
