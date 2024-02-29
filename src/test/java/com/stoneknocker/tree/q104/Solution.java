package com.stoneknocker.tree.q104;

import com.stoneknocker.tree.TreeNode;

class Solution {

    public int maxDepth(TreeNode root) {
        return visit(root, 0);
    }

    int visit(TreeNode node, int depth) {
        if (node == null ) {
            return depth;
        }
        depth += 1;
        int leftDepth = visit(node.left, depth);
        int rightDepth = visit(node.right, depth);

        return leftDepth > rightDepth ? leftDepth : rightDepth;
    }
}