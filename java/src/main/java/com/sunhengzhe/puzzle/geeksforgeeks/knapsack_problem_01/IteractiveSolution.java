package com.sunhengzhe.puzzle.geeksforgeeks.knapsack_problem_01;

import java.util.Scanner;

public class IteractiveSolution {

    public static int getMaxValue(int maxWeight, int termsCount, int[] values, int[] weights) {
        int[][] cache = new int[maxWeight + 1][termsCount + 1];

        for (int i = 0; i <= maxWeight; i++) {
            for (int j = 0; j <= termsCount; j++) {
                if (i == 0 || j == 0) {
                    cache[i][j] = 0;
                } else if (weights[j - 1] > i) {
                    cache[i][j] = cache[i][j - 1];
                } else {
                    cache[i][j] = Math.max(
                            values[j - 1] + cache[i - weights[j - 1]][j - 1],
                            cache[i][j - 1]
                    );
                }
            }
        }

        return cache[maxWeight][termsCount];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCaseTotal = scanner.nextInt();

        for (int i = 0; i < testCaseTotal; i++) {
            int termsCount = scanner.nextInt();
            int maxWeight = scanner.nextInt();

            int[] values = new int[termsCount];
            int[] weights = new int[termsCount];

            for (int j = 0; j < termsCount; j++) {
                values[j] = scanner.nextInt();
            }

            for (int j = 0; j < termsCount; j++) {
                weights[j] = scanner.nextInt();
            }

            System.out.println(getMaxValue(maxWeight, termsCount, values, weights));
        }
    }
}
