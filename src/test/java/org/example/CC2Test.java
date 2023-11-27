package org.example;
import Algorithms.Graph.CC2;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CC2Test {
    @Test
    public void testFindOrder() {
        CC2 courseSchedule = new CC2();

        // Test case 1: No prerequisites, should return a valid order
        int[][] prerequisites1 = {};
        int[] result1 = courseSchedule.findOrder(3, prerequisites1);
        assertArrayEquals(new int[]{0, 1, 2}, result1);

        // Test case 2: Cycle exists, should return an empty array
        int[][] prerequisites2 = {{1, 0}, {2, 1}, {0, 2}};
        int[] result2 = courseSchedule.findOrder(3, prerequisites2);
        assertArrayEquals(new int[0], result2);

        // Test case 3: Multiple valid orders, any of them should be accepted
        int[][] prerequisites3 = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] result3 = courseSchedule.findOrder(4, prerequisites3);
        assertTrue(result3.length == 4);
        assertTrue((result3[0] == 0 && result3[1] == 1 && result3[2] == 2 && result3[3] == 3)
                || (result3[0] == 0 && result3[1] == 2 && result3[2] == 1 && result3[3] == 3));

        // Test case 4: Single course, should return a valid order
        int[][] prerequisites4 = {};
        int[] result4 = courseSchedule.findOrder(1, prerequisites4);
        assertArrayEquals(new int[]{0}, result4);

        // Test case 5: Courses with the same prerequisites, should return a valid order
        int[][] prerequisites5 = {{1, 0}, {2, 0}, {3, 0}};
        int[] result5 = courseSchedule.findOrder(4, prerequisites5);
        assertTrue(result5.length == 4);
        assertTrue((result5[0] == 0 && result5[1] == 1 && result5[2] == 2 && result5[3] == 3));
    }

    @Test
    public void testFindOrder2() {
        CC2 courseSchedule = new CC2();

        // Test case 1: No prerequisites, should return a valid order
        int[][] prerequisites1 = {};
        int[] result1 = courseSchedule.findOrder2(3, prerequisites1);
        assertArrayEquals(new int[]{0, 1, 2}, result1);

        // Test case 2: Cycle exists, should return an empty array
        int[][] prerequisites2 = {{1, 0}, {2, 1}, {0, 2}};
        int[] result2 = courseSchedule.findOrder2(3, prerequisites2);
        assertArrayEquals(new int[0], result2);

        // Test case 3: Multiple valid orders, any of them should be accepted
        int[][] prerequisites3 = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        int[] result3 = courseSchedule.findOrder2(4, prerequisites3);
        assertTrue(result3.length == 4);
        assertTrue((result3[0] == 0 && result3[1] == 1 && result3[2] == 2 && result3[3] == 3)
                || (result3[0] == 0 && result3[1] == 2 && result3[2] == 1 && result3[3] == 3));

        // Test case 4: Single course, should return a valid order
        int[][] prerequisites4 = {};
        int[] result4 = courseSchedule.findOrder2(1, prerequisites4);
        assertArrayEquals(new int[]{0}, result4);

        // Test case 5: Courses with the same prerequisites, should return a valid order
        int[][] prerequisites5 = {{1, 0}, {2, 0}, {3, 0}};
        int[] result5 = courseSchedule.findOrder2(4, prerequisites5);
        assertTrue(result5.length == 4);
        assertTrue((result5[0] == 0 && result5[1] == 1 && result5[2] == 2 && result5[3] == 3));
    }
}
