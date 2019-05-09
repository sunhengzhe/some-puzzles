package com.sunhengzhe.puzzle.leetcode.leetcode_264;

import java.util.HashMap;
import java.util.Map;

public class RecursiveSolution {
    private static Map<Integer, Boolean> cache = new HashMap<>();

    public int nthUglyNumber(int n) {
        int number = 1;
        int uglyIndex = 1;

        while (true) {
            if (isUglyNumber(number)) {
                if (uglyIndex++ == n) {
                    return number;
                }
            }

            number++;
        }
    }

    private boolean isUglyNumber(int i) {
        if (cache.containsKey(i)) {
            return cache.get(i);
        }

        if (i % 2 == 0) {
            return isUglyNumber(i / 2);
        }

        if (i % 3 == 0) {
            return isUglyNumber(i / 3);
        }

        if (i % 5 == 0) {
            return isUglyNumber(i / 5);
        }

        boolean isUgly = i == 1;

        cache.put(i, isUgly);

        return isUgly;
    }
}
