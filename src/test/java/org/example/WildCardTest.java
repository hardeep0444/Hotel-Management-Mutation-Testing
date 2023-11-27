package org.example;
import Algorithms.DynamicProgramming.WildCardMatching;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
public class WildCardTest {
    @Test
    public void testMatchingStrings() {
        WildCardMatching wildcardMatching = new WildCardMatching();

        assertEquals(true, wildcardMatching.isMatch("aa", "aa"));
        assertEquals(true, wildcardMatching.isMatch("abc", "abc"));
        assertEquals(true, wildcardMatching.isMatch("abc", "***"));
        assertEquals(true, wildcardMatching.isMatch("abc", "a*c"));
        assertEquals(true, wildcardMatching.isMatch("abc", "a*b*c"));
        assertEquals(true, wildcardMatching.isMatch("abc", "a*c*"));

    }

    @Test
    public void testNonMatchingStrings() {
        WildCardMatching wildcardMatching = new WildCardMatching();

        assertEquals(false, wildcardMatching.isMatch("aa", "a"));
        assertEquals(false, wildcardMatching.isMatch("abc", "abd"));
        assertEquals(false, wildcardMatching.isMatch("abc", "a*c*bd"));
        assertEquals(false, wildcardMatching.isMatch("abc", "*d"));
        assertEquals(false, wildcardMatching.isMatch("abc", "a*bd"));

    }

    @Test
    public void testEmptyStrings() {
        WildCardMatching wildcardMatching = new WildCardMatching();

        assertEquals(true, wildcardMatching.isMatch("", ""));
        assertEquals(false, wildcardMatching.isMatch("", "a"));
        assertEquals(false, wildcardMatching.isMatch("abc", ""));

    }

    @Test
    public void testWildcardCharacter() {
        WildCardMatching wildcardMatching = new WildCardMatching();

        assertEquals(true, wildcardMatching.isMatch("abc", "*"));
        assertEquals(true, wildcardMatching.isMatch("abc", "a*"));
        assertEquals(true, wildcardMatching.isMatch("abc", "*c"));
        assertEquals(false, wildcardMatching.isMatch("abc","a*bd"));

    }
}
