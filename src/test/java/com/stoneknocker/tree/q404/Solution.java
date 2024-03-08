package com.stoneknocker.tree.q404;

import com.stoneknocker.tree.TreeNode;

public class Solution {
    private int sum;
    public int sumOfLeftLeaves(TreeNode root) {
        sum = 0;
        travel(root, false);
        return sum;
    }

    private void travel(TreeNode node, boolean isLeft) {
        if (node.left == null && node.right == null) {
            if (isLeft) {
                sum += node.val;
            }
            return;
        }
        travel(node.left, true);
        travel(node.right, false);
    }
}
