/*
Q1. Reversing Elements Of Queue
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given an array of integers A and an integer B, we need to reverse the order of the first B elements of the array, leaving the other elements in the same relative order.

NOTE: You are required to the first insert elements into an auxiliary queue then perform Reversal of first B elements.



Problem Constraints
1 <= B <= length of the array <= 500000
1 <= A[i] <= 100000



Input Format
The argument given is the integer array A and an integer B.



Output Format
Return an array of integer after reversing the first B elements of A using queue.



Example Input
Input 1:

 A = [1, 2, 3, 4, 5]
 B = 3
Input 2:

 A = [5, 17, 100, 11]
 B = 2


Example Output
Output 1:

 [3, 2, 1, 4, 5]
Output 2:

 [17, 5, 100, 11]


Example Explanation
Explanation 1:

 Reverse first 3 elements so the array becomes [3, 2, 1, 4, 5]
Explanation 2:

 Reverse first 2 elements so the array becomes [17, 5, 100, 11]
* */

/*
Ques: Given a queue, reverse first k element of the queue
Example : 3 8 2 10 14 15 16  & k =4

Output : 10 2 8 3 14 15 16


Idea:
-> We can put first k element in stack, after remove first k element queue will be 14 15 16

-> then add back then into queue from stack, after adding queue will be like 14 15 16 10 2 8 3
   if you can observe then first k element has reversed and added in the last of the queue.

-> Now what can we do,
   remove (n-k) element from the front and add back them to rear.


* */

// https://github.com/varunu28/InterviewBit-Java-Solutions/tree/master/Stacks%20%26%20Queues/Problems

package com.dsa.advance.queue;

import java.util.*;

public class ReverseElementInQueue {

    public static int[] solve(int[] A, int B) {

        if (A == null || B > A.length)
            return null;
        if (B <= 0)
            return null;

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<Integer>();

        // Add All element in queue
        for (int i = 0; i < A.length; i++) {
            queue.add(A[i]);
        }
        //System.out.println(queue);

        // Remove B element from queue and add in to stack
        for (int i = 0; i < B; i++) {
            stack.push(queue.peek());
            queue.poll();
        }
        //  System.out.println(queue);

        // remove from stack and add in queue
        while (!stack.isEmpty()) {
            queue.add(stack.peek());
            stack.pop();
        }
        //System.out.println(queue);

        // Remove the remaining elements and enqueue them at the end of the Queue
        for (int i = 0; i < queue.size() - B; i++) {
            queue.add(queue.peek());
            queue.remove();
        }
        //System.out.println(queue);
        int[] arr = queue.stream().mapToInt(Integer::intValue).toArray();
        return arr;

    }

    // Small solution
    public int[] solve2(int[] A, int B) {
        Deque<Integer> q = new ArrayDeque<Integer>(A.length);
        int i = 0;
        // Insert first B elements in queue
        for (i = 0; i < B; i++)
            q.addLast(A[i]);
        // Reverse the first B elements in the array A
        while (q.size() > 0) {
            i--;
            A[i] = q.getFirst();
            q.removeFirst();
        }
        return A;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(solve(a, 3)));
    }

}
