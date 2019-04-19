package com.sunhengzhe.puzzle.leetcode.leetcode_145;

import com.sunhengzhe.puzzle.leetcode.common.TreeNode;

import java.util.*;

/**
 * 多使用一个 list 来记录节点是否被访问过
 */
public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> printList = new ArrayList<>();

        Stack<TreeNode> stack = new Stack();

        TreeNode cur = root;

        LinkedList<TreeNode> visited = new LinkedList<>();

        while (!stack.isEmpty() || cur != null) {
            if (cur != null) {
                stack.push(cur);
                cur = cur.left;
            } else {
                TreeNode top = stack.peek();
                if (visited.contains(top) || top.right == null) {
                    printList.add(top.val);
                    stack.pop();
                } else {
                    visited.add(top);
                    cur = top.right;
                }
            }
        }

        return printList;
    }
}
