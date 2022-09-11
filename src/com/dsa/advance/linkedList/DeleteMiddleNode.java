/*
Q1. Delete middle node of a Linked List
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given a singly linked list, delete middle of the linked list.

For example, if given linked list is 1->2->3->4->5 then linked list should be modified to 1->2->4->5

If there are even nodes, then there would be two middle nodes, we need to delete the second middle element.

For example, if given linked list is 1->2->3->4->5->6 then it should be modified to 1->2->3->5->6.

Return the head of the linked list after removing the middle node.

If the input linked list has 1 node, then this node should be deleted and a null node should be returned.


Input Format

The only argument given is the node pointing to the head node of the linked list
See Expected Output
* */

package com.dsa.advance.linkedList;

// https://www.youtube.com/watch?v=vIcRdiCrB7I
public class DeleteMiddleNode {
    // Node Class
    class ListNode {
        public int val;
        public ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode solve(ListNode A) {
        if (A == null || A.next == null)    // If it has only one element
            return null;

        // take 3 Node type pointer slow(increment by 1), fast(increment by 2), prev(which will equal slow.next);
        ListNode slow, faster, prev;

        slow = faster =  A;         // initially every pointer at starting
        prev=null;

        // Run loop until fast(fast.next.next)!=null or fast.next!=nul
        while (faster != null && faster.next != null) {
            prev = slow;
            slow = slow.next;
            faster = faster.next.next;   // jump by 2 position so doing next.next
        }
        prev.next = slow.next;
        return A;
    }


    // Second technique is count the all node in linked list then delete it

    // count of nodes
    static int countOfNodes(ListNode head)
    {
        int count = 0;
        while (head != null) {
            head = head.next;
            count++;
        }
        return count;
    }

    static ListNode deleteMid(ListNode head)
    {
        // Base cases
        if (head == null)
            return null;
        if (head.next == null) {
            return null;
        }
        ListNode copyHead = head;

        // Find the count of nodes
        int count = countOfNodes(head);

        // Find the middle node
        int mid = count / 2;

        // Delete the middle node
        while (mid-- > 1) {
            head = head.next;
        }

        // Delete the middle node
        head.next = head.next.next;

        return copyHead;
    }
    public static void main(String[] args) {

    }
}
