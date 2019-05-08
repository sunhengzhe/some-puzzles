package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_32.Solution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCode32Test {

    private Solution solution = new Solution();

    @Test
    public void has_no_pairs() {
        assertEquals(0, solution.longestValidParentheses(""));
        assertEquals(0, solution.longestValidParentheses("("));
        assertEquals(0, solution.longestValidParentheses(")"));
        assertEquals(0, solution.longestValidParentheses(")("));
        assertEquals(0, solution.longestValidParentheses(")))(("));
    }

    @Test
    public void has_one_substring() {
        assertEquals(2, solution.longestValidParentheses("(()"));
        assertEquals(6, solution.longestValidParentheses("(())())"));
    }

    @Test
    public void has_multi_substring() {
        assertEquals(6, solution.longestValidParentheses("()()))(())()"));
    }
}
