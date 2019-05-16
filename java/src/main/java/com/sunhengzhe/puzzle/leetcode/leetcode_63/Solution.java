package com.sunhengzhe.puzzle.leetcode.leetcode_63;

public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int rowTotal = obstacleGrid.length;
        int colTotal = obstacleGrid[0].length;

        int[][] table = new int[rowTotal][colTotal];

        table[0][0] = obstacleGrid[0][0] == 1 ? 0 : 1;

        for (int i = 1; i < rowTotal; i++) {
            table[i][0] = obstacleGrid[i][0] == 1 ? 0 : table[i - 1][0];
        }

        for (int i = 1; i < colTotal; i++) {
            table[0][i] = obstacleGrid[0][i] == 1 ? 0 : table[0][i - 1];
        }

        for (int i = 1; i < rowTotal; i++) {
            for (int j = 1; j < colTotal; j++) {
                table[i][j] = obstacleGrid[i][j] == 1 ? 0 : table[i - 1][j] + table[i][j - 1];
            }
        }

        return table[rowTotal - 1][colTotal - 1];
    }
}
