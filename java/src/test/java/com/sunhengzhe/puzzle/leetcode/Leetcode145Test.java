package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.common.TreeNode;
import com.sunhengzhe.puzzle.leetcode.leetcode_145.Solution;
import com.sunhengzhe.puzzle.leetcode.leetcode_145.Solution2;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

public class Leetcode145Test {

    @Test
    public void should_get_postorder_traveral_list_null() {
        TreeNode root = null;

        Solution solution = new Solution();
        List<Integer> integers = solution.postorderTraversal(root);

        List<Integer> expected = Collections.emptyList();

        Assert.assertTrue(expected.equals(integers));
    }

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
        List<Integer> integers = solution.postorderTraversal(root);

        List<Integer> expected = List.of(3, 4, 2, 6, 7, 5, 1);

        Assert.assertTrue(expected.equals(integers));
    }

    @Test
    public void should_get_postorder_traveral_list_null_2() {
        TreeNode root = null;

        Solution2 solution = new Solution2();
        List<Integer> integers = solution.postorderTraversal(root);

        List<Integer> expected = Collections.emptyList();

        Assert.assertTrue(expected.equals(integers));
    }

    @Test
    public void should_get_postorder_traveral_list_2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        Solution2 solution = new Solution2();
        List<Integer> integers = solution.postorderTraversal(root);

        List<Integer> expected = List.of(3, 4, 2, 6, 7, 5, 1);

        Assert.assertTrue(expected.equals(integers));
    }
}
