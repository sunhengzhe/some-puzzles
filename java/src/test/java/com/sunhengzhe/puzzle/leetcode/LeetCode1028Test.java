package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_1028.Solution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCode1028Test {
    Solution solution = new Solution();

    @Test
    public void should_pass_leetcode() {
        assertEquals("[1,2,5,3,4,6,7]", solution.recoverFromPreorder("1-2--3--4-5--6--7").print());
        assertEquals("[1,2,5,3,null,6,null,4,null,7]", solution.recoverFromPreorder("1-2--3---4-5--6---7").print());
        assertEquals("[1,401,null,349,88,90]", solution.recoverFromPreorder("1-401--349---90--88").print());
    }
}
