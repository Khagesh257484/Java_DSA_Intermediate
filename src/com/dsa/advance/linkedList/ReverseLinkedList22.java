/*
Q4. Reverse Link List II
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Reverse a linked list A from position B to C.

NOTE: Do it in-place and in one-pass.



Problem Constraints
1 <= |A| <= 106

1 <= B <= C <= |A|



Input Format
The first argument contains a pointer to the head of the given linked list, A.

The second arugment contains an integer, B.

The third argument contains an integer C.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = 1 -> 2 -> 3 -> 4 -> 5
 B = 2
 C = 4

Input 2:

 A = 1 -> 2 -> 3 -> 4 -> 5
 B = 1
 C = 5


Example Output
Output 1:

 1 -> 4 -> 3 -> 2 -> 5
Output 2:

 5 -> 4 -> 3 -> 2 -> 1


Example Explanation
Explanation 1:

 In the first example, we want to reverse the highlighted part of the given linked list : 1 -> 2 -> 3 -> 4 -> 5
 Thus, the output is 1 -> 4 -> 3 -> 2 -> 5
Explanation 2:

 In the second example, we want to reverse the highlighted part of the given linked list : 1 -> 4 -> 3 -> 2 -> 5
 Thus, the output is 5 -> 4 -> 3 -> 2 -> 1
* */
package com.dsa.advance.linkedList;

/*
 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> Null

 1 -> 5 -> 4 -> 3 -> 2 -> 6 -> Null

 Approach 1 :
   1) We can send Linked list from 2 to 5 to reverse function, it will reverse this list and we will get list
      like 5 -> 4 -> 3 -> 2

   2) Now connect reverse list head with just previous element next
      1.next -> 5.head

   3) and connect 2.next -> with 6 .... all part of list


 Approach 2:   https://www.youtube.com/watch?v=X8E8y2k9bdQ

   1) We can reverse linked List using 3 pointers prev,curr,next

   2) take start node as current, next=current.next and previous will be just before of current node

   3) 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> Null
      p    c    n
         first reverse 2 and 3 in
         1->3->2->4->5->6->Null
         now reverse 3 and 4 to get answer
         1->4->3->2->5->6->Null

       If you can observe then curr.next=next.next
                              2 -> 4
              next.next=prev.next
                3 -> 2 && 2 -> = 3 -> 2 -> 4
              prev.next=next
              1 -> 4

      Note : if m=1 then it is special case need to handle this using dummy node
* */
public class ReverseLinkedList22 {

    // First Approach
    public ListNode reverseBetween(ListNode A, int m, int n) {
        int i;
        ListNode node = A;
        ListNode prev = null;
        m--;
        n--;
        for (i = 0; i < m; i++) {
            prev = node;
            node = node.next;
        }
        if (prev != null)
            prev.next = reverseList(node, n - m + 1);
        else
            A = reverseList(node, n - m + 1);
        return A;
    }

    public ListNode reverseList(ListNode A, int count) {
        ListNode node, prev, temp, last;
        node = A;
        last = A;
        if (node == null)
            return null;
        prev = null;
        while (node != null && count > 0) {
            temp = node.next;
            node.next = prev;
            prev = node;
            node = temp;
            count--;
        }
        last.next = node;
        return prev;
    }

    // Second Approach
    public ListNode reverseBetween1(ListNode head, int B, int C) {
        if (head == null)
            return null;

        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        dummy.next = head;

        for (int i = 0; i < B - 1; i++) {
            prev = prev.next;
        }

        ListNode start = prev.next, nex = start.next;

        for (int i = 0; i < C - B; i++) {
            start.next = nex.next;
            nex.next = prev.next;
            prev.next = nex;
            nex = start.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {

    }
}
