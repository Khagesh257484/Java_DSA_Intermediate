package com.dsa.intermediate.trees;


import java.util.ArrayList;

public class PathToGivenNode {

    // This is for explanation
    public boolean findNode(TreeNode A, int B) {
        if (A == null)
            return false;
        if (A.val == B)     // data
            return true;

        if (findNode(A.left, B))    // left     // If B found in left subtree then return true
            return true;

        if (findNode(A.right, B))  // right   : Combination of DLR : Preorder
            return true;

        return false;    // If above all condition not satisfied that means did not get node so return false
    }

    ArrayList<Integer> path = new ArrayList<>();

    public ArrayList<Integer> solve(TreeNode A, int B) {
        if (getNode(A, B))
            return path;
        else
            return null;
    }

    public boolean getNode(TreeNode A, int B) {
        if (A == null)
            return false;

        path.add(A.val);

        if (A.val == B) {
            // path.add(A.val);
            return true;
        }
        if (getNode(A.left, B) || getNode(A.right, B)) {
            //  path.add(A.val);
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }
}
