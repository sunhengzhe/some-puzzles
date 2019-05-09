package com.sunhengzhe.puzzle.leetcode.leetcode_264;

public class DpSolution {
    public int nthUglyNumber(int n) {
        int[] uglyNumbers = new int[n];
        uglyNumbers[0] = 1;

        int i2 = 0;
        int i3 = 0;
        int i5 = 0;

        int nextMultiplyOf2 = 2;
        int nextMultiplyOf3 = 3;
        int nextMultiplyOf5 = 5;

        for (int i = 1; i < n; i++) {
            int nextUglyNumber = Math.min(Math.min(nextMultiplyOf2, nextMultiplyOf3), nextMultiplyOf5);
            uglyNumbers[i] = nextUglyNumber;

            if (nextUglyNumber == nextMultiplyOf2) {
                i2++;
                nextMultiplyOf2 = uglyNumbers[i2] * 2;
            }

            if (nextUglyNumber == nextMultiplyOf3) {
                i3++;
                nextMultiplyOf3 = uglyNumbers[i3] * 3;
            }

            if (nextUglyNumber == nextMultiplyOf5) {
                i5++;
                nextMultiplyOf5 = uglyNumbers[i5] * 5;
            }
        }

        return uglyNumbers[n - 1];
    }
}
