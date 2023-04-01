package DP.Grid.Maze_Obstacles;

import java.util.Arrays;

public class MazeObstacles3 {
    public static void main(String args[]) {

        int[][] maze = {    {0,0,8},
                            {0,0,-1},
                            {-1,0,0}     };
        
        int m = maze.length;
        int n = maze[0].length;

        int dp[][]=new int[m][n];
        for(int[] r:dp)
        Arrays.fill(r, -1);
        
        System.out.println(f(m,n,maze,dp));
    }

    private static int f(int m, int n, int[][] maze,int[][] dp) {

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    dp[i][j]=1;
                    continue;
                }
                else if(i>=0 && j>=0 && maze[i][j]==-1){
                    dp[i][j]=0;
                    continue;
                }
                int up=0;
                int left=0;
                if(i>0) up=dp[i-1][j];
                if(j>0) left=dp[i][j-1]; 
                dp[i][j]=up+left;
            }
        }
        return dp[n-1][m-1];
    }
}

