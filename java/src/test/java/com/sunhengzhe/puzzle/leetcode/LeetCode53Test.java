package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_53.Solution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCode53Test {
    @Test
    public void all_is_positive() {
        assertEquals(1, new Solution().maxSubArray(new int[]{1}));
        assertEquals(6, new Solution().maxSubArray(new int[]{1, 2, 3}));
    }

    @Test
    public void all_is_negative() {
        assertEquals(-1, new Solution().maxSubArray(new int[]{-1, -1, -1}));
        assertEquals(-1, new Solution().maxSubArray(new int[]{-1, -2, -3}));
    }

    @Test
    public void test() {
        assertEquals(6, new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}
