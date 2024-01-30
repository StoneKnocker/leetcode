package com.stoneknocker.string.q22;


import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        generate(results, sb, n, n);
        return results;
    }

    void generate(List<String> results, StringBuilder sb, int leftParenthesesNum, int rightParenthesesNum) {
        if (leftParenthesesNum > rightParenthesesNum) {
            return;
        }
        if (leftParenthesesNum <0 || rightParenthesesNum < 0) {
            return;
        }
        if (leftParenthesesNum == 0 && rightParenthesesNum == 0) {
            results.add(sb.toString());
            return;
        }
        if (leftParenthesesNum == 0 && rightParenthesesNum > 0) {
            generate(results, new StringBuilder(sb).append(')'), 0, rightParenthesesNum-1);
            return;
        }
        generate(results, new StringBuilder(sb).append('('), leftParenthesesNum-1, rightParenthesesNum);
        generate(results, new StringBuilder(sb).append(')'), leftParenthesesNum, rightParenthesesNum-1);
    }

    public static void main(String[] args) {
        var solution = new Solution();
        System.out.println(solution.generateParenthesis(3));
    }
}