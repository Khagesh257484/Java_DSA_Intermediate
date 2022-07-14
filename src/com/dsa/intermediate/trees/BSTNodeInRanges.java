package com.dsa.intermediate.trees;

public class BSTNodeInRanges {
    int count = 0;

    public static int countsNodeInRange(TreeNode A, int B, int C) {
        int count = 0;
        if (A == null)
            return 0;
        int left = countsNodeInRange(A.left, B, C);
        int right = countsNodeInRange(A.right, B, C);

        if (A.val >= B && A.val <= C) {
            count = 1;
        }
        return left + right + count;
    }

    public static int countsNodeInRange_Optimized(TreeNode A, int B, int C) {
        if (A == null)
            return 0;

        if (A.val >= B && A.val <= C) {
            return 1 + countsNodeInRange(A.left, B, C) + countsNodeInRange(A.right, B, C);   // One is the main node
        } else if (A.val > C)   // If Node value is greater than it's right node value then it will go left side
            return countsNodeInRange(A.left, B, C);
        else // If Node value is smaller than it's left node value then it will go right side
            return countsNodeInRange(A.right, B, C);

    }

    public static void main(String[] args) {
        TreeNode A = new TreeNode(15);
        TreeNode rLeft = new TreeNode(12);
        A.left = rLeft;

        TreeNode rLeft1 = new TreeNode(10);
        rLeft.left = rLeft1;

        TreeNode rLeftR1 = new TreeNode(14);
        rLeft.right = rLeftR1;

        TreeNode rLeft11 = new TreeNode(8);
        rLeft1.left = rLeft11;

        TreeNode rRight = new TreeNode(20);
        A.right = rRight;

        TreeNode rRightL1 = new TreeNode(16);
        rRight.left = rRightL1;

        TreeNode rRightR1 = new TreeNode(27);
        rRightL1.right = rRightR1;

        int B = 12;
        int C = 20;

        System.out.println(countsNodeInRange(A, B, C));
        System.out.println(countsNodeInRange_Optimized(A, B, C));


    }
}
