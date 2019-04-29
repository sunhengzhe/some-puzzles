package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_9.Solution2;
import org.junit.Assert;
import org.junit.Test;

public class Leetcode9_2Test {

    @Test
    public void should_fail_with_not_palindrome() {
        Solution2 solution = new Solution2();
        Assert.assertFalse(solution.isPalindrome(-121));
        Assert.assertFalse(solution.isPalindrome(12));
        Assert.assertFalse(solution.isPalindrome(112));
    }

    @Test
    public void should_success_with_odd_digit() {
        Solution2 solution = new Solution2();
        Assert.assertTrue(solution.isPalindrome(0));
        Assert.assertTrue(solution.isPalindrome(101));
        Assert.assertTrue(solution.isPalindrome(12321));
    }

    @Test
    public void should_success_with_even_digit() {
        Solution2 solution = new Solution2();
        Assert.assertTrue(solution.isPalindrome(11));
        Assert.assertTrue(solution.isPalindrome(1221));
        Assert.assertTrue(solution.isPalindrome(123321));
    }
}
