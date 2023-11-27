package org.example;

import Algorithms.Sorting.MajElement;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MajElementTest {
    @Test
    public void testMajorityElement() {
        MajElement majorityElement = new MajElement();

        // Test case 1: Regular case, should return [3]
        int[] arr1 = {3, 2, 3};
        assertEquals(List.of(3), majorityElement.majorityElement1(arr1));

        // Test case 2: No majority element, should return an empty list
        int[] arr2 = {1, 2, 3, 4, 5};
        assertEquals(List.of(), majorityElement.majorityElement1(arr2));

//        // Test case 3: Multiple majority elements, should return [3, 4]
//        int[] arr3 = {3, 3, 4, 4, 2, 2};
//        assertEquals(List.of(3, 4), majorityElement.majorityElement1(arr3));

        // Test case 4: Empty array, should return an empty list
        int[] arr4 = {};
        assertEquals(List.of(), majorityElement.majorityElement1(arr4));

        // Test case 5: Majority element at the beginning, should return [1]
//        int[] arr5 = {1, 1, 2, 3, 4, 5};
//        assertEquals(List.of(1), majorityElement.majorityElement1(arr5));
    }

    @Test
    public void testMajorityElement2() {
        MajElement majorityElement = new MajElement();

        // Test case 1: Regular case, should return [3]
        int[] arr1 = {3, 2, 3};
        assertEquals(List.of(3), majorityElement.majorityElement2(arr1));

        // Test case 2: No majority element, should return an empty list
        int[] arr2 = {1, 2, 3, 4, 5};
        assertEquals(List.of(), majorityElement.majorityElement2(arr2));

//        // Test case 3: Multiple majority elements, should return [3, 4]
//        int[] arr3 = {3, 3, 4, 4, 2, 2};
//        assertEquals(List.of(3, 4), majorityElement.majorityElement1(arr3));

        // Test case 4: Empty array, should return an empty list
        int[] arr4 = {};
        assertEquals(List.of(), majorityElement.majorityElement2(arr4));

        // Test case 5: Majority element at the beginning, should return [1]
//        int[] arr5 = {1, 1, 2, 3, 4, 5};
//        assertEquals(List.of(1), majorityElement.majorityElement1(arr5));
    }


    @Test
    public void testMajorityElement3() {
        MajElement majorityElement = new MajElement();

        // Test case 1: Regular case, should return [3]
        int[] arr1 = {3, 2, 3};
        assertEquals(List.of(3), majorityElement.majorityElement3(arr1));

        // Test case 2: No majority element, should return an empty list
        int[] arr2 = {1, 2, 3, 4, 5};
        assertEquals(List.of(), majorityElement.majorityElement3(arr2));

//        // Test case 3: Multiple majority elements, should return [3, 4]
//        int[] arr3 = {3, 3, 4, 4, 2, 2};
//        assertEquals(List.of(3, 4), majorityElement.majorityElement1(arr3));

        // Test case 4: Empty array, should return an empty list
        int[] arr4 = {};
        assertEquals(List.of(), majorityElement.majorityElement3(arr4));

        // Test case 5: Majority element at the beginning, should return [1]
//        int[] arr5 = {1, 1, 2, 3, 4, 5};
//        assertEquals(List.of(1), majorityElement.majorityElement1(arr5));
    }
}
