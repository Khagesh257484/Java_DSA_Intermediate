/*
Q1. Inorder Traversal
Attempted
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree, return the inorder traversal of its nodes' values.

NOTE: Using recursion is not allowed.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return an integer array denoting the inorder traversal of the given binary tree.



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

 [1, 3, 2]
Output 2:

 [6, 1, 3, 2]


Example Explanation
Explanation 1:

 The Inorder Traversal of the given tree is [1, 3, 2].
Explanation 2:

 The Inorder Traversal of the given tree is [6, 1, 3, 2].
* */
package com.dsa.intermediate.trees;

import java.util.ArrayList;
import java.util.Stack;

public class InOrderTraversal {

    public ArrayList<Integer> inOrderTraversalWithoutRecursion(TreeNode A) {
        ArrayList<Integer> al = new ArrayList<>();
        Stack st = new Stack();

        while (A != null || !st.isEmpty()) {
            if (A != null) {
                st.push(A);
                A = A.left;
            } else {
                TreeNode root = (TreeNode) st.pop();
                al.add(root.val);
                A = root.right;
            }
        }
        return al;
    }

}
