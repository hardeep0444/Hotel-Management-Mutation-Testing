package org.example;

import Algorithms.BinarySearch.Koko;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class KokoTest {

    @Test
    public void testMinEatingSpeed() {
        Koko obj = new Koko();

        // Test case with example values
        int[] piles1 = {3, 6, 7, 11};
        int h1 = 8;
        assertEquals(4, obj.minEatingSpeed(piles1, h1));

        // Test case with different values
        int[] piles2 = {30, 11, 23, 4, 20};
        int h2 = 5;
        assertEquals(30, obj.minEatingSpeed(piles2, h2));

        // Test case with a single pile
        int[] piles3 = {15};
        int h3 = 1;
        assertEquals(15, obj.minEatingSpeed(piles3, h3));

        // Test case with large piles and a small number of hours
        int[] piles5 = {1000000, 2000000, 3000000};
        int h5 = 2;
        assertEquals(3000000, obj.minEatingSpeed(piles5, h5));
    }
}
