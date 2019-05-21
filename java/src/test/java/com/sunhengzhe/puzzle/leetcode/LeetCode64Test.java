package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_64.Solution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCode64Test {
    @Test
    public void test() {
        assertEquals(7, new Solution().minPathSum(new int[][]{
                new int[]{1, 3, 1},
                new int[]{1, 5, 1},
                new int[]{4, 2, 1}
        }));
    }
}
