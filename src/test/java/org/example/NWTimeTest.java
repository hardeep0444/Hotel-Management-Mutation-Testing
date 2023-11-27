package org.example;
import Algorithms.Graph.NWDelay;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class NWTimeTest {
    @Test
    public void testNetworkDelayTime() {
        NWDelay networkDelayTime = new NWDelay();

        // Test case 1: Regular case, should return 2
        int[][] times1 = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n1 = 4;
        int k1 = 2;
        assertEquals(2, networkDelayTime.networkDelayTime(times1, n1, k1));

        // Test case 2: No delay, should return 0
        int[][] times2 = {{1, 2, 0}};
        int n2 = 2;
        int k2 = 1;
        assertEquals(0, networkDelayTime.networkDelayTime(times2, n2, k2));


        // Test case 4: Multiple paths, should return the maximum delay (4)
        int[][] times4 = {{1, 2, 1}};
        int n4 = 2;
        int k4 = 1;
        assertEquals(1, networkDelayTime.networkDelayTime(times4, n4, k4));
    }

    @Test
    public void testNetworkDelayTime2() {
        NWDelay networkDelayTime = new NWDelay();

        // Test case 1: Regular case, should return 2
        int[][] times1 = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
        int n1 = 4;
        int k1 = 2;
        assertEquals(2, networkDelayTime.networkDelayTimeDfs(times1, n1, k1));

        // Test case 2: No delay, should return 0
        int[][] times2 = {{1, 2, 0}};
        int n2 = 2;
        int k2 = 1;
        assertEquals(0, networkDelayTime.networkDelayTimeDfs(times2, n2, k2));

        int[][] times4 = {{1, 2, 1}};
        int n4 = 2;
        int k4 = 1;
        assertEquals(1, networkDelayTime.networkDelayTime(times4, n4, k4));

    }
}
