package Algorithms.Graph;

import java.util.*;

public class Provinces {


    public int findCircleNum(int[][] isConnected) {
        Map<Integer, ArrayList<Object>> Graph = new HashMap<>();

        for(int r = 0 ; r < isConnected.length ; r++){
            for(int c= 0; c < isConnected.length; c++){
                if(!Graph.containsKey(r)){
                    Graph.put(r, new ArrayList<>());
                }
                if(isConnected[r][c] == 1){
                    Graph.get(r).add(c);
                }
            }
        }

        int count = 0;
        Set<Object> visited = new HashSet<>();
        Queue<Object> queue = new LinkedList<>();
        for(int key: Graph.keySet()){
            if(!visited.contains(key)) count++;
            visited.add(key);
            List<Object> neighbours = Graph.get(key);

            for(Object neighbour : neighbours){
                if(!visited.contains(neighbour)){
                    visited.add(neighbour);
                    if(!neighbour.equals(key)) queue.offer(neighbour);
                }
            }
// further explore the neighbours of the node(key) because they are all connected
            while(!queue.isEmpty()){
                List<Object> neigh =Graph.get(queue.poll());
                for(Object n : neigh){
                    if(!visited.contains(n)){
                        queue.offer(n);
                    }
                    visited.add(n);

                }
            }

        }

        return count;
    }

    public int findCircleNumDFS(int[][] isConnected) {
        //counter for number of connected components
        int ans = 0;
        int n = isConnected.length;
        //visited array to keep track of visited nodes
        boolean[] visited = new boolean[n + 1];

        for(int i=1;i<=n;i++) {
            //If node not visited
            if(!visited[i]) {
                dfs(isConnected, visited, i, n);
                //increment counter
                ans++;
            }
        }
        return ans;
    }
    static void dfs(int[][] isConnected, boolean[] visited, int source, int n) {
        //Simple DFS
        visited[source] = true;
        for(int j=0;j<n;j++) {
            //skip for self
            if(source - 1 != j) {
                //If connected and is still not visited
                if(isConnected[source - 1][j] == 1 && !visited[j + 1]) {
                    dfs(isConnected, visited, j + 1, n);
                }
            }
        }
    }
}
