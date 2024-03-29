/*
Q3. Middle element of linked list
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a linked list of integers, find and return the middle element of the linked list.

NOTE: If there are N nodes in the linked list and N is even then return the (N/2 + 1)th element.



Problem Constraints
1 <= length of the linked list <= 100000

1 <= Node value <= 109



Input Format
The only argument given head pointer of linked list.



Output Format
Return the middle element of the linked list.



Example Input
Input 1:

 1 -> 2 -> 3 -> 4 -> 5
Input 2:

 1 -> 5 -> 6 -> 2 -> 3 -> 4


Example Output
Output 1:

 3
Output 2:

 2


Example Explanation
Explanation 1:

 The middle element is 3.
Explanation 2:

 The middle element in even length linked list of length N is ((N/2) + 1)th element which is 2.
* */

package com.dsa.advance.linkedList;

// https://www.youtube.com/watch?v=5blSG0JZNbg&t=425s
public class FindMiddleNode {

    // Count Approach
    public int solve(ListNode A) {
        if (A == null || A.next == null)
            return 0;

        int length = 0;
        ListNode temp = A;

        // first count length
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        int mid = length / 2;
        temp = A;
        while (mid-- > 1) {
            temp = temp.next;
        }
        return temp.next.val;
    }

    // Faster and slow point approach
    public int fasterSlowerApproach(ListNode A) {
        if (A.next == null)
            return A.val;

        ListNode slow = A, fast = A;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;

    }
}
