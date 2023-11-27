package org.example;
import Algorithms.BackTracking.WordLadder;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
public class WordLadderTest {
    @Test
    public void findLaddersTest() {
        // Arrange
        WordLadder yourClass = new WordLadder();
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");

        // Act
        List<ArrayList<Object>> result = yourClass.findLadders(beginWord, endWord, wordList);


         assertEquals(2, result.size());
//         assertEquals(expectedValue, result.get(index).get(someProperty));
    }
}
