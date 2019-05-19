package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_198.Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode198Test {
    @Test
    public void test() {
        assertEquals(8, new Solution().rob(new int[]{8}));
        assertEquals(4, new Solution().rob(new int[]{1,2,3,1}));
        assertEquals(12, new Solution().rob(new int[]{2,7,9,3,1}));
    }
}
