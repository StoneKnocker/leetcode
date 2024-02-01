package com.stoneknocker.search.combination.q78;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combination = new ArrayList<>();
        for (int i=0; i<=nums.length; i++) {
            findSubset(result, combination, nums, i, i, 0);
        }

        return result;
    }

    void findSubset(List<List<Integer>> result, List<Integer> combination, int[] nums, int combinationNum, int absentNum, int startPos) {
        if (absentNum == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (startPos >= nums.length) {
            return;
        }
        combination.add(nums[startPos]);
        findSubset(result, combination, nums, combinationNum, absentNum-1, startPos+1);
        combination.remove(combination.size()-1);
        findSubset(result, combination, nums, combinationNum, absentNum, startPos+1);
    }

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.subsets(new int[]{1,2,3}));
        System.out.println(solution.subsets(new int[]{0}));
    }
}