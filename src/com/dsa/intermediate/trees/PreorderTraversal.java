/*
Q2. Preorder Traversal
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree, return the preorder traversal of its nodes' values.

NOTE: Using recursion is not allowed.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return an integer array denoting the preorder traversal of the given binary tree.



Example Input
Input 1:

   1
    \
     2
    /
   3
Input 2:

   1
  / \
 6   2
    /
   3


Example Output
Output 1:

 [1, 2, 3]
Output 2:

 [1, 6, 2, 3]


Example Explanation
Explanation 1:

 The Preoder Traversal of the given tree is [1, 2, 3].
Explanation 2:

 The Preoder Traversal of the given tree is [1, 6, 2, 3].
* */
package com.dsa.intermediate.trees;

import java.util.ArrayList;
import java.util.Stack;

public class PreorderTraversal {
    public ArrayList<Integer> preorderTraversal(TreeNode A) {
        /*
        Algorithm is
         1) Push root in stack
         2) While Stack is not empty
            2.1) pop and store top node of stack in arraylist
            2.2) add in arraylist
            2.3) push if right node is not equal to null
            2.4) push if left node is not equal to null
        * */
        ArrayList<Integer> al = new ArrayList<>();
        Stack s1 = new Stack();

        s1.push(A);
        while (!s1.isEmpty()) {
            TreeNode t = (TreeNode) s1.pop();
            al.add(t.val);
            if (t.right != null) {
                s1.push(t.right);
            }
            if (t.left != null) {
                s1.push(t.left);
            }
        }
        return al;
    }
}
