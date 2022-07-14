package com.dsa.intermediate.trees;

public class SymmetricBinaryTree {

    /*
     1) If root node is null that means all tree is null and return true
     2) If one node is null then second node has to be null that is important for symmetric tree
     3)
    * */
    public int isSymmetric(TreeNode A) {
        if (A == null)
            return 1;

        if (isSymmetricTree(A.left, A.right))
            return 1;
        else
            return 0;
    }

    public boolean isSymmetricTree(TreeNode A, TreeNode B) {
        // If one node is null then second has to be null that's why we are assigning value
        if (A == null || B == null)
            return A == B;

        if (A.val != B.val)
            return false;

        return isSymmetricTree(A.left, B.right) && isSymmetricTree(A.right, B.left);

    }
}
