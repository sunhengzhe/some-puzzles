package com.sunhengzhe.puzzle.leetcode.leetcode_44;

public class Solution {
    public boolean isMatch(String s, String p) {
        boolean[][] table = new boolean[p.length() + 1][s.length() + 1];

        table[0][0] = true;

        for (int i = 1; i <= p.length(); i++) {
            if (p.charAt(i - 1) == '*') {
                table[i][0] = table[i - 1][0];
            }
        }

        for (int i = 1; i <= p.length(); i++) {
            for (int j = 1; j <= s.length(); j++) {
                char cP = p.charAt(i - 1);
                char cS = s.charAt(j - 1);

                if (cS == cP || cP == '?') {
                    table[i][j] = table[i - 1][j - 1];
                }

                if (cP == '*') {
                    table[i][j] = table[i][j - 1] || table[i - 1][j];
                }
            }
        }


        return table[p.length()][s.length()];
    }
}
