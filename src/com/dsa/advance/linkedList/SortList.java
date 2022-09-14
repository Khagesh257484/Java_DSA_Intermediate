/*
Q1. Sort List
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Sort a linked list, A in O(n log n) time using constant space complexity.



Problem Constraints
0 <= |A| = 105



Input Format
The first and the only arugment of input contains a pointer to the head of the linked list, A.



Output Format
Return a pointer to the head of the sorted linked list.



Example Input
Input 1:

A = [3, 4, 2, 8]
Input 2:

A = [1]


Example Output
Output 1:

[2, 3, 4, 8]
Output 2:

[1]


Example Explanation
Explanation 1:

 The sorted form of [3, 4, 2, 8] is [2, 3, 4, 8].
Explanation 2:

 The sorted form of [1] is [1].
* */

// Approach
/*
 1) We can use Insertion sort here but TC in worst case in n2.

 2) So we can use merger sort which has TC = O(nlogn)

 Merge Sort :
   1) To use merge sort, you need to know how can sort 2 array using merge sort and second one is how can we merge 2 sorted list

   2) In merger sort, divide list in 2 part then sort left part and right part


 Algo :
   1) Find middle of linkedList  :: Will use slow and fast pointer approach
   2) sorted first half  -> Recursive call
   3) sorted second half
   4) merge 2 sorted list
* */
package com.dsa.advance.linkedList;

// https://www.youtube.com/watch?v=PHxHAjQ7974
public class SortList {
    // 3->2->5->9->4->1->6->7->Null

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // find middle of linked list, if you divide list in 2 part then last node of last node of list will connect with the null, so have to take one variable with null value


        // temp=head;
        ListNode temp = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;   // when reach last node of left list connect with null

        ListNode leftSide = sortList(head);
        ListNode rightSide = sortList(slow);

        return merge(leftSide, rightSide);
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;
        if (l1 == null)
            return l2;
        if (l2 == null)
            return l1;

        // compare first node value, of l1 and l2 and update in another variable
        // Need one pointer tail which will attach linked list

        ListNode ans, tail;

        // Compare first node value
        if (l1.val < l2.val) {
            ans = l1;  // update node ans
            tail = l1; // attach linked list
            l1 = l1.next; // increase one pointer
        } else {
            ans = l2;
            tail = l2;
            l2 = l2.next;
        }

        // Now compare until didn't reach null any one of linked list
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;     // attach linked list ahead of tail that's why took tail pointer
                tail = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;     // attach linked list ahead of tail that's why took tail pointer
                tail = l2;
                l2 = l2.next;
            }
        }

        // Check ki konsa list bacha hua hai l1 or l2
        if (l1 == null)
            tail.next = l2;
        else
            tail.next = l1;

        return ans;

    }
}
