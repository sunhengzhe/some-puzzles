package com.sunhengzhe.puzzle.leetcode.leetcode_10;

public class Solution {

    public boolean isMatch(String s, String p) {
        boolean[][] table = new boolean[p.length() + 1][s.length() + 1];

        table[0][0] = true;

        for (int i = 1; i < p.length() + 1; i++) {
            if (p.charAt(i - 1) == '*') {
                table[i][0] = table[i - 2][0];
            }
        }

        for (int i = 1; i < p.length() + 1; i++) {
            for (int j = 1; j < s.length() + 1; j++) {
                char chS = s.charAt(j - 1);
                char chP = p.charAt(i - 1);

                if (chS == chP || chP == '.') {
                    table[i][j] = table[i - 1][j - 1];
                } else if (chP == '*') {
                    if (p.charAt(i - 2) == '.' || p.charAt(i - 2) == chS) {
                        table[i][j] = table[i][j - 1] || table[i - 2][j];
                    } else {
                        table[i][j] = table[i - 2][j];
                    }
                }
            }
        }

        return table[p.length()][s.length()];
    }
}
