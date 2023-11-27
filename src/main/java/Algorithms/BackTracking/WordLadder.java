package Algorithms.BackTracking;

import java.util.*;

public class WordLadder {
    Set<String> wordSet = new HashSet<>();
    List<Object> currPath = new ArrayList<Object>();
    List<ArrayList<Object>> shortestPath = new ArrayList<ArrayList<Object>>();
    Map<String, ArrayList<Object>> adjacencyList = new HashMap<String, ArrayList<Object>>();

    public List<String> findNeighbors(String currWord) {

        List<String> neighborsList = new ArrayList<>();
        char[] letters = currWord.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];

            for (char c = 'a'; c <= 'z'; c++) {
                letters[i] = c;
                String word = new String(letters);
                if (letter != c && wordSet.contains(word)) {
                    neighborsList.add(word);
                }
            }

            letters[i] = letter;
        }

        return neighborsList;
    }

    public void bfs(String beginWord) {

        Queue<String> queue = new LinkedList<>();
        queue.offer(beginWord);
        wordSet.remove(beginWord);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Set<String> visitedSet = new HashSet<>();

            while (size-- != 0) {
                String currWord = queue.poll();
                List<String> neighborsList = findNeighbors(currWord);

                for (String word : neighborsList) {
                    if (!adjacencyList.containsKey(currWord)) {
                        adjacencyList.put(currWord, new ArrayList<>());
                    }

                    adjacencyList.get(currWord).add(word);
                    visitedSet.add(word);
                }
            }

            for (String word : visitedSet) {
                queue.offer(word);
                wordSet.remove(word);
            }
        }
    }

    public void backtrack(Object beginWord, String endWord) {

        if (beginWord.equals(endWord)) {
            shortestPath.add(new ArrayList<>(currPath));
            return;
        } else if (!adjacencyList.containsKey(beginWord)) {
            return;
        }

        for (Object word : adjacencyList.get(beginWord)) {
            currPath.add(word);
            backtrack(word, endWord);
            currPath.remove(word);
        }
    }

    public List<ArrayList<Object>> findLadders(String beginWord, String endWord, List<String> wordList) {

        for (String word : wordList) {
            wordSet.add(word);
        }

        if (!wordSet.contains(endWord)) {
            return shortestPath;
        }

        bfs(beginWord);
        currPath.add(beginWord);
        backtrack(beginWord, endWord);

        return shortestPath;
    }
}
