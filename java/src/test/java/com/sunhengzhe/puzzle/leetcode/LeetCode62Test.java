package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_62.Solution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCode62Test {
    @Test
    public void test() {
        assertEquals(1, new Solution().uniquePaths(1, 1));
        assertEquals(3, new Solution().uniquePaths(3, 2));
        assertEquals(28, new Solution().uniquePaths(7, 3));
    }
}
