package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_91.Solution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCode91Test {
    @Test
    public void test() {
//        assertEquals(0, new Solution().numDecodings(""));
//        assertEquals(0, new Solution().numDecodings("0"));
//        assertEquals(2, new Solution().numDecodings("12"));
        assertEquals(1, new Solution().numDecodings("120"));
        assertEquals(3, new Solution().numDecodings("226"));
    }
}
