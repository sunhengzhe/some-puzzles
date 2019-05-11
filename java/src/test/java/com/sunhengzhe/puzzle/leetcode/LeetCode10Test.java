package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_10.Solution;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LeetCode10Test {
    @Test
    public void empty_pattern() {
        assertTrue(new Solution().isMatch("", ""));
        assertFalse(new Solution().isMatch("a", ""));
        assertFalse(new Solution().isMatch("a*", ""));
        assertFalse(new Solution().isMatch(".", ""));
        assertFalse(new Solution().isMatch(".*", ""));
    }

    @Test
    public void star_test() {
        assertTrue(new Solution().isMatch("", "a*"));
        assertTrue(new Solution().isMatch("", ".*"));
        assertTrue(new Solution().isMatch("", ".*a*.*"));
        assertTrue(new Solution().isMatch("aaa", "a*"));
        assertTrue(new Solution().isMatch("aaa", "aaab*"));
        assertTrue(new Solution().isMatch("aaa", "a*a*"));
        assertTrue(new Solution().isMatch("aaa", "a*a"));
        assertTrue(new Solution().isMatch("aaa", "aa*"));
        assertTrue(new Solution().isMatch("abcdefg", ".*"));
    }

    @Test
    public void any_test() {
        assertTrue(new Solution().isMatch("", ".*"));
        assertTrue(new Solution().isMatch("a", "."));
        assertTrue(new Solution().isMatch("adfuhg", ".*"));
        assertTrue(new Solution().isMatch("aaa", "..."));
        assertTrue(new Solution().isMatch("aaa", "..*.a"));
        assertFalse(new Solution().isMatch("", "."));
        assertFalse(new Solution().isMatch("abc", ".."));
        assertFalse(new Solution().isMatch("mississippi", "mis*is*p*."));
    }
}
