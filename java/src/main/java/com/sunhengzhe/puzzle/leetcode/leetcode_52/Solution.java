package com.sunhengzhe.puzzle.leetcode.leetcode_52;

public class Solution {
    private int[] results;
    private int n;
    private int total = 0;

    public void placeQueenAtRow(int row) {
        if (row == n) {
            total++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValidQueenAt(row, col)) {
                results[row] = col;
                placeQueenAtRow(row + 1);
            }
        }
    }

    private boolean isValidQueenAt(int row, int col) {
        int leftUp = col - 1;
        int rightUp = col + 1;

        for (int i = row - 1; i >= 0; i--) {
            if (results[i] == col) {
                return false;
            }

            if (leftUp >= 0) {
                if (results[i] == leftUp) {
                    return false;
                }
            }

            if (rightUp < n) {
                if (results[i] == rightUp) {
                    return false;
                }
            }

            leftUp--;
            rightUp++;
        }

        return true;
    }

    public int totalNQueens(int n) {
        this.n = n;
        results = new int[n];
        placeQueenAtRow(0);
        return total;
    }
}

