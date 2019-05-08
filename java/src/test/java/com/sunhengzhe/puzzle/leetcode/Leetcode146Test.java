package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.leetcode.leetcode_146.LRUCache;
import org.junit.Test;

public class Leetcode146Test {

    @Test
    public void should_pass_leetcode() {
        LRUCache cache = new LRUCache(2);
        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));
        cache.put(3, 3);    // evicts key 2
        System.out.println(cache.get(2));
        cache.put(4, 4);    // evicts key 1
        System.out.println(cache.get(1));
        System.out.println(cache.get(3));
        System.out.println(cache.get(4));
    }
}
