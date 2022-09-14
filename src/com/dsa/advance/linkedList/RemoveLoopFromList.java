/*
Q2. Remove Loop from Linked List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a linked list that contains a loop.
You need to find the node, which creates a loop and break it by making the node point to NULL.



Problem Constraints
1 <= number of nodes <= 1000



Input Format
Only argument is the head of the linked list.



Output Format
return the head of the updated linked list.



Example Input
Input 1:


1 -> 2
^    |
| - -
Input 2:

3 -> 2 -> 4 -> 5 -> 6
          ^         |
          |         |
          - - - - - -


Example Output
Output 1:

 1 -> 2 -> NULL
Output 2:

 3 -> 2 -> 4 -> 5 -> 6 -> NULL


Example Explanation
Explanation 1:

 Chain of 1->2 is broken.
Explanation 2:

 Chain of 4->6 is broken.

* */

package com.dsa.advance.linkedList;

public class RemoveLoopFromList {
    // First Approach
    public ListNode solve2(ListNode A) {
        detectAndRemoveLoop(A);
        return A;
    }

    int detectAndRemoveLoop(ListNode node) {
        ListNode slow = node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet at same point then loop is present
            if (slow == fast) {
                removeLoop(slow, node);
                return 1;
            }
        }
        return 0;
    }

    // Function to remove loop
    void removeLoop(ListNode loop, ListNode curr) {
        ListNode ptr1 = null;
        ListNode ptr2 = null;
        /* Set a pointer to the beginning of the Linked List and
         move it one by one to find the first node which is
         part of the Linked List */
        ptr1 = curr;
        while (1 == 1) {
            /* Now start a pointer from loop_node and check if it ever
             reaches ptr2 */
            ptr2 = loop;
            while (ptr2.next != loop && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }
            /* If ptr2 reahced ptr1 then there is a loop. So break the
             loop */
            if (ptr2.next == ptr1) {
                break;
            }
            /* If ptr2 did't reach ptr1 then try the next node after ptr1 */
            ptr1 = ptr1.next;
        }
        /* After the end of loop ptr2 is the last node of the loop. So
         make next of ptr2 as NULL */
        ptr2.next = null;
    }


    // Second Approach
    public ListNode solve(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
                break;
        }

        if (slow == fast) {
            slow = head;
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
            } else {
                while (fast.next != slow) {
                    fast = fast.next;
                }
            }
            fast.next = null;
        }
        return head;
    }
}
