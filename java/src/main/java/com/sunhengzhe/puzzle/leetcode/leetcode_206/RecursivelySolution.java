package com.sunhengzhe.puzzle.leetcode.leetcode_206;

import com.sunhengzhe.puzzle.leetcode.common.ListNode;

public class RecursivelySolution {
    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode next;

        while (head != null) {
            next = head.next;
            head.next = prev;
            head = next;
        }

        return head;
    }
}
