package com.stoneknocker.tree.q530;

import com.stoneknocker.Main;
import com.stoneknocker.tree.TreeNode;

public class Solution {
    private int min;
    private int pre;
    public int getMinimumDifference(TreeNode root) {
        min = Integer.MAX_VALUE;
        pre = -1;
        travel(root);
        return min;
    }

    private void travel(TreeNode node) {
        if (node == null) {
            return;
        }
        travel(node.left);
        if (pre != -1) {
            min = Math.min(Math.abs(pre-node.val), min);
        }
        pre = node.val;
        travel(node.right);
    }
}
