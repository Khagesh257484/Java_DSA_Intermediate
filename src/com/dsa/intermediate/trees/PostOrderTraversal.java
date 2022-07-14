/*
Q3. Postorder Traversal
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree, return the Postorder traversal of its nodes' values.

NOTE: Using recursion is not allowed.



Problem Constraints
1 <= number of nodes <= 105



Input Format
First and only argument is root node of the binary tree, A.



Output Format
Return an integer array denoting the Postorder traversal of the given binary tree.



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

 [3, 2, 1]
Output 2:

 [6, 3, 2, 1]


Example Explanation
Explanation 1:

 The Preoder Traversal of the given tree is [3, 2, 1].
Explanation 2:

 The Preoder Traversal of the given tree is [6, 3, 2, 1].

* */

package com.dsa.intermediate.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class PostOrderTraversal {
    public ArrayList<Integer> postorderTraversal(TreeNode A) {
        Stack s1 = new Stack();
        ArrayList<Integer> al = new ArrayList<>();
        s1.push(A);
        while (!s1.isEmpty()) {
            TreeNode t = (TreeNode) s1.pop();
            al.add(t.val);
            if (t.left != null) {
                s1.push(t.left);
            }
            if (t.right != null) {
                s1.push(t.right);
            }
        }
        Collections.reverse(al);
        return al;

    }
}
