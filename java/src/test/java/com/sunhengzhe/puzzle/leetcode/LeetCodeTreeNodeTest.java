package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.common.TreeNode;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCodeTreeNodeTest {
    @Test
    public void should_print_correct() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        assertEquals("[1,2,5,3,null,null,6,null,4]", TreeNode.print(root));
    }
}
