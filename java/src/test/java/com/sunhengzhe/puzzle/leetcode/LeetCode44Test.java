package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_44.Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeetCode44Test {
    @Test
    public void empty_pattern() {
        assertTrue(new Solution().isMatch("", ""));
        assertFalse(new Solution().isMatch("a", ""));
        assertFalse(new Solution().isMatch("adf", ""));
    }

    @Test
    public void star_test() {
        assertTrue(new Solution().isMatch("", "*"));
        assertTrue(new Solution().isMatch("aaabaa", "*"));
        assertTrue(new Solution().isMatch("asfc", "*c"));
        assertTrue(new Solution().isMatch("ab", "a*b"));
        assertTrue(new Solution().isMatch("accccb", "a*b"));
        assertTrue(new Solution().isMatch("abc", "a*b*c*"));
        assertFalse(new Solution().isMatch("abc", "a*b"));
        assertFalse(new Solution().isMatch("acdcb", "a*c?b"));
        assertFalse(new Solution().isMatch("bb", "a*"));
    }

    @Test
    public void any_test() {
        assertFalse(new Solution().isMatch("", "?"));
        assertTrue(new Solution().isMatch("a", "?"));
        assertTrue(new Solution().isMatch("cb", "?b"));
        assertFalse(new Solution().isMatch("cb", "?a"));
        assertTrue(new Solution().isMatch("abc", "???"));
        assertTrue(new Solution().isMatch("aaa", "?a?"));
        assertTrue(new Solution().isMatch("avhd", "?*"));
        assertTrue(new Solution().isMatch("auwbcb", "a?*b"));
        assertFalse(new Solution().isMatch("auwbcb", "a?*c"));
        assertTrue(new Solution().isMatch("auwbcb", "**"));
        assertTrue(new Solution().isMatch("", "**"));
    }
}
