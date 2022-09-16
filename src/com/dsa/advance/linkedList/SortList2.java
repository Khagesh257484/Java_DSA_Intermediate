package com.dsa.advance.linkedList;

public class SortList2 {
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null)
            return head;

        // find middle of linked list, if you divide list in 2 part then last node of first list will connect with the null, so have to take one variable with null value
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
