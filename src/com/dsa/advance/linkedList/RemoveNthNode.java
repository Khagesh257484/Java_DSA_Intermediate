/*
Q1. Remove Nth Node from List End
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a linked list A, remove the B-th node from the end of the list and return its head.

For example, Given linked list: 1->2->3->4->5, and B = 2. After removing the second node from the end, the linked list becomes 1->2->3->5.

NOTE: If B is greater than the size of the list, remove the first node of the list.

NOTE: Try doing it using constant additional space.



Problem Constraints
1 <= |A| <= 106



Input Format
The first argument of input contains a pointer to the head of the linked list.

The second argument of input contains the integer B.



Output Format
Return the head of the linked list after deleting the B-th element from the end.



Example Input
Input 1:

A = [1, 2, 3, 4, 5]
B = 2
Input 2:

A = [1]
B = 1


Example Output
Output 1:

[1, 2, 3, 5]
Output 2:

 []


Example Explanation
Explanation 1:

In the first example, 4 is the second last element.
Explanation 2:

In the second example, 1 is the first and the last element.
* */
package com.dsa.advance.linkedList;

// https://www.youtube.com/watch?v=Kncuqqg_I18
// https://www.youtube.com/watch?v=xFAVw4ykbl4
public class RemoveNthNode {

    // FirstPass Algo
    // this solution work if all deleted element present in the list
    public ListNode removeNthFromEnd(ListNode head, int k) {
        if (head == null || head.next == null)
            return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy, kth = dummy;

        // Move current till (k+1)
        for (int i = 0; i <= k + 1; i++) {
            current = current.next;
        }

        // Move current until did not get null
        while (current != null) {
            current = current.next;
            kth = kth.next;
        }
        kth.next = kth.next.next;

        return dummy.next;

    }


    public ListNode removeNthNode(ListNode head, int k) {
        if (head == null || head.next == null)
            return null;

        int length = 0;
        ListNode tmp = head;
        while (tmp != null) {
            tmp = tmp.next;
            length++;
        }
        if (k >= length)
            return head.next;

        int deleteNode = length - k;
        tmp = head;   // doing again head cause in while loop it has null
        for (int i = 0; i < deleteNode-1; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        return head;

    }

    // Scaler Solution
    public ListNode removeNthFromEnd2(ListNode A, int B) {
        int n;
        ListNode node;
        if (A == null)
            return null;
        n = 0;
        node = A;
        while (node != null) {
            n++;
            node = node.next;
        }
        if (B >= n) {
            return A.next;
        }
        node = A;
        for (int i = 0; i < n - B - 1; i++)
            node = node.next;
        node.next = node.next.next;
        return A;
    }

    public static void main(String[] args) {
        RemoveNthNode rm = new RemoveNthNode();

        // creating List node
        ListNode ls = new ListNode(1);
        ListNode ls1 = new ListNode(2);
        ListNode ls2 = new ListNode(3);
        ListNode ls3 = new ListNode(4);
        ListNode ls4 = new ListNode(5);
        ListNode ls5 = new ListNode(6);


    }
}
