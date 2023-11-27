package org.example;

import Algorithms.BinarySearch.Candies;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CandiesTest {
    @Test
    public void testMaximumCandies() {
        Candies obj = new Candies();

//        // Test case with example values
        int[] candies1 = {7, 4, 5, 3, 8};
        long k1 = 4;
        assertEquals(4, obj.maximumCandies(candies1, k1));

        // Test case with different values
        int[] candies2 = {5, 6, 8};
        long k2 = 3;
        assertEquals(5, obj.maximumCandies(candies2, k2));


    }
}
