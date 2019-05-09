package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_264.DpSolution;
import com.sunhengzhe.puzzle.leetcode.leetcode_264.RecursiveSolution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCode264Test {
    @Test
    public void recursive() {
        assertEquals(1, new RecursiveSolution().nthUglyNumber(1));
        assertEquals(8, new RecursiveSolution().nthUglyNumber(7));
    }

    @Test
    public void dp() {
        assertEquals(1, new DpSolution().nthUglyNumber(1));
        assertEquals(8, new DpSolution().nthUglyNumber(7));
        assertEquals(5832, new DpSolution().nthUglyNumber(150));
    }
}
