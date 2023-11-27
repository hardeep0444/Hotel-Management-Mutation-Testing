package org.example;
import Algorithms.DynamicProgramming.HRobber;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
public class HRobberTest {
    @Test
    public void rob3Test() {
        HRobber yourClass = new HRobber();

        // Test case 1: Example with multiple houses
        int[] nums1 = {2, 3, 2};
        assertEquals(3, yourClass.rob3(nums1));

        // Test case 2: Example with a single house
        int[] nums2 = {1};
        assertEquals(1, yourClass.rob3(nums2));
    }

    @Test
    public void rob2Test() {
        HRobber yourClass = new HRobber();

        // Test case 1: Example with multiple houses
        int[] nums1 = {2, 3, 2};
        assertEquals(3, yourClass.rob2(nums1));

        // Test case 2: Example with a single house
        int[] nums2 = {1};
        assertEquals(1, yourClass.rob2(nums2));
    }

    @Test
    public void robTest() {
        HRobber yourClass = new HRobber();

        // Test case 1: Example with multiple houses
        int[] nums1 = {2, 3, 2};
        assertEquals(3, yourClass.rob(nums1));

        // Test case 2: Example with a single house
        int[] nums2 = {1};
        assertEquals(1, yourClass.rob(nums2));
    }

}
