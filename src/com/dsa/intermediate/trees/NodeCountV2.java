/*
Q2. Counting the Nodes
Unsolved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
Given the root of a tree A with each node having a certain value, find the count of nodes with more value than all its ancestor.



Problem Constraints
1 <= Number of Nodes <= 200000

1 <= Value of Nodes <= 2000000000



Input Format
The first and only argument of input is a tree node.



Output Format
Return a single integer denoting the count of nodes that have more value than all of its ancestors.



Example Input
Input 1:


     3
Input 2:


    4
   / \
  5   2
     / \
    3   6


Example Output
Output 1:

 1
Output 2:

 3


Example Explanation
Explanation 1:

 There's only one node in the tree that is the valid node.
Explanation 2:

 The valid nodes are 4, 5 and 6.
* */

package com.dsa.intermediate.trees;

public class NodeCountV2 {
    int count = 0;
    public int countAncestorNodes(TreeNode A, int max) {
        if (A == null)
            return 0;
        // Increment the count if the current node's value is greater than the maximum value in it is ancestors
        if (A.val > max)
            count++;

        countAncestorNodes(A.left, Math.max(max, A.val));   // Traverse Left subtree
        countAncestorNodes(A.right, Math.max(max, A.val));  // Traverse right subtree or Right Traversal
        return count;
    }

    public int solve(TreeNode A) {
        int max = Integer.MIN_VALUE;
        return countAncestorNodes(A, max);
    }
}
