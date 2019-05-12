package com.sunhengzhe.puzzle.leetcode.common;

import java.util.LinkedList;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

    public static String print(TreeNode root) {
        if (root == null) {
            return "[]";
        }

        String output = "[";

        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.remove();
            if (node == null) {
                if (!queue.isEmpty()) {
                    output += "null,";
                }
            } else {
                output += node.val + ",";

                if (node.left != null || node.right != null) {
                    queue.add(node.left);
                    queue.add(node.right);
                }
            }
        }

        return output.substring(0, output.length() - 1) + "]";
    }
}
