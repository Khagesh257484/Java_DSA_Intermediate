/*
Q1. Invert the Binary Tree
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given a binary tree A, invert the binary tree and return it.

Inverting refers to making the left child the right child and vice versa.



Problem Constraints
1 <= size of tree <= 100000



Input Format
First and only argument is the head of the tree A.



Output Format
Return the head of the inverted tree.



Example Input
Input 1:


     1
   /   \
  2     3
Input 2:


     1
   /   \
  2     3
 / \   / \
4   5 6   7


Example Output
Output 1:


     1
   /   \
  3     2
Output 2:


     1
   /   \
  3     2
 / \   / \
7   6 5   4


Example Explanation
Explanation 1:

Tree has been inverted.
Explanation 2:

Tree has been inverted.
* */

package com.dsa.intermediate.trees;

public class InvertBinaryTree {
    /*
     1) Inverting a binary tree is same as mirror tree but here you need to invert the value. have to place left node value at place of right
     node value and right node value at place of left node value

     2) If you can observe in above point there is nothing it is just a swapping of 2 variables.

     3) So Swap in binary tree, first get left and right node of tree using recursive call then swap node left value with right and right value
     with left

    * */

    public TreeNode invertTree(TreeNode A) {
        if (A == null)
            return null;

        // Getting left and right node value
        TreeNode left = invertTree(A.left);
        TreeNode right = invertTree(A.right);

        // Swapping
        A.left = right;
        A.right = left;

        return A;

    }
}
