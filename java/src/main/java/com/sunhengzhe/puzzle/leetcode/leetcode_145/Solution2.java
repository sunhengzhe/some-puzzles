package com.sunhengzhe.puzzle.leetcode.leetcode_145;

import com.sunhengzhe.puzzle.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 利用了后序遍历的反向，正好是向右的前序遍历
 */
public class Solution2 {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> printList = new LinkedList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        TreeNode cur = root;

        while (!linkedList.isEmpty() || cur != null) {
            if (cur != null) {
                printList.addFirst(cur.val);
                linkedList.add(cur);
                cur = cur.right;
            } else {
                TreeNode top = linkedList.removeLast();
                cur = top.left;
            }
        }

        return printList;
    }
}
