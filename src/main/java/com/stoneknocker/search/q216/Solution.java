package com.stoneknocker.search.q216;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> subsets = new ArrayList<>();
        backtrack(subsets, new ArrayList<>(), n, k, 1, n);
        return subsets;
    }

    void backtrack(List<List<Integer>> subsets, List<Integer> combinations, int n, int k, int curr, int remain) {
        if (combinations.size() == k) {
            if (remain == 0) {
                subsets.add(new ArrayList<>(combinations));
            }
            return;
        }
        for (int i=curr; i<n && i<=9; i++) {
            if (remain < i) {
                break;
            }
            combinations.add(i);
            backtrack(subsets, combinations, n, k, i+1, remain-i);
            combinations.remove(combinations.size()-1);
        }
    }


    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.combinationSum3(2,18));
        System.out.println(solution.combinationSum3(9,45));
        System.out.println(solution.combinationSum3(3,7));
        System.out.println(solution.combinationSum3(3,9));
        System.out.println(solution.combinationSum3(4,1));
    }

}