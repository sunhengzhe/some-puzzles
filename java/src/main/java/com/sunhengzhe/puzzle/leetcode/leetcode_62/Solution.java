package com.sunhengzhe.puzzle.leetcode.leetcode_62;

public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] table = new int[n][m];

        for (int i = 0; i < n; i++) {
            table[i][0] = 1;
        }

        for (int i = 0; i < m; i++) {
            table[0][i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                table[i][j] = table[i - 1][j] + table[i][j - 1];
            }
        }

        return table[n - 1][m - 1];
    }
}
