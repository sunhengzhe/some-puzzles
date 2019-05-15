package com.sunhengzhe.puzzle.leetcode.leetcode_53;

public class Solution {
    public int maxSubArray(int[] nums) {
        int[] results = new int[nums.length];
        int max = results[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            results[i] = Math.max(results[i - 1] + nums[i], nums[i]);
            max = Math.max(max, results[i]);
        }

        return max;
    }
}
