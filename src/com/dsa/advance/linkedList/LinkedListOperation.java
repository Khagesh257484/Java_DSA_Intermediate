/*
Q6. Linked-List
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Design and implement a Linked List data structure.
A node in a linked list should have the following attributes - an integer value and a pointer to the next node. It should support the following operations:

insert_node(position, value) - To insert the input value at the given position in the linked list.
delete_node(position) - Delete the value at the given position from the linked list.
print_ll() - Print the entire linked list, such that each element is followed by a single space.
Note:

If an input position does not satisfy the constraint, no action is required.
Each print query has to be executed in a new line.


Problem Constraints
1 <= value <= 105
1 <= position <= n where, n is the size of the linked-list.



Input Format
First line contains an integer denoting number of cases, let's say t.
Next t line denotes the cases.


Output Format
When there is a case of print_ll(),  Print the entire linked list, such that each element is followed by a single space.
NOTE: You don't need to return anything.


Example Input
5
i 1 23
i 2 24
p
d 1
p


Example Output
23 24
24


Example Explanation
After first two cases linked list contains two elements 23 and 24.
At third case print: 23 24.
At fourth case delete value at first position, only one element left 24.
At fifth case print: 24.

* */

package com.dsa.advance.linkedList;

public class LinkedListOperation {
    // Creating Node class
    static class Node {
        int data;
        Node next;

        public Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    static Node head = null;
    static int length = 0;       // taking initially zero, when insert element in list then ++ this and at time of deleting have to --;

    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        Node temp = head;
        Node newNode = new Node(value);
        if (position > length + 1) {
            return;
        }
        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            int i = 1;
            while (i < position - 1) {
                temp = temp.next;

                i++;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
    }

    public static void delete_node(int position) {
        // @params position, integer
        if (position > length) {
            return;
        }
        if (position == 1) {
            head = head.next;
        } else {

            int counter = 1;
            Node curr = head;
            while (counter < position - 1) {
                counter++;
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        length--;
    }

    public static void print_ll() {
        // Output each element followed by a space
        Node temp = head;
        if (length == 1) {
            System.out.println(temp.data);
        }
        if (length > 1) {

            while (temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }

    public static void main(String[] args) {

    }
}
