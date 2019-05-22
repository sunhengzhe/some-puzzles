package com.sunhengzhe.puzzle.leetcode.leetcode_91;

public class Solution {
    public int numDecodings(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        if (s.length() == 1) {
            return s.equals("0") ? 0 : 1;
        }

        int[] table = new int[s.length() + 1];

        table[0] = 1;
        table[1] = 1;

        for (int i = 2; i <= s.length(); i++) {
            char curChar = s.charAt(i - 1);
            char prevChar = s.charAt(i - 2);

            if (curChar == 48) {
                if (prevChar > 50) {
                    table[i] = 0;
                } else {
                    table[i] = table[i - 2];
                }
            } else if (prevChar < 51 && curChar < 55) {
                table[i] = table[i - 1] + table[i - 2];
            } else {
                table[i] = table[i - 1];
            }
        }

        return table[s.length()];
    }
}
