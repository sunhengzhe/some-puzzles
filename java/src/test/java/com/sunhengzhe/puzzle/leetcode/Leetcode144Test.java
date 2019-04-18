package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.common.TreeNode;
import com.sunhengzhe.puzzle.leetcode.leetcode_144.Solution;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class Leetcode144Test {
    @Test
    public void should_get_postorder_traveral_list() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution solution = new Solution();
        List<Integer> integers = solution.preorderTraversal(root);

        assertTrue(integers.equals(List.of(1, 2, 3, 4, 5, 6, 7)));
    }
}
