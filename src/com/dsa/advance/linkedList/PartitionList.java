/*
Q2. Partition List
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a linked list A and a value B, partition it such that all nodes less than B come before nodes greater than or equal to B.

You should preserve the original relative order of the nodes in each of the two partitions.



Problem Constraints
1 <= |A| <= 106

1 <= A[i], B <= 109



Input Format
The first argument of input contains a pointer to the head to the given linked list.

The second argument of input contains an integer, B.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

A = [1, 4, 3, 2, 5, 2]
B = 3
Input 2:

A = [1, 2, 3, 1, 3]
B = 2


Example Output
Output 1:

[1, 2, 2, 4, 3, 5]
Output 2:

[1, 1, 2, 3, 3]


Example Explanation
Explanation 1:

 [1, 2, 2] are less than B wheread [4, 3, 5] are greater than or equal to B.
Explanation 2:

 [1, 1] are less than B wheread [2, 3, 3] are greater than or equal to B.
* */
package com.dsa.advance.linkedList;

// https://www.youtube.com/watch?v=b4FeEwAGDtU
public class PartitionList {
    public ListNode partition(ListNode head, int B) {
        ListNode small = new ListNode(0);
        ListNode higher = new ListNode(0);

        ListNode smallHead = small, higherHead = higher;
        while (head != null) {
            if (head.val < B) {
                // Small list
                smallHead.next = head;
                smallHead = smallHead.next;
            } else {
                // higher list
                higherHead.next = head;
                higherHead = higherHead.next;
            }
            head = head.next;
        }
        higherHead.next = null;
        smallHead.next = higher.next;

        return small.next;
    }

    public static void main(String[] args) {

    }
}
