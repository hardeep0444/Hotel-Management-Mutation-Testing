package org.example;
import Algorithms.Graph.Provinces;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class ProvincesTest {
    @Test
    public void testFindCircleNum() {
        Provinces provinces = new Provinces();

        // Test case 1: Two provinces are connected, should return 1 province
        int[][] isConnected1 = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        assertEquals(2, provinces.findCircleNum(isConnected1));

        // Test case 2: Three provinces are connected, should return 1 province
        int[][] isConnected2 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        assertEquals(3, provinces.findCircleNum(isConnected2));

        // Test case 3: Each province is independent, should return the number of provinces
        int[][] isConnected3 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        assertEquals(3, provinces.findCircleNum(isConnected3));

        // Test case 4: No provinces, should return 0
        int[][] isConnected4 = {};
        assertEquals(0, provinces.findCircleNum(isConnected4));

        // Test case 5: Disconnected provinces, should return the number of provinces
        int[][] isConnected5 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        assertEquals(4, provinces.findCircleNum(isConnected5));
    }


    @Test
    public void testFindCircleNumDfs() {
        Provinces provinces = new Provinces();

        // Test case 1: Two provinces are connected, should return 1 province
        int[][] isConnected1 = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };
        assertEquals(2, provinces.findCircleNumDFS(isConnected1));

        // Test case 2: Three provinces are connected, should return 1 province
        int[][] isConnected2 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        assertEquals(3, provinces.findCircleNumDFS(isConnected2));

        // Test case 3: Each province is independent, should return the number of provinces
        int[][] isConnected3 = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        assertEquals(3, provinces.findCircleNumDFS(isConnected3));

        // Test case 4: No provinces, should return 0
        int[][] isConnected4 = {};
        assertEquals(0, provinces.findCircleNumDFS(isConnected4));

        // Test case 5: Disconnected provinces, should return the number of provinces
        int[][] isConnected5 = {
                {1, 0, 0, 0},
                {0, 1, 0, 0},
                {0, 0, 1, 0},
                {0, 0, 0, 1}
        };
        assertEquals(4, provinces.findCircleNumDFS(isConnected5));

        // Test case 6: All provinces connected, should return 1 province
        int[][] isConnected6 = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };
        assertEquals(1, provinces.findCircleNumDFS(isConnected6));
    }
}
