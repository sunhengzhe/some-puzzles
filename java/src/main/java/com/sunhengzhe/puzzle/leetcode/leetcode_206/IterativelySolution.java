package com.sunhengzhe.puzzle.leetcode.leetcode_206;

import com.sunhengzhe.puzzle.leetcode.common.ListNode;

public class IterativelySolution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode newNode = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newNode;
    }
}
