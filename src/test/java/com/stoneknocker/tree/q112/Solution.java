package com.stoneknocker.tree.q112;

import com.stoneknocker.tree.TreeNode;

public class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        }
        if (root.left == null) {
            return hasPathSum(root.right, targetSum-root.val);
        }
        if (root.right == null) {
            return hasPathSum(root.left, targetSum-root.val);
        }
        return hasPathSum(root.left, targetSum-root.val) || hasPathSum(root.right, targetSum-root.val);
    }
}
