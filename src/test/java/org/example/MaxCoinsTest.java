package org.example;
import Algorithms.DynamicProgramming.MaxCoins;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaxCoinsTest {
    @Test
    public void testMaxCoins() {
        MaxCoins burstBalloons = new MaxCoins();

        int[] nums1 = {3, 1, 5, 8};
        assertEquals(167, burstBalloons.maxCoins(nums1));

        int[] nums2 = {1, 5};
        assertEquals(10, burstBalloons.maxCoins(nums2));


        int[] nums5 = {1};
        assertEquals(1, burstBalloons.maxCoins(nums5));
    }
}
