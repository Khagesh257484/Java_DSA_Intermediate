/*
Q3. Nodes Count
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Problem Description
You are given the root node of a binary tree A. You have to find the number of nodes in this tree.



Problem Constraints
1 <= Number of nodes in the tree <= 105

0 <= Value of each node <= 107



Input Format
The first and only argument is a tree node A.



Output Format
Return an integer denoting the number of nodes of the tree.



Example Input
Input 1:

 Values =  1
          / \
         4   3
Input 2:


 Values =  1
          / \
         4   3
        /
       2


Example Output
Output 1:

 3
Output 2:

 4


Example Explanation
Explanation 1:

Clearly, there are 3 nodes 1, 4 and 3.
Explanation 2:

Clearly, there are 4 nodes 1, 4, 3 and 2.



See Expected Output
* */

package com.dsa.intermediate.trees;

public class NodesCount {
    public int solve(TreeNode A) {
        if (A == null)
            return 0;

        int ln = solve(A.left);
        int rn = solve(A.right);
        return ln + rn + 1;
    }

    public int solve2(TreeNode A) {
        if(A==null)
            return 0;

        int ln=solve2(A.left);
        int rn=solve2(A.right);
        return ln+rn+1;
    }
}
