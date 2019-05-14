package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_52.Solution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCode52Test {
    @Test
    public void test() {
        assertEquals(2, new Solution().totalNQueens(4));
        assertEquals(92, new Solution().totalNQueens(8));
    }
}
