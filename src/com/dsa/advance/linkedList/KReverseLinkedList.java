/*
Q2. K reverse linked list
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a singly linked list A and an integer B, reverse the nodes of the list B at a time and return the modified linked list.



Problem Constraints
1 <= |A| <= 103

B always divides A



Input Format
The first argument of input contains a pointer to the head of the linked list.

The second arugment of input contains the integer, B.



Output Format
Return a pointer to the head of the modified linked list.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5, 6]
 B = 2
Input 2:

 A = [1, 2, 3, 4, 5, 6]
 B = 3


Example Output
Output 1:

 [2, 1, 4, 3, 6, 5]
Output 2:

 [3, 2, 1, 6, 5, 4]


Example Explanation
Explanation 1:

 For the first example, the list can be reversed in groups of 2.
    [[1, 2], [3, 4], [5, 6]]
 After reversing the K-linked list
    [[2, 1], [4, 3], [6, 5]]
Explanation 2:

 For the second example, the list can be reversed in groups of 3.
    [[1, 2, 3], [4, 5, 6]]
 After reversing the K-linked list
    [[3, 2, 1], [6, 5, 4]]
* */

package com.dsa.advance.linkedList;

// https://www.youtube.com/watch?v=TeDcLjOOiK4&t=473s
public class KReverseLinkedList {
    /*
     Approach : Can be done using recursion and iteratively both
                first k size group will reverse iteratively and rest of by recursion.
    * */
    public ListNode reverseList(ListNode head, int k) {

        // If ListNode is null, or ListNode is single or if k==1 that means nothing will reverse.
        if (head == null || head.next == null || k == 1)
            return head;

        // Need 2 pointer start and end but end and start can't be same so initially declaring as head and after that will move end to it actual position. So if end goes till k then it will get actual position

        // So increase end k-1 times

        ListNode start = head, end = head;
        int inc = k - 1;

        while (inc-- > 0) {
            end = end.next;   // will get actual position of end
            // Suppose you have 5 size linked list and need to reverse it in 2 groups then 5th element will remainder, so for this have to handle the case if(end==null) return head;

            if (end == null)
                return head;
        }

        ListNode nextHead=reverseList(end.next, k);    // recursive case
        reverse(start, end);

        // Now Recursion work will start
        //ListNode nextHead=reverseList(end.next, k);
        start.next=nextHead;
        return end;

    }

    void reverse(ListNode start, ListNode end) {
        ListNode prev = null, curr = start, nex = start.next;
        while (prev != end) {
            curr.next = prev;
            prev = curr;
            curr = nex;
            if (nex != null)
                nex = nex.next;
        }
    }
}
