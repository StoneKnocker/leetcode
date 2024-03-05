package com.stoneknocker.tree.q257;

import com.stoneknocker.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


//https://leetcode.com/problems/binary-tree-paths/description/
public class Solution {

    private List<String> result;

    public List<String> binaryTreePaths(TreeNode root) {
        result = new ArrayList<>();
        travel(root, new StringBuilder());
        return result;
    }

    private void travel(TreeNode node, StringBuilder path) {
        if (node.left == null && node.right == null) {
            path.append(node.val);
            result.add(path.toString());
            return;
        }
        int length = path.length();
        if (node.left != null) {
            travel(node.left, path.append(node.val).append("->"));
        }
        path.setLength(length);
        if (node.right != null) {
            travel(node.right, path.append(node.val).append("->"));
        }
    }

}
