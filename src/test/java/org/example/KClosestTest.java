package org.example;


import Algorithms.Sorting.KClosestPoint;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class KClosestTest {
    @Test
    public void testKClosest() {
        KClosestPoint kClosestPoints = new KClosestPoint();

        // Test case 1: Regular case, should return k closest points
        int[][] points1 = {{1, 3}, {-2, 2}, {2, -2}};
        int k1 = 2;
        int[][] result1 = kClosestPoints.kClosest(points1, k1);

        int[][] expected1 = {{2, -2}, {-2, 2}};
        assertArrayEquals(expected1, result1);

        // Test case 2: Empty array, should return an empty array
//        int[][] points2 = {};
//        int k2 = 3;
//        int[][] result2 = kClosestPoints.kClosest(points2, k2);
//
//        int[][] expected2 = {};
//        assertArrayEquals(null, result2);

        // Test case 3: k is greater than the number of points, should return all points
        int[][] points3 = {{5, 5}, {-3, -3}, {0, 0}, {2, 2}};
        int k3 = 4;
        int[][] result3 = kClosestPoints.kClosest(points3, k3);

        int[][] expected3 = {{0, 0}, {2, 2}, {-3, -3}, {5, 5}};
        assertArrayEquals(expected3, result3);
    }
}
