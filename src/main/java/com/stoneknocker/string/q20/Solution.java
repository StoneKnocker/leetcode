package com.stoneknocker.string.q20;


import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> parentheses = new Stack<>();
        for (int i=0;i<s.length();i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                parentheses.push(s.charAt(i));
            } else if(s.charAt(i) == ')') {
                if (parentheses.isEmpty()|| parentheses.pop() != '(') {
                    return false;
                }
            } else if(s.charAt(i) == ']') {
                if (parentheses.isEmpty()|| parentheses.pop() != '[') {
                    return false;
                }
            } else if(s.charAt(i) == '}') {
                if (parentheses.isEmpty()|| parentheses.pop() != '{') {
                    return false;
                }
            }
        }

        return parentheses.isEmpty();
    }
}