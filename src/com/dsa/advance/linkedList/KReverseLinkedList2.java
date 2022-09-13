package com.dsa.advance.linkedList;

// https://takeuforward.org/data-structure/reverse-linked-list-in-groups-of-size-k/
public class KReverseLinkedList2 {
    int lengthOfLinkedList(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }

    public ListNode reverseList(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int length = lengthOfLinkedList(head);

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;

        ListNode pre = dummyHead;
        ListNode cur;
        ListNode nex;

        while (length >= k) {
            cur = pre.next;
            nex = cur.next;
            for (int i = 1; i < k; i++) {
                cur.next = nex.next;
                nex.next = pre.next;
                pre.next = nex;
                nex = cur.next;
            }
            pre = cur;
            length -= k;
        }
        return dummyHead.next;

    }

    // Scaler Solution
    /*
    public ListNode reverseList(ListNode A, int B) {
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        prev.next = A;
        while (A != null) {
            int cnt = 1;
            ListNode cur = A;
            while (cur.next != null && cnt < B) {
                cnt++;
                cur = cur.next;
            }
            if (cnt == B) {
                ListNode next = cur.next;
                cur.next = null;
                ListNode rev = reverse(A);
                prev.next = rev;
                A.next = next;
            }
            prev = A;
            A = A.next;
        }
        return dummy.next;
    }

    public ListNode reverse(ListNode A) {
        ListNode prev = new ListNode(0), head = A;
        prev.next = A;
        while (A != null) {
            ListNode tmp = A.next;
            A.next = prev;
            prev = A;
            A = tmp;
        }
        head.next = null;
        return prev;
    }
    */
}
