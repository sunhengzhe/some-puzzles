package com.sunhengzhe.puzzle.leetcode.leetcode_9;

public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        if (x < 10) {
            return true;
        }

        int digit = (int) Math.log10(x) + 1;

        while (digit > 1) {
            int leftDiv = (int) Math.pow(10, digit - 1);
            int left = x / leftDiv;
            int right = x % 10;

            if (left != right) {
                return false;
            }

            digit -= 2;
            x -= left * leftDiv;
            x /= 10;
        }

        return true;
    }
}
