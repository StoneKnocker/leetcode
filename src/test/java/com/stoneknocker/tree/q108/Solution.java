package com.stoneknocker.tree.q108;

import com.stoneknocker.tree.TreeNode;

public class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length-1);
    }

    public TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }
        int mid = (left+right)/2;
        TreeNode node = new TreeNode(nums[mid]);
        TreeNode l = build(nums, left, mid-1);
        TreeNode r = build(nums, mid+1, right);
        node.left = l;
        node.right = r;

        return node;
    }
}
