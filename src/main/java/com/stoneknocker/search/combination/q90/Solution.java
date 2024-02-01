package com.stoneknocker.search.combination.q90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(nums, 0, new ArrayList<>(), subsets);
        return subsets;
    }

    private void backtrack(int[] nums, int start, List<Integer> path, List<List<Integer>> subsets) {
        subsets.add(new ArrayList<>(path));
        for (int i=start; i<nums.length; i++) {
            if (i>start && nums[i] == nums[i-1]) continue;
            path.add(nums[i]);
            backtrack(nums, i+1, path, subsets);
            path.remove(path.size()-1);
        }

    }

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.subsetsWithDup(new int[]{1,2,2}));
        System.out.println(solution.subsetsWithDup(new int[]{0}));
    }
}