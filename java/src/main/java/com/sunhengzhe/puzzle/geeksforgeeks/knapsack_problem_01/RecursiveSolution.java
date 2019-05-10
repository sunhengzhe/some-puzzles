package com.sunhengzhe.puzzle.geeksforgeeks.knapsack_problem_01;

import java.util.Scanner;

public class RecursiveSolution {

    public static int getMaxValue(int maxWeight, int termsCount, int[] values, int[] weights) {
        if (termsCount == 0 || maxWeight == 0) {
            return 0;
        }

        if (weights[termsCount - 1] > maxWeight) {
            return getMaxValue(maxWeight, termsCount - 1, values, weights);
        }

        return Math.max(
                // 取最后一个物品
                values[termsCount - 1] + getMaxValue(maxWeight - weights[termsCount - 1], termsCount - 1, values, weights),
                // 不取最后一个物品
                getMaxValue(maxWeight, termsCount - 1, values, weights)
        );
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
