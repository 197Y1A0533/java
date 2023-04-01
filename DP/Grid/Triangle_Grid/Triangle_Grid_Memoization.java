package DP.Grid.Triangle_Grid;

import java.util.Arrays;

public class Triangle_Grid_Memoization {
    public static void main(String[] args) {
        int triangle [][] = {{1},
                       {2,3},
                       {3,6,7},
                       {8,9,6,10}};        
                            
        int n = triangle.length;
        int[][] dp =new int[n][n];
        for(int[] r:dp)
        Arrays.fill(r, -1);
        
        System.out.println(minimumPathSum(triangle,n,0,0,dp));
    }

    private static int minimumPathSum(int[][] triangle, int n,int i,int j, int[][] dp) {
        if(i==n-1)
        return triangle[i][j];
        if(dp[i][j]!=-1)
        return dp[i][j];
        int d=triangle[i][j]+minimumPathSum(triangle, n, i+1, j, dp);
        int dg=triangle[i][j]+minimumPathSum(triangle, n, i+1, j+1, dp);
        return dp[i][j]=Math.min(d, dg);
    }
}
