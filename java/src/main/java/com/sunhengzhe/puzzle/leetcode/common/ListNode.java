package com.sunhengzhe.puzzle.leetcode.common;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static String print(ListNode root) {
        String rst = "";

        while (root != null) {
            rst += root.val + "->";
            root = root.next ;
        }

        return rst + "NULL";
    }
}
