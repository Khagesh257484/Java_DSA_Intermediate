/*
Q3. Palindrome List
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a singly linked list A, determine if it's a palindrome. Return 1 or 0, denoting if it's a palindrome or not, respectively.



Problem Constraints
1 <= |A| <= 105



Input Format
The first and the only argument of input contains a pointer to the head of the given linked list.



Output Format
Return 0, if the linked list is not a palindrome.

Return 1, if the linked list is a palindrome.



Example Input
Input 1:

A = [1, 2, 2, 1]
Input 2:

A = [1, 3, 2]


Example Output
Output 1:

 1
Output 2:

 0


Example Explanation
Explanation 1:

 The first linked list is a palindrome as [1, 2, 2, 1] is equal to its reversed form.
Explanation 2:

 The second linked list is not a palindrom as [1, 3, 2] is not equal to [2, 3, 1].
* */

// Approach

/*

 R -> A -> C -> E -> C -> A -> R -> Null

 -> We can not use 2 pointer like one at start and second one is end cause A connected to R but not R connected to A, so can not use 2 pointer.


Approach 1 :
  1) So we can  reverse entire linked list and compare, if both list is equal then it is palindrome if not then not palindrome.

  2) But it takes O(N) extra space.

Approach 2 :

 1) Reverse half list
    R -> A -> C -> E <- C <- A <- R

 2) If you can observe then now we can use 2 pointer at start and end

 3) Find half or mid of list
    -> Using slow and fast pointer we can get mid, when fast pointer will reach at null, slow pointer will be mid

 4)


* */

package com.dsa.advance.linkedList;

// https://www.youtube.com/watch?v=ee-DuKtRNGw
public class PalindromeLinkedList {
    public int lPalin(ListNode head) {
        if (head == null || head.next == null)
            return 1;

        ListNode slow = head;
        ListNode fast = head;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        slow.next = reverse(slow.next);
        slow = slow.next;
        ListNode dummy = head;

        while (slow != null) {
            if (dummy.val != slow.val)
                return 0;
            dummy = dummy.next;
            slow = slow.next;
        }
        return 1;
    }


    public ListNode reverse(ListNode head) {
        ListNode prev = null, curr = head, n = head.next;

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = n;
            if (n != null)
                n = n.next;
        }
        return prev;
    }

    public ListNode findMid(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
