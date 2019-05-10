package com.sunhengzhe.puzzle.geeksforgeeks.knapsack_problem_01;

import java.util.Scanner;

public class MemoizationSolution {

    public static int subProblem(int[][] cache, int maxWeight, int termsCount, int[] values, int[] weights) {
        if (cache[maxWeight][termsCount] > -1) {
            return cache[maxWeight][termsCount];
        }

        if (termsCount == 0 || maxWeight == 0) {
            return cache[maxWeight][termsCount] = 0;
        }

        if (weights[termsCount - 1] > maxWeight) {
            return cache[maxWeight][termsCount] = subProblem(cache, maxWeight, termsCount - 1, values, weights);
        }

        return cache[maxWeight][termsCount] = Math.max(
                // 取最后一个物品
                values[termsCount - 1] + subProblem(cache, maxWeight - weights[termsCount - 1], termsCount - 1, values, weights),
                // 不取最后一个物品
                subProblem(cache, maxWeight, termsCount - 1, values, weights)
        );
    }

    public static int getMaxValue(int maxWeight, int termsCount, int[] values, int[] weights) {
        int[][] cache = new int[maxWeight + 1][termsCount + 1];

        for (int i = 0; i <= maxWeight; i++) {
            for (int j = 0; j <= termsCount; j++) {
                cache[i][j] = -1;
            }
        }

        return subProblem(cache, maxWeight, termsCount, values, weights);
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
