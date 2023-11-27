package org.example;

import Algorithms.Sorting.Anagram;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AnagramTest {
    @Test
    public void testGroupAnagrams() {
        Anagram anagramSolver = new Anagram();

        // Test case 1: Regular case with anagrams, should return grouped lists
        String[] strs1 = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result1 = anagramSolver.groupAnagrams(strs1);

        assertEquals(3, result1.size());

    }

}
