/*
*
* */

package com.dsa.intermediate.linkedlist;

import java.util.Scanner;

// Creating Node class
class Node {
    int data;
    Node next;

    public Node(int x) {
        this.data = x;
        this.next = null;
    }
}

public class LinkedListOperations {
    static Node head = null;
    static int length = 0;       // taking initially zero, when insert element in list then ++ this and at time of deleting have to --;

    public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        Node temp=head;
        Node newNode=new Node(value);
        if(position>length+1){
            return;
        }
        if(position==1){
            newNode.next=head;
            head=newNode;
        }
        else{
            int i=1;
            while(i<position-1){
                temp=temp.next;

                i++;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }
        length++;
    }

    public static void delete_node(int position) {
        // @params position, integer
        if(position>length) {
            return ;
        }
        if(position==1){
            head=head.next;
        }else{

            int counter=1;
            Node curr=head;
            while(counter<position-1){
                counter++;
                curr=curr.next;
            }
            curr.next=curr.next.next;
        }
        length--;
    }

    public static void print_ll() {
        // Output each element followed by a space
        Node temp=head;
        if(length==1){
            System.out.println(temp.data);
        }
        if(length>1){

            while(temp.next!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.print(temp.data);
        }
    }

   /* public static void insert_node(int position, int value) {
        // @params position, integer
        // @params value, integer
        Node newNode = new Node(value);
        Node temp = head;

        if (position >= 1 && position <= length + 1) {
            if (position == 1) {
                newNode.next = head;
                head = newNode;
                length++;
            }
            else {
                for (int i = 1; i < position - 1; i++) {
                    if (temp.next != null)
                        temp = temp.next;    // in temp,(pos-1)th index element will store
                }
                newNode.next = temp.next;  // 4
                temp.next = newNode;
                length++;
            }
        }

    }

    public static void delete_node(int position) {
        // @params position, integer
        if (position >= 1 && position <= length) {
            if (position == 1) {
                head = head.next;
            } else {
                Node cur_node = head;
                for (int i = 1; i < position - 1; i++) {
                    cur_node = cur_node.next;
                }
                cur_node.next = cur_node.next.next;
                length--;
            }
        }

    }

    public static void print_ll() {
        // Output each element followed by a space
        Node temp = head;
        if (length == 1)
            System.out.println(head.data);

        if (length > 1) {
            while (temp.next != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.print(temp.data);
        }
    }
*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oprn = sc.nextInt();
        for (int i = 1; i <= oprn; i++) {
            String content = sc.next();
            if (content != null && content.equals("i")) {
                int pos = sc.nextInt();
                int value = sc.nextInt();
                insert_node(pos, value);
            } else if (content != null && content.equals("p")) {
                print_ll();
            } else if (content != null && content.equals("d")) {
                int pos = sc.nextInt();
                delete_node(pos);
            }
        }
    }
}
