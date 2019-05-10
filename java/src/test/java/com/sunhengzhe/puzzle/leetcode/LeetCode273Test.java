package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_273.Solution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class LeetCode273Test {
    @Test
    public void should_recogize_small_than_10() {
        assertEquals("Zero", new Solution().numberToWords(0));
        assertEquals("One", new Solution().numberToWords(1));
        assertEquals("Two", new Solution().numberToWords(2));
        assertEquals("Three", new Solution().numberToWords(3));
        assertEquals("Four", new Solution().numberToWords(4));
        assertEquals("Five", new Solution().numberToWords(5));
        assertEquals("Six", new Solution().numberToWords(6));
        assertEquals("Seven", new Solution().numberToWords(7));
        assertEquals("Eight", new Solution().numberToWords(8));
        assertEquals("Nine", new Solution().numberToWords(9));
    }

    @Test
    public void should_recogize_small_than_100() {
        assertEquals("Ten", new Solution().numberToWords(10));
        assertEquals("Eleven", new Solution().numberToWords(11));
        assertEquals("Twelve", new Solution().numberToWords(12));
        assertEquals("Thirteen", new Solution().numberToWords(13));
        assertEquals("Fourteen", new Solution().numberToWords(14));
        assertEquals("Fifteen", new Solution().numberToWords(15));
        assertEquals("Sixteen", new Solution().numberToWords(16));
        assertEquals("Seventeen", new Solution().numberToWords(17));
        assertEquals("Eighteen", new Solution().numberToWords(18));
        assertEquals("Nineteen", new Solution().numberToWords(19));
        assertEquals("Twenty", new Solution().numberToWords(20));
        assertEquals("Twenty One", new Solution().numberToWords(21));
        assertEquals("Thirty", new Solution().numberToWords(30));
        assertEquals("Forty", new Solution().numberToWords(40));
        assertEquals("Fifty", new Solution().numberToWords(50));
        assertEquals("Fifty Five", new Solution().numberToWords(55));
        assertEquals("Sixty", new Solution().numberToWords(60));
        assertEquals("Seventy", new Solution().numberToWords(70));
        assertEquals("Eighty", new Solution().numberToWords(80));
        assertEquals("Ninety", new Solution().numberToWords(90));
    }

    @Test
    public void should_recogize_small_than_1000() {
        assertEquals("One Hundred", new Solution().numberToWords(100));
        assertEquals("One Hundred Eleven", new Solution().numberToWords(111));
        assertEquals("One Hundred Twenty", new Solution().numberToWords(120));
        assertEquals("One Hundred Ninety Nine", new Solution().numberToWords(199));
    }

    @Test
    public void should_recogize_small_than_10000() {
        assertEquals("One Thousand", new Solution().numberToWords(1000));
        assertEquals("One Thousand One Hundred Ten", new Solution().numberToWords(1110));
        assertEquals("One Thousand Two Hundred Thirty Four", new Solution().numberToWords(1234));
    }

    @Test
    public void should_recogize_small_than_100000() {
        assertEquals("Ten Thousand", new Solution().numberToWords(10000));
        assertEquals("Twelve Thousand Three Hundred Forty Five", new Solution().numberToWords(12345));
    }

    @Test
    public void should_recogize_small_than_1000000() {
        assertEquals("One Hundred Thousand", new Solution().numberToWords(100000));
        assertEquals("Six Hundred Fifty Four Thousand Three Hundred Twenty One", new Solution().numberToWords(654321));
    }

    @Test
    public void should_recogize_small_than_10000000() {
        assertEquals("One Million", new Solution().numberToWords(1000000));
        assertEquals("One Million Ten", new Solution().numberToWords(1000010));
        assertEquals("One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven", new Solution().numberToWords(1234567));
    }

    @Test
    public void should_recogize_big_than_10000000() {
        assertEquals("One Billion", new Solution().numberToWords(1000000000));
        assertEquals("One Billion Ten", new Solution().numberToWords(1000000010));
        assertEquals("One Billion Ten Million One Hundred One Thousand Ten", new Solution().numberToWords(1010101010));
        assertEquals("One Billion Two Hundred Thirty Four Million Five Hundred Sixty Seven Thousand Eight Hundred Ninety One", new Solution().numberToWords(1234567891));
    }
}
