package com.dsa.intermediate.linkedlist;

public class CreateLinkedListAndPrint {
    Node head;
    class Node {
        int data;
        Node next;

        // Constructor
        public Node(int x) {
            this.data = x;
            this.next = null;
        }
    }

    // Create LinkedList from 1 to N number
    public Node createLL(int n) {
        Node head = new Node(1);
        Node temp = head;                // best practice is that don't mess with original node, use temp node
        for (int i = 2; i <= n; i++) {
            Node currNode = new Node(i);
            temp.next = currNode;
            temp = currNode;
        }
        return head;
    }

    // PrintLinkedList, We can make it static or without making static, it will work also
    public static void printLL(Node head) {
        Node n = head;
        while (n != null) {
            //  System.out.print((n.next != null) ? ("[" + n.data + "]" + " -> ") : (n.data));
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        // return n;
    }

    public static void main(String[] args) {
        CreateLinkedListAndPrint t = new CreateLinkedListAndPrint();
        Node n = t.createLL(10);
        t.printLL(n);


    }
}
