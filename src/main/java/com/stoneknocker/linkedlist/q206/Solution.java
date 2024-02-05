package com.stoneknocker.linkedlist.q206;

public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode newHead = null;
        while (head != null) {
            ListNode tmp = head;
            head = head.next;
            tmp.next = newHead;
            newHead = tmp;
        }

        return newHead;
    }

    public ListNode reverseList2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tmp = head;
        head= head.next;
        tmp.next = null;
        ListNode newHead = reverseList2(head);
        var p = newHead;
        while (p.next != null) {
            p = p.next;
        }
        p.next = tmp;

        return newHead;
    }


    public static void main(String[] args) {
        ListNode linkedlist = new ListNode();
        ListNode point = linkedlist;
        for (int i=1; i<=5; i++) {
            var node = new ListNode(i);
            point.next = node;
            point = point.next;
        }
        var p = linkedlist.next;
        printList(p);

        var solution = new Solution();
        var p2 = solution.reverseList2(p);
        printList(p2);
    }

    static void printList(ListNode head) {
        var p = head;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
