package DP.Grid.Maze_Obstacles;

import java.util.Arrays;

public class MazeObstacles2 {
    public static void main(String args[]) {

        int[][] maze = {    {0,0,0},
                            {0,-1,0},
                            {-1,0,0}     };
        
        int m = maze.length;
        int n = maze[0].length;

        int dp[][]=new int[m][n];
        for(int[] r:dp)
        Arrays.fill(r, -1);
        
        System.out.println(f(m-1,n-1,maze,dp));
    }

    private static int f(int i, int j, int[][] maze,int[][] dp) {
        if(i==0 && j==0)
        return 1;
        if(i<0 || j<0)
        return 0;
        if(i>=0 && j>=0 && maze[i][j]==-1)
        return 0;
        if(dp[i][j]!=-1)
        return dp[i][j];
        int up=f(i-1, j, maze, dp);
        int left=f(i, j-1, maze, dp);
        return dp[i][j]= up+left;
    }
}
