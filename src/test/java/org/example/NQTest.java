package org.example;
import Algorithms.BackTracking.NQ;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
public class NQTest {
    @Test
    public void testSolveNQueens() {
        NQ obj = new NQ();

        // Test case with N = 4
        List<List<String>> result1 = obj.solveNQueens(4);
        assertEquals(2, result1.size()); // There are 2 solutions for N=4

        // Test case with N = 8
        List<List<String>> result2 = obj.solveNQueens(8);
        assertEquals(92, result2.size()); // There are 92 solutions for N=8

        // Test case with N = 1
        List<List<String>> result3 = obj.solveNQueens(1);
        assertEquals(1, result3.size()); // Only one cell, so one solution

        // Test case with N = 2
        List<List<String>> result4 = obj.solveNQueens(2);
        assertEquals(0, result4.size()); // No solution for N=2
    }
}
