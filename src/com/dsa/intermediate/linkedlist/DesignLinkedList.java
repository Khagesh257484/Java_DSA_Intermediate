/*
Q2. Design Linked list
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a matrix A of size Nx3 representing operations. Your task is to design the linked list based on these operations.

There are four types of operations:

0 x -1: Add a node of value x before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.

1 x -1: Append a node of value x to the last element of the linked list.

2 x index: Add a node of value x before the indexth node in the linked list. If the index equals the length of the linked list, the node will be appended to the end of the linked list. If the index is greater than the length, the node will not be inserted.

3 index -1: Delete the indexth node in the linked list, if the index is valid.

A[i][0] represents the type of operation.

A[i][1], A[i][2] represents the corresponding elements with respect to type of operation.

Note: Indexing is 0 based.


Problem Constraints
1 <= Number of operations <= 1000
1 <= All node values <= 109


Input Format
The only argument given is matrix A.


Output Format
Return the pointer to the starting of the linked list.


Example Input
Input 1:
A = [[0, 1, -1],
     [1, 2, -1],
     [2, 3, 1]]
Input 2:

A = [[0, 1, -1],
     [1, 2, -1],
     [2, 3, 1],
     [0, 4, -1],
     [3, 1, -1],
     [3, 2, -1]]


Example Output
Output 1:
1 -> 3 -> 2 -> NULL
Output 2:

4 -> 3 -> NULL


Example Explanation
Explanation 1:
After first operation the list is 1 -> NULL
After second operation the list is 1 -> 2 -> NULL
After third operation the list is 1 -> 3 -> 2 -> NULL
Explanation 2:

After first operation the list is 1 -> NULL
After second operation the list is 1 -> 2 -> NULL
After third operation the list is 1 -> 3 -> 2 -> NULL
After fourth operation the list is 4 -> 1 -> 3 -> 2 -> NULL
After fifth operation the list is 4 -> 3 -> 2 -> NULL
After sixth operation the list is 4 -> 3 -> NULL


* */

package com.dsa.intermediate.linkedlist;

// Node Class creation
class ListNode {
    int data;
    ListNode next;

    public ListNode(int x) {
        this.data = x;
        this.next = null;
    }
}

public class DesignLinkedList {
    ListNode head = null;
    int length = 0;

    public ListNode solve(int[][] A) {
        for (int i = 0; i < A.length; i++) {
            if (A[i][0] == 0) {
                addFirst(A[i][1]);
            } else if (A[i][0] == 1) {
                addAtPosition(A[i][1], length);
            } else if (A[i][0] == 2) {
                addAtPosition(A[i][1], A[i][2]);
            } else if (A[i][0] == 3) {
                deleteNode(A[i][1]);
            }
        }

        return head;
    }

    public void addFirst(int n) {
        // If linked list has node and want to add new node at position 1 then it is needed
        ListNode newNode = new ListNode(n);
        newNode.next = head;
        head = newNode;
        length++;
    }

    // 1 x -1: Append a node of value x to the last element of the linked list.
    // Need to add element in last
    public void addAtPosition(int n, int position) {


        if (position > length)
            return;
        ListNode temp = head;
        ListNode newNode = new ListNode(n);
        if (position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
    }

    public void deleteNode(int position) {
        if (position >= length)
            return;

        if (position == 0) {
            head = head.next;
        } else {
            ListNode temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        length--;
    }

    public void printLL() {
        ListNode temp = head;
        if (temp == null)
            return;
        if (length == 1)
            System.out.println(head.data);
        else {
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        DesignLinkedList list = new DesignLinkedList();
        int[][] A = {{1, 13, -1},
                {3, 0, -1},
                {3, 1, -1},
                {2, 15, 0},
                {3, 0, -1},
                {1, 12, -1},
                {3, 0, -1},
                {1, 19, -1},
                {1, 13, -1},
                {3, 0, -1},
                {0, 12, -1},
                {1, 13, -1},
                {3, 2, -1}};

        int[][] B = {{0, 1, -1},
                {1, 2, -1},
                {2, 3, 1},
                {0, 4, -1},
                {3, 1, -1},
                {3, 2, -1}};
        list.solve(B);
        list.printLL();
    }

}
