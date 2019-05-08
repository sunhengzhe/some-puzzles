package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_115.Solution;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class LeetCode115Test {
    Solution solution = new Solution();

    @Test
    public void should_pass_leetcode() {
        assertEquals(3, solution.numDistinct("rabbbit", "rabbit"));
        assertEquals(5, solution.numDistinct("babgbag", "bag"));
        assertEquals(1716, solution.numDistinct("aaaaaaaaaaaaa", "aaaaaa"));
        assertEquals(0, solution.numDistinct("aaaaa", "b"));
        assertEquals(0, solution.numDistinct("aaaaa", ""));
        assertEquals(0, solution.numDistinct("", ""));
    }

    @Test
    public void should_time_friendly() {
        long startTime = new Date().getTime();
        List<String> nonce = new ArrayList<>(20000);

        for (int i = 0; i < 20000; i++) {
            nonce.add("z");
        }

        assertEquals(700531452, solution.numDistinct(
                "adbdadeecadeadeccaeaabdabdbcdab" +
                        "ddddabcaaadbabaaedeeddeaeebcdeabcaaaeeaeeab" +
                        "cddcebddebeebedaecccbdcbcedbdaeaedcdebeecd" +
                        "aaedaacadbdccabddaddacdddc" + String.join("", nonce),
                "bcddceeeebecbc"));

        System.out.println(new Date().getTime() - startTime);
    }
}
