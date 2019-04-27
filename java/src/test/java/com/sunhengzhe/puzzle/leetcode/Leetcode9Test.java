package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_9.Solution;
import org.junit.Assert;
import org.junit.Test;

public class Leetcode9Test {

    @Test
    public void should_fail_with_not_palindrome() {
        Solution solution = new Solution();
        Assert.assertFalse(solution.isPalindrome(-121));
        Assert.assertFalse(solution.isPalindrome(12));
        Assert.assertFalse(solution.isPalindrome(112));
    }

    @Test
    public void should_success_with_odd_digit() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isPalindrome(0));
        Assert.assertTrue(solution.isPalindrome(101));
        Assert.assertTrue(solution.isPalindrome(12321));
    }

    @Test
    public void should_success_with_even_digit() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.isPalindrome(11));
        Assert.assertTrue(solution.isPalindrome(1221));
        Assert.assertTrue(solution.isPalindrome(123321));
    }
}
