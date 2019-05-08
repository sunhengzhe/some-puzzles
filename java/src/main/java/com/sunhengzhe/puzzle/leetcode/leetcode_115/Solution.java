package com.sunhengzhe.puzzle.leetcode.leetcode_115;

/*
 * @lc app=leetcode id=115 lang=java
 *
 * [115] Distinct Subsequences
 */
public class Solution {

    public int numDistinct(String s, String t) {
        if (s.length() < t.length() || s.length() == 0 || t.length() == 0) {
            return 0;
        }

        if (s.length() == t.length()) {
            return s.equals(t) ? 1 : 0;
        }

        int[][] table = new int[t.length() + 1][s.length() + 1];

        for (int i = 0; i < s.length() + 1; i++) {
            table[t.length()][i] = 1;
        }

        for (int i = t.length() - 1; i >= 0; i--) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (t.charAt(i) == s.charAt(j)) {
                    table[i][j] = table[i][j + 1] + table[i + 1][j + 1];
                } else {
                    table[i][j] = table[i][j + 1];
                }
            }
        }

        return table[0][0];
    }
}

