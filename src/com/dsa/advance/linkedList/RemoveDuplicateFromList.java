/*
Q2. Remove Duplicates from Sorted List
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a sorted linked list, delete all duplicates such that each element appears only once.



Problem Constraints
0 <= length of linked list <= 106



Input Format
First argument is the head pointer of the linked list.



Output Format
Return the head pointer of the linked list after removing all duplicates.



Example Input
Input 1:

 1->1->2
Input 2:

 1->1->2->3->3


Example Output
Output 1:

 1->2
Output 2:

 1->2->3


Example Explanation
Explanation 1:

 Each element appear only once in 1->2.
* */

/*
 It has 2 approach one is using recursion and second is iterative

 Recursion :
  1) In this recursion will do lots of work for exm. 1->1->2->3->3-> Null
     After first node pass all list to recursion, and it will return one head
     compare first node value and new return list value if same then return new head otherwise connect head with
     nre head

* */
package com.dsa.advance.linkedList;

// https://www.youtube.com/watch?v=_Dc1IqY2WpQ
// https://www.youtube.com/playlist?list=PLKZaSt2df1gz775Mz-2gLpY9sld5wH8We
public class RemoveDuplicateFromList {

    // Iterative Solution
    public ListNode removeDuplicate(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val == temp.next.val) {
                ListNode delete = temp.next;
                temp.next = delete.next;
                //temp.next=temp.next.next;
            } else
                temp = temp.next;
        }
        return head;
    }

    // Recursive Solution
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode newHead = deleteDuplicates(head.next);
        if (head.val == newHead.val)
            return newHead;
        else {
            head.next = newHead;
            return head;
        }

    }
}
