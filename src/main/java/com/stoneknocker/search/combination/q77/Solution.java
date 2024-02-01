package com.stoneknocker.search.combination.q77;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> combinations = new ArrayList<>();
        findCombination(result, combinations,1,n,k);
        return result;
    }

    void findCombination(List<List<Integer>> result, List<Integer> combination, int start, int n, int absentNum) {
        if (absentNum == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (start > n) {
            return;
        }
        combination.add(start);
        findCombination(result, combination, start + 1, n, absentNum-1);
        combination.remove(combination.size()-1);
        if (start<n) {
            findCombination(result, combination, start + 1, n, absentNum);
        }
    }

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.combine(4, 2));
        System.out.println(solution.combine(1, 1));
    }
}