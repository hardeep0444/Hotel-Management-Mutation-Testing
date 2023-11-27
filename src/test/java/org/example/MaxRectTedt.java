package org.example;
import Algorithms.DynamicProgramming.MaxReact;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
public class MaxRectTedt {
    @Test
    public void maximalRectangleTest() {
        MaxReact yourClass = new MaxReact();

        // Test case 1: Example with a 3x3 matrix
        char[][] matrix1 = {
                {'1', '0', '1'},
                {'1', '1', '1'},
                {'1', '1', '0'}
        };
        assertEquals(4, yourClass.maximalRectangle(matrix1));

        // Test case 2: Example with an empty matrix
        char[][] matrix2 = {};
        assertEquals(0, yourClass.maximalRectangle(matrix2));

        // Test case 3: Example with a 1x1 matrix
        char[][] matrix3 = {{'1'}};
        assertEquals(1, yourClass.maximalRectangle(matrix3));
    }
}
