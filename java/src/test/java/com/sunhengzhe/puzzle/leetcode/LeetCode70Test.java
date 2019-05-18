package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_70.Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LeetCode70Test {
    @Test
    public void test() {
        assertEquals(1, new Solution().climbStairs(1));
        assertEquals(2, new Solution().climbStairs(2));
        assertEquals(3, new Solution().climbStairs(3));
    }
}
