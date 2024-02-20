package com.stoneknocker.stack.q227;

import java.util.Stack;

public class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        char op = '+';
        int result = 0;
        int num = 0;

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                num = num*10 + (int)(c-'0');
            }
            if (isOperater(c) || i == s.length()-1) {
                if (op == '+') {
                    stack.push(num);
                } else if (op == '-') {
                    stack.push(-num);
                } else if (op == '*') {
                    stack.push(stack.pop()*num);
                } else if (op == '/') {
                    stack.push(stack.pop()/num);
                }
                op = c;
                num = 0;
            }
        }
        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static boolean isOperater(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }
}
