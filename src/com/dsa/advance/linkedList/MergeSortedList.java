/*
Q2. Merge Two Sorted Lists
Solved
character backgroundcharacter
Wohoooo!
Your code has been successfully submitted
Correct Answer
Correct Answer - You got 300/300
Score Breakup:
Unlocked hint(s): 0
Submission score: 300
score added to daily goal
Daily goal added: 300
All hints are now accessible without any penalty
View Hints
No.	Time	Status	Runtime	Language
1
13 Sep 2022, Tue, 9:08 PM
Correct Answer
3245 ms	Java 8 (oracle-jdk-1.8)
* */

package com.dsa.advance.linkedList;

// https://www.youtube.com/watch?v=0QPpgAsd4IY
public class MergeSortedList {

    // Iterative Solution
    public ListNode merge2List(ListNode l1, ListNode l2) {
        // Base case
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

    // Recursive Solution
    public ListNode merge(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null)
            return null;

        if (l1 == null)
            return l2;

        if (l2 == null)
            return l1;

        // Compare list one node value with list node 2 value , if list node 1 value is smaller than list 2 node value  then take next node of list 1 and call it as recursively. Same is vice versa if l2 node value is smaller than l1 node value

        if (l1.val < l2.val) {
            l1.next = merge(l1.next, l2);
            return l1;
        } else {
            l2.next = merge(l1, l2.next);
            return l2;
        }
    }

    public ListNode mergeList(ListNode A, ListNode B) {
        return merge(A, B);
    }
}
