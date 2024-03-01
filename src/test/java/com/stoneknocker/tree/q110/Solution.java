package com.stoneknocker.tree.q110;

import com.stoneknocker.tree.TreeNode;

public class Solution {
    boolean balanced;
    public boolean isBalanced(TreeNode root) {
        balanced = true;
        getHeight(root, 0);
        return balanced;
    }

    public int getHeight(TreeNode node, int height) {
        if (node == null) {
            return height;
        }
        height++;
        int leftHeight = getHeight(node.left, height);
        int rightHeight = getHeight(node.right, height);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            balanced = false;
        }

        return leftHeight > rightHeight ? leftHeight : rightHeight;
    }

}
