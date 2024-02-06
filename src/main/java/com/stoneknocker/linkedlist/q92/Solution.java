package com.stoneknocker.linkedlist.q92;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left == right) {
            return head;
        }
        ListNode leftNode = null;
        ListNode preLeftNode = null;
        ListNode rightNode = null;
        ListNode postRightNode = null;
        int n=1;
        ListNode tmp = head;
        ListNode previous = new ListNode(0);
        while (tmp != null) {
            if (n == left) {
                leftNode = tmp;
                preLeftNode = previous;
            }
            if (n == right) {
                rightNode = tmp;
                postRightNode = rightNode.next;
            }
            previous = tmp;
            tmp = tmp.next;
            n++;
        }
        
        while (preLeftNode.next != rightNode) {
            preLeftNode.next = leftNode.next;
            leftNode.next = postRightNode;
            rightNode.next = leftNode;
            leftNode = preLeftNode.next;
            postRightNode = rightNode.next;
        }

        if (left == 1) {
            head = preLeftNode.next;
        }
        return head;
    }

    static void printList(ListNode head) {
        var p = head;
        while (p != null) {
            System.out.print(p.val + " ");
            p = p.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListNode linkedlist = new ListNode();
        ListNode point = linkedlist;
        for (int i=1; i<=2; i++) {
            var node = new ListNode(i);
            point.next = node;
            point = point.next;
        }
        var p = linkedlist.next;
        printList(p);

        var solution = new Solution();
        var p2 = solution.reverseBetween(p, 1, 2);
        printList(p2);
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
