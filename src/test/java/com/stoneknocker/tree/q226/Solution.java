package com.stoneknocker.tree.q226;

import com.stoneknocker.tree.TreeNode;

//https://leetcode.com/problems/invert-binary-tree/description/
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    void invert(TreeNode node) {
        if (node == null) {
            return;
        }
        var tmp = node.left;
        node.left = node.right;
        node.right = tmp;
        invert(node.left);
        invert(node.right);
    }
}
