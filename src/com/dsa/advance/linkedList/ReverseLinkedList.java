/*
Q5. Reverse Linked List
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given a singly linked list having head node A. You have to reverse the linked list and return the head node of that reversed list.

NOTE: You have to do it in-place and in one-pass.



Problem Constraints
1 <= Length of linked list <= 105

Value of each node is within the range of a 32-bit integer.



Input Format
First and only argument is a linked-list node A.



Output Format
Return a linked-list node denoting the head of the reversed linked list.



Example Input
Input 1:

 A = 1 -> 2 -> 3 -> 4 -> 5 -> NULL
Input 2:

 A = 3 -> NULL


Example Output
Output 1:

 5 -> 4 -> 3 -> 2 -> 1 -> NULL
Output 2:

 3 -> NULL


Example Explanation
Explanation 1:

 The linked list has 5 nodes. After reversing them, the list becomes : 5 -> 4 -> 3 -> 2 -> 1 -> NULL
Expalantion 2:

 The linked list consists of only a single node. After reversing it, the list becomes : 3 -> NULL
* */

package com.dsa.advance.linkedList;

// https://www.youtube.com/watch?v=MsIRa740mQY
public class ReverseLinkedList {
    public ListNode reverseList(ListNode A) {
        if (A == null)   // If linked list has no node
            return null;
        /*
          1-> 2 ->3 ->4 ->5 ->Null
          p   c   n  : need to take 3 pointers, previous, current & next
         Reverse : Null <- 1 <- 2 <- 3 <- 4 <- 5 :
         Above next of 1 is 2, next of 2 is 3 but in reverse linked lit 5 next 4, 4 next 3, 1 next null

         0) Take previous pointer as Null cause need to connect next with null.
                   previous=null;
         1) current pointer next will be previous pointer
             current.next=previous
         2) if current pointer next will be previous pointer then it will lose actual next pointer which is 3
         3) To store the reference of next pointer taking a pointer with next.
              n=head.next;
             stop when u find null as next pointer next reference

        4) 1-> 2 ->3 ->4 ->5 ->Null
                           p   c    n
                           so if current becomes null then need to break loop and point previous as head
          */


        ListNode prev = null, curr = A, n = A.next;

        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = n;
            if (n != null)
                n = n.next;
        }
        return prev;
    }

    // Recursive Solution
    public static void main(String[] args) {

    }
}
