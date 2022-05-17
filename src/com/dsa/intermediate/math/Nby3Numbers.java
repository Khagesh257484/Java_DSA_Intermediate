package com.dsa.intermediate.math;
/*
Q4. N/3 Repeat Number
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
If so, return the integer. If not, return -1.

If there are multiple solutions, return any one.



Problem Constraints
1 <= N <= 7*105
1 <= A[i] <= 109


Input Format
The only argument is an integer array A.


Output Format
Return an integer.


Example Input
[1 2 3 1 1]


Example Output
1


Example Explanation
1 occurs 3 times which is more than 5/3 times.

* */
import java.util.List;

public class Nby3Numbers {

    // My Try
    public int repeatedNumber1(final List<Integer> a) {
        int freq = 1;
        int elem = a.get(0);

        // To check Frequency of Element
        for (int i = 1; i < a.size(); i++) {
            if (a.get(i) == elem)
                freq++;
            else {
                if (freq == 0) {
                    elem = a.get(i);
                    freq = 1;
                } else {
                    freq--;
                }
            }
        }

        // To Check Majority Element
        int c = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) == elem)
                c++;
        }
        if (c > (a.size()) / 3)
            return elem;
        else{
            System.out.println("Any number that appears more than n/3 times");
            return -1;}
    }

    public static int repeatedNumber(final List<Integer> a) {
        int c1=0, c2=0, f=Integer.MIN_VALUE, s=Integer.MAX_VALUE;
        for(int i=0;i<a.size();i++){
            if(f==a.get(i)){
                c1++;
            }else if(s==a.get(i)){
                c2++;
            }else if(c1==0){
                f=a.get(i);
                c1++;
            }else if(c2==0){
                s=a.get(i);
                c2++;
            }else{
                c1--;
                c2--;
            }
        }

        c1=0;
        c2=0;
        for(int i=0;i<a.size();i++){
            if(f==a.get(i))
                c1++;
            else if(s==a.get(i))
                c2++;
        }

        if(c1>c2 && c1>a.size()/3){
            return f;
        }else if(c2>c1 && c2>a.size()/3){
            return s;
        }else{
            return -1;
        }
    }
}
