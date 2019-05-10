package com.sunhengzhe.puzzle.leetcode;

import com.sunhengzhe.puzzle.geeksforgeeks.knapsack_problem_01.IteractiveSolution;
import com.sunhengzhe.puzzle.geeksforgeeks.knapsack_problem_01.MemoizationSolution;
import com.sunhengzhe.puzzle.geeksforgeeks.knapsack_problem_01.RecursiveSolution;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GeeksForGeeks_KnapsackTest {

    @Test
    public void recursive() {
        assertEquals(220, RecursiveSolution.getMaxValue(
                50, 3,
                new int[]{60, 100, 120},
                new int[]{10, 20, 30}
        ));

        assertEquals(223, RecursiveSolution.getMaxValue(
                41, 58,
                new int[]{57,95,13,29,1,99,34,77,61,23,24,70,73,88,33,61,43,5,41,63,8,67,20,72,98,59,46,58,64,94,97,70,46,81,42,7,1,52,20,54,81,3,73,78,81,11,41,45,18,94,24,82,9,19,59,48,2,72},
                new int[]{83,84,85,76,13,87,2,23,33,82,79,100,88,85,91,78,83,44,4,50,11,68,90,88,73,83,46,16,7,35,76,31,40,49,65,2,18,47,55,38,75,58,86,77,96,94,82,92,10,86,54,49,65,44,77,22,81,52}
        ));

    }

    @Test
    public void memoization() {
        assertEquals(220, MemoizationSolution.getMaxValue(
                50, 3,
                new int[]{60, 100, 120},
                new int[]{10, 20, 30}
        ));

        assertEquals(223, MemoizationSolution.getMaxValue(
                41, 58,
                new int[]{57,95,13,29,1,99,34,77,61,23,24,70,73,88,33,61,43,5,41,63,8,67,20,72,98,59,46,58,64,94,97,70,46,81,42,7,1,52,20,54,81,3,73,78,81,11,41,45,18,94,24,82,9,19,59,48,2,72},
                new int[]{83,84,85,76,13,87,2,23,33,82,79,100,88,85,91,78,83,44,4,50,11,68,90,88,73,83,46,16,7,35,76,31,40,49,65,2,18,47,55,38,75,58,86,77,96,94,82,92,10,86,54,49,65,44,77,22,81,52}
        ));
    }

    @Test
    public void iteractive() {
        assertEquals(220, IteractiveSolution.getMaxValue(
                50, 3,
                new int[]{60, 100, 120},
                new int[]{10, 20, 30}
        ));

        assertEquals(223, IteractiveSolution.getMaxValue(
                41, 58,
                new int[]{57,95,13,29,1,99,34,77,61,23,24,70,73,88,33,61,43,5,41,63,8,67,20,72,98,59,46,58,64,94,97,70,46,81,42,7,1,52,20,54,81,3,73,78,81,11,41,45,18,94,24,82,9,19,59,48,2,72},
                new int[]{83,84,85,76,13,87,2,23,33,82,79,100,88,85,91,78,83,44,4,50,11,68,90,88,73,83,46,16,7,35,76,31,40,49,65,2,18,47,55,38,75,58,86,77,96,94,82,92,10,86,54,49,65,44,77,22,81,52}
        ));
    }
}
