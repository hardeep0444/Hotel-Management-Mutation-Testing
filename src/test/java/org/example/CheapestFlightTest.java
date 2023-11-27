package org.example;
import Algorithms.Graph.CheapestFlight;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CheapestFlightTest {
    @Test
    public void findCheapestPrice() {
        CheapestFlight flight= new CheapestFlight();

        // Example test case
        int[][] flights = {{0, 1, 100}, {1, 2, 100}, {0, 2, 500}};
        assertEquals(200, flight.findCheapestPrice(3, flights, 0, 2, 1));

        // Additional test cases
        int[][] flights2 = {{0, 1, 200}, {1, 2, 100}, {2, 3, 300}, {3, 4, 500}};
        assertEquals(-1, flight.findCheapestPrice(5, flights2, 0, 4, 1));

        int[][] flights3 = {{0, 1, 100}, {1, 2, 100}, {2, 3, 100}, {0, 3, 500}};
        assertEquals(500, flight.findCheapestPrice(4, flights3, 0, 3, 1));

        int[][] flights4 = {{0, 1, 100}, {1, 2, 200}, {2, 3, 300}};
        assertEquals(-1, flight.findCheapestPrice(4, flights4, 0, 3, 1));

        int[][] flights5 = {{0, 1, 100}, {1, 2, 200}, {2, 3, 300}};
        assertEquals(-1, flight.findCheapestPrice(4, flights5, 0, 3, 0));
    }
}
