package org.example;

import Algorithms.Sorting.MaxProfitWork;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MaxProfitTest {
    @Test
    public void testMaxProfitAssignment() {
        MaxProfitWork maxProfitAssignment = new MaxProfitWork();

        // Test case 1: Regular case
        int[] diff1 = {2, 4, 6};
        int[] profit1 = {10, 20, 30};
        int[] worker1 = {3, 5, 10};
        assertEquals(60, maxProfitAssignment.maxProfitAssignment(diff1, profit1, worker1));

        // Test case 2: Empty arrays, should return 0
        int[] diff2 = {};
        int[] profit2 = {};
        int[] worker2 = {};
        assertEquals(0, maxProfitAssignment.maxProfitAssignment(diff2, profit2, worker2));

        // Test case 3: No matching difficulty levels, should return 0
        int[] diff3 = {2, 4, 6};
        int[] profit3 = {10, 20, 30};
        int[] worker3 = {1, 3, 5};
        assertEquals(30, maxProfitAssignment.maxProfitAssignment(diff3, profit3, worker3));

        // Test case 4: Worker abilities exceed all difficulties, should return sum of all profits
        int[] diff4 = {2, 4, 6};
        int[] profit4 = {10, 20, 30};
        int[] worker4 = {7, 8, 9};
        assertEquals(90, maxProfitAssignment.maxProfitAssignment(diff4, profit4, worker4));
    }
}
