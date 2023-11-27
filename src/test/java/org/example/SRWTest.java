package org.example;

import Algorithms.BinarySearch.SRW;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class SRWTest {

    @Test
    public void testSwimInWater() {
        SRW obj = new SRW();

        // Test case with example values
        int[][] grid1 = {{0, 2}, {1, 3}};
        assertEquals(3, obj.swimInWater(grid1));

        // Test case with different values
        int[][] grid2 = {{0,1,2,3,4},{24,23,22,21,5},{12,13,14,15,16},{11,17,18,19,20},{10,9,8,7,6}};
        assertEquals(16, obj.swimInWater(grid2));

    }

}
