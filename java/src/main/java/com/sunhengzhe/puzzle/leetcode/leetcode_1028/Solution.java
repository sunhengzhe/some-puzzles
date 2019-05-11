package com.sunhengzhe.puzzle.leetcode.leetcode_1028;

import com.sunhengzhe.puzzle.leetcode.common.TreeNode;

import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {

    public TreeNode recoverFromPreorder(String S) {
        if (S.isEmpty()) {
            return null;
        }

        String regex = "(-*)(\\d+)";
        Pattern r = Pattern.compile(regex);
        Matcher m = r.matcher(S);

        // 根节点
        m.find();
        TreeNode root = new TreeNode(Integer.valueOf(m.group(2)));

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        int lastDashLength = 0;
        while (m.find()) {
            int dashLength = m.group(1).length();
            int val = Integer.valueOf(m.group(2));

            TreeNode nextNode = new TreeNode(val);

            if (dashLength <= lastDashLength) {
                for (int j = 0; j < lastDashLength - dashLength + 1; j++) {
                    stack.pop();
                }

                stack.peek().right = nextNode;
            } else {
                stack.peek().left = nextNode;
            }

            stack.push(nextNode);

            lastDashLength = dashLength;
        }

        return root;
    }
}
