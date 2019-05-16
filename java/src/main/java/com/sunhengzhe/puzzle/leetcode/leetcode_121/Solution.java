package com.sunhengzhe.puzzle.leetcode.leetcode_121;

public class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int[] table = new int[prices.length];

        for (int i = 1; i < prices.length; i++) {
            table[i] = Math.max(0, table[i - 1] + prices[i] - prices[i - 1]);
            max = Math.max(max, table[i]);
        }

        return max;
    }
}
