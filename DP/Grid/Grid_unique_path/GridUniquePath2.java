package DP.Grid.Grid_unique_path;

import java.util.Arrays;

public class GridUniquePath2 {
    public static void main(String args[]) {

        int[][] maze = { {5,9,6},
                         {11,5,2}};
        
        int m = maze.length;
        int n = maze[0].length;
        int dp[][] =new int[m][n];
        for(int[] r:dp)
        Arrays.fill(r, -1);
        
        System.out.println(f(m-1,n-1,maze,dp));
      }

    private static int f(int m, int n, int[][] maze,int[][] dp) {

        if(m==0 && n==0)
        return maze[0][0];
        
        if(n<0 || m<0)
        return (int)Math.pow(10,9);
        if(dp[m][n]!=-1)
        return dp[m][n];
        int up=0;
        int left=0;
      
        up=maze[m][n] +f(m-1, n,maze,dp);
        left=maze[m][n]+ f(m, n-1,maze,dp);
        return dp[m][n]= Math.min(up, left) ;
    }
}
