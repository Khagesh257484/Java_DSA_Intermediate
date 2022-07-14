package com.dsa.intermediate.trees;

import java.util.ArrayList;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }

    public static void main(String[] args) {
        InOrderTraversal iot = new InOrderTraversal();
        TreeNode root = new TreeNode(1);
        TreeNode lr = new TreeNode(6);
        root.left = lr;
        TreeNode lr1 = new TreeNode(4);
        lr.left = lr1;
        TreeNode lr2 = new TreeNode(5);
        lr.right = lr2;
        TreeNode rl = new TreeNode(2);
        root.right = rl;
        TreeNode rl1 = new TreeNode(3);
        rl.left = rl1;
        TreeNode rl2 = new TreeNode(7);
        rl.right = rl2;
        ArrayList<Integer> ans = new ArrayList<>();
        ans = iot.inOrderTraversalWithoutRecursion(root);
        for (Integer ele : ans) {
            System.out.print(ele + " ");
        }
    }
}
