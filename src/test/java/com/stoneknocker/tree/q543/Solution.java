package com.stoneknocker.tree.q543;

import com.stoneknocker.tree.TreeNode;

public class Solution {
    private int diameter;
    public int diameterOfBinaryTree(TreeNode root) {
        diameter = 0;
        travel(root);
        return diameter;
    }

    private int travel(TreeNode node) {
        if (node == null){
            return 0;
        }
        int l = travel(node.left);
        int r = travel(node.right);
        diameter = Math.max(diameter, l+r);
        return Math.max(l, r) + 1;
    }

}
