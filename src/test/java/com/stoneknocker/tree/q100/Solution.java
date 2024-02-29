package com.stoneknocker.tree.q100;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if (q == null && p == null) {
            return true;
        }
        if (p.val != q.val) {
            return false;
        }
        boolean leftIsSame = isSameTree(p.left, q.left);
        if (!leftIsSame) {
            return false;
        }
        return isSameTree(p.right, q.right);
    }
}