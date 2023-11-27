package org.example;

import Algorithms.BinarySearch.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class BinarySearchTest {
    @Test
    public void testBinarySearchSingleElementKeyExists() {
        int[] array = {5};
        int key = 5;
        assertEquals(true,BinarySearch.binarySearchIterative(array, key));
    }

    @Test
    public void testBinarySearchKeyExists() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        assertEquals(true,BinarySearch.binarySearchIterative(array, key));
    }

    @Test
    public void testBinarySearchKeyDoesNotExist() {
        int[] array = {1, 2, 3, 4, 6, 7, 8, 9, 10};
        int key = 5;
        assertEquals(false,BinarySearch.binarySearchIterative(array, key));
    }

    @Test
    public void testBinarySearchEmptyArray() {
        int[] array = {};
        int key = 5;
        assertEquals(false,BinarySearch.binarySearchIterative(array, key));
    }


    @Test
    public void testBinarySearchSingleElementKeyDoesNotExist() {
        int[] array = {10};
        int key = 5;
        assertEquals(false,BinarySearch.binarySearchIterative(array, key));
    }

    @Test
    public void testBinarySearchFirstElement() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 1;
        assertEquals(true,BinarySearch.binarySearchIterative(array, key));
    }

    @Test
    public void testBinarySearchLastElement() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 10;
        assertEquals(true,BinarySearch.binarySearchIterative(array, key));
    }

    @Test
    public void testBinarySearchKeyBeforeFirstElement() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 0;
        assertEquals(false,BinarySearch.binarySearchIterative(array, key));
    }

    @Test
    public void testBinarySearchKeyAfterLastElement() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 11;
        assertEquals(false,BinarySearch.binarySearchIterative(array, key));
    }


    @Test
    public void testBinarySearchRecursive() {
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Test cases for elements present in the array
        assertEquals(true, BinarySearch.binarySearchRecursive(sortedArray, 3, 0, sortedArray.length - 1));
        assertEquals(true, BinarySearch.binarySearchRecursive(sortedArray, 7, 0, sortedArray.length - 1));

        // Test cases for elements not present in the array
        assertEquals(false, BinarySearch.binarySearchRecursive(sortedArray, 11, 0, sortedArray.length - 1));
        assertEquals(false, BinarySearch.binarySearchRecursive(sortedArray, 0, 0, sortedArray.length - 1));

        // Test case for an empty array
        assertEquals(false, BinarySearch.binarySearchRecursive(new int[0], 5, 0, 0));
    }

}
