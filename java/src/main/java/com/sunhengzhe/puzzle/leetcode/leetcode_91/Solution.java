package com.sunhengzhe.puzzle.leetcode.leetcode_91;

public class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) {
            return 0;
        }

        int[] table = new int[n + 1];
        table[n]  = 1;
        table[n - 1] = s.charAt(n-1) != '0' ? 1 : 0;

        for (int i = n - 2; i >= 0; i--) {
            if (s.charAt(i) == '0') {
                continue;
            } else {
                table[i] = (
                        Integer.parseInt(s.substring(i ,i + 2)) <= 26
                ) ? table[i + 1] + table[i + 2] : table[i + 1];
            }
        }

        return table[0];
    }
}
