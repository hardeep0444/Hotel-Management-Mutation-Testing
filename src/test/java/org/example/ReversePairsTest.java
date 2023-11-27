package org.example;


import Algorithms.Sorting.ReversePairs;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ReversePairsTest {
    @Test
    public void testReversePairs() {
        ReversePairs reversePairs = new ReversePairs();

        // Test case 1: Regular case, should return the number of reverse pairs
        int[] nums1 = {1, 3, 2, 3, 1};
        int result1 = reversePairs.reversePairs(nums1);
        assertEquals(2, result1);

        // Test case 2: Empty array, should return 0
        int[] nums2 = {};
        int result2 = reversePairs.reversePairs(nums2);
        assertEquals(0, result2);

        // Test case 3: Array with only one element, should return 0
        int[] nums3 = {5};
        int result3 = reversePairs.reversePairs(nums3);
        assertEquals(0, result3);

        // Test case 4: Array with no reverse pairs, should return 0
        int[] nums4 = {1, 2, 3, 4, 5};
        int result4 = reversePairs.reversePairs(nums4);
        assertEquals(0, result4);

        // Test case 5: Array with all elements in reverse order, should return n * (n - 1) / 2
        int[] nums5 = {5, 4, 3, 2, 1};
        int result5 = reversePairs.reversePairs(nums5);
        assertEquals(4, result5);
    }

}
