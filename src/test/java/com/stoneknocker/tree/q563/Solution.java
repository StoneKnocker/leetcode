package com.stoneknocker.tree.q563;

import com.stoneknocker.tree.TreeNode;
import java.util.List;

public class Solution {
    private int tiltSum;
    public int findTilt(TreeNode root) {
        tiltSum = 0;
        travel(root);
        return tiltSum;
    }

    private int travel(TreeNode node) {
        if (node == null) {
            return 0;
        }
        var leftValue =  travel(node.left);
        var rightValue =  travel(node.right);
        tiltSum += Math.abs(leftValue - rightValue);
        return leftValue + rightValue + node.val;
    }
}
