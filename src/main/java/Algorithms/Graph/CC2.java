package Algorithms.Graph;

import java.util.*;

public class CC2 {
    public int[] findOrder(int numCourses, int[][] pre) {
        int[] ingress=new int[numCourses];//array to keep track of incoming edges
        //create graph from given array
        ArrayList<ArrayList<Object>> graph=graph_creator(numCourses,pre);
        Arrays.fill(ingress,0);
        for(int i=0;i<numCourses;i++){
            for(Object j:graph.get(i)){
                ingress[(int) j]++;//increase if incoming edge to this node found
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(ingress[i]==0) q.add(i);//add all the root nodes to the queue as the starting points of traversal cause there is nothing which lie before them.
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            ans.add(node);//here is why traversal means addition to answer.
            for(Object i:graph.get(node)){
                ingress[(int) i]--;//decrease the incoming edge count it won't drop below 0.
                if(ingress[(int) i]==0) q.add((Integer) i);//only add those whose parents have been added.
            }
        }
        if(ans.size()!=numCourses) return new int[0];//if we failed to add all node into answer there existed a cycle
        int[] output=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            output[i]=ans.get(i);
        }
        return output;
    }
    ArrayList<ArrayList<Object>> graph_creator(int n,int[][]pre){
        ArrayList<ArrayList<Object>> graph=new ArrayList<>(n);
        for(int i=0;i<n;i++) graph.add(new ArrayList<>());
        for(int[] temp:pre) graph.get(temp[1]).add(temp[0]);
        return graph;
    }



    public int[] findOrder2(int numCourses, int[][] prerequisites) {
        int v = numCourses;
        List<LinkedList<Object>> adjacent = new ArrayList<>(v);
        for (int i=0; i<numCourses; i++)
            adjacent.add(new LinkedList<>());
        for (int i=0; i<prerequisites.length; i++)
            adjacent.get(prerequisites[i][0]).add(prerequisites[i][1]);
        List<Integer> list = new ArrayList<>();
        boolean [] visited = new boolean[numCourses];
        boolean [] recursionStack = new boolean[numCourses];
        for (int i=0; i<numCourses; i++) {
            if (isCycle(i, visited, recursionStack, numCourses, adjacent, list))
                return new int[0];
        }
        int [] result = new int[list.size()];
        for (int i=0; !list.isEmpty(); i++)
            result[i] = list.remove(0);
        return result;
    }
    public boolean isCycle(int v, boolean [] visited, boolean [] recursionStack, int numCourses, List<LinkedList<Object>> adjacent, List<Integer> list){
        if (recursionStack[v])
            return true;
        if (visited[v])
            return false;
        visited[v]= true;
        recursionStack[v] = true;
        for (Object child: adjacent.get(v)) {
            if (isCycle((Integer) child, visited, recursionStack, numCourses, adjacent, list))
                return true;
        }
        recursionStack[v] = false;
        list.add(v);
        return false;
    }
}
