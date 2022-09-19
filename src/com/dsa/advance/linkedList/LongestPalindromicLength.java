/*
Q4. Longest Palindromic List
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a linked list of integers. Find and return the length of the longest palindrome list that exists in that linked list.

A palindrome list is a list that reads the same backward and forward.

Expected memory complexity : O(1)



Problem Constraints
1 <= length of the linked list <= 2000

1 <= Node value <= 100



Input Format
The only argument given is head pointer of the linked list.



Output Format
Return the length of the longest palindrome list.



Example Input
Input 1:

 2 -> 3 -> 3 -> 3
Input 2:

 2 -> 1 -> 2 -> 1 ->  2 -> 2 -> 1 -> 3 -> 2 -> 2


Example Output
Output 1:

 3
Output 2:

 5


Example Explanation
Explanation 1:

 3 -> 3 -> 3 is largest palindromic sublist
Explanation 2:

 2 -> 1 -> 2 -> 1 -> 2 is largest palindromic sublist.
**/
package com.dsa.advance.linkedList;

// https://www.youtube.com/watch?v=nLAnmS4n48I
public class LongestPalindromicLength {
    public int solve(ListNode head) {
        if (head == null)
            return 0;

        if (head.next == null)
            return 1;

        ListNode prev = null;
        ListNode nex = null;
        int result = 1;

        while (head != null) {  // at each step, reversing the node
            nex = head.next;
            head.next = prev;   // reversing

            result = Math.max(result, 2 * getCommonElementCount(prev, nex) + 1);
            result = Math.max(result, 2 * getCommonElementCount(head, nex));

            prev = head;
            head = nex;

        }
        return result;
    }

    public int getCommonElementCount(ListNode a, ListNode b) {
        int count = 0;

        while (a != null && b != null) {
            if (a.val == b.val)
                count++;
            else
                break;

            a = a.next;
            b = b.next;
        }
        return count;
    }


}
