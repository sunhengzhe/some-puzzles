package com.sunhengzhe.puzzle.leetcode.leetcode_9;

/**
 * 高票回答，使用一个数存储反向的数字
 */
public class Solution2 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverseNumber = 0;

        while (x > reverseNumber) {
            // 反向数字加最右位
            reverseNumber = reverseNumber * 10 + x % 10;
            // 原数删除最右位
            x = x / 10;
        }

        return x == reverseNumber || reverseNumber / 10 == x;
    }
}
