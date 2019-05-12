package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.common.ListNode;
import com.sunhengzhe.puzzle.leetcode.leetcode_206.IterativelySolution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCode206Test {
    @Test
    public void test() {
        ListNode root = new ListNode(1);
        root.next = new ListNode(2);
        root.next.next = new ListNode(3);
        root.next.next.next = new ListNode(4);

        assertEquals("4->3->2->1->NULL", ListNode.print(
                new IterativelySolution().reverseList(root)
        ));
    }
}
