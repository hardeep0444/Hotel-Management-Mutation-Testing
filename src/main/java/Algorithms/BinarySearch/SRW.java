package Algorithms.BinarySearch;

public class SRW {
    private int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};

    public int swimInWater(int[][] grid) {

        int n = grid.length;
        int low = 0; int high = n*n-1;

        //Binary search
        while(low<high){
            int mid = low + (high - low)/2;

            boolean[][] visited = new boolean[n][n];

            if(dfs(grid,mid,n,0,0,visited)){ // If you can reach try lesser values
                high = mid;
            }
            else{
                low = mid + 1;
            }

        }
        return low;
    }

    public boolean dfs(int[][] grid, int time, int n, int i, int j, boolean[][] visited){

        // If desitnation has been reached return true
        if(i==n-1 && j==n-1) return true;

        visited[i][j] = true;

        for(int[] dir: dirs){
            int x = i + dir[0];
            int y = j + dir[1];

            // Bounds check, visited check, time should be more than current and next values to move forward
            if(x>=0 && x<n && y>=0 & y<n && !visited[x][y] && grid[i][j] <= time && grid[x][y] <= time ){
                if(dfs(grid,time,n,x,y,visited)) return true;
            }
        }
        return false;
    }
}
