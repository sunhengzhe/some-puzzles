package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.common.TreeNode;
import com.sunhengzhe.puzzle.leetcode.leetcode_104.Solution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class Leetcode104Test {

    @Test
    public void should_pass_leetcode() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        int maxDepth = solution.maxDepth(root);

        assertEquals(3, maxDepth);
    }
}
