package com.stoneknocker.tree.q111;

import com.stoneknocker.tree.TreeNode;

public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return getMinDepth(root, 0);
    }

    private int getMinDepth(TreeNode node, int depth) {
        if (node.left == null && node.right == null) {
            return depth+1;
        }
        if (node.left == null) {
            return getMinDepth(node.right, depth+1);
        }
        if (node.right == null) {
            return getMinDepth(node.left, depth+1);
        }
        int leftDepth = getMinDepth(node.left, depth+1);
        int rightDepth = getMinDepth(node.right, depth+1);
        return Math.min(leftDepth, rightDepth);
    }
}
