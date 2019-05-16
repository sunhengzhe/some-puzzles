package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_63.Solution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCode63Test {
    @Test
    public void test() {
        assertEquals(2, new Solution().uniquePathsWithObstacles(new int[][]{
                new int[] {0, 0, 0},
                new int[] {0, 1, 0},
                new int[] {0, 0, 0},
        }));

        assertEquals(0, new Solution().uniquePathsWithObstacles(new int[][]{
                new int[] {1}
        }));

        assertEquals(1, new Solution().uniquePathsWithObstacles(new int[][]{
                new int[] {0}
        }));
    }
}
