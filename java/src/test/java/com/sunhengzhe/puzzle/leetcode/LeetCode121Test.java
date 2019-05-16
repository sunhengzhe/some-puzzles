package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_121.Solution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCode121Test {
    @Test
    public void test() {
        assertEquals(5, new Solution().maxProfit(new int[]{7,1,5,3,6,4}));
        assertEquals(0, new Solution().maxProfit(new int[]{7,6,4,3,1}));
    }
}
