package com.stoneknocker.queue.q225;

import java.util.ArrayDeque;

public class MyStack {

    private ArrayDeque<Integer> queue;
    
    public MyStack() {
        queue = new ArrayDeque<>();
    }
    
    public void push(int x) {
        queue.add(x);
    }
    
    public int pop() {
        return queue.pollLast();
    }
    
    public int top() {
        return queue.peekLast();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(1);
        myStack.push(2);
        System.out.println(myStack.top()); // return 2
        System.out.println(myStack.pop()); // return 2
        System.out.println(myStack.empty()); // return 2
    }
}
