package com.sunhengzhe.puzzle.leetcode.leetcode_144;

import com.sunhengzhe.puzzle.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> printList = new ArrayList<>();

        if (root == null) {
            return printList;
        }

        Stack<TreeNode> stack = new Stack();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode top = stack.pop();

            printList.add(top.val);

            if (top.right != null) {
                stack.push(top.right);
            }

            if (top.left != null) {
                stack.push(top.left);
            }
        }

        return printList;
    }
}
