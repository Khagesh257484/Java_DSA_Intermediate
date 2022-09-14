/*
Q1. List Cycle
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Try solving it using constant additional space.

Example:

Input:

                  ______
                 |     |
                 \/    |
        1 -> 2 -> 3 -> 4

Return the node corresponding to node 3.
* */

// Approach

/*

-> In this question need to detect the cycle that where cycle is creating between list node or node.

-> 2 types of question can make here if cycle is present then return true else return false or if cycle is present then return the node from where cycle is creating if not then return null node.


Approach 1 :

                 ______
                 |     |
                 \/    |
        1 -> 2 -> 3 -> 4

-> This can be solve in 2 approach, first Hashmap

-> In above example, you can see that every node visit one time if cycle is not present but if cycle is present then one node will visit 2 times. the versy first node which visit 2 times is the point from cycle begins

  So ans=3;

-> For this, you can store all elements in hashmap, create freq map. when first element comes 2 times then it is start node of cycle.



Approach 2 : Floyd's cycle detection algorithm

-> This approach use slow and fast pointer

-> When slow and fast pointer meet at one node then move current point from start and one another point from the meeting point.
   when this both point meet at point that is the start node of cycle.

* */
package com.dsa.advance.linkedList;

// https://www.youtube.com/watch?v=jcZtMh_jov0&t=767s
public class ListCycle {
    public ListNode detectCycle(ListNode head) {
        // Use slow and fast point approach
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Condition when slow and fast point meets
            if (slow == fast)
                return slow;
        }
        return null;
    }

    public ListNode detectCycleNode(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // Then check cycle is creating or not
        ListNode meetPoint = detectCycle(head);

        // if cycle is not present then return null
        if(meetPoint==null)
            return null;

        // else cycle present then do this operation
        ListNode curr = head;
        while (curr != meetPoint) {
            curr = curr.next;
            meetPoint = meetPoint.next;
        }
        return curr;
    }

}
