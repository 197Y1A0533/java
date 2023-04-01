package DP.Grid.Triangle_Grid;

import java.util.Arrays;

public class Triangle_Grid_Tabulation {
    public static void main(String[] args) {
        int triangle [][] = {{1},
                       {2,3},
                       {3,6,7},
                       {8,9,6,10}};        
                            
        int n = triangle.length;
        int[][] dp =new int[n][n];
        for(int[] r:dp)
        Arrays.fill(r, -1);
        
        System.out.println(minimumPathSum(triangle,n,dp));
    }

    private static int minimumPathSum(int[][] triangle, int n, int[][] dp) {
        for(int i=0;i<n;i++)
        dp[n-1][i]=triangle[n-1][i];

        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int d=triangle[i][j]+dp[i+1][j];
                int dg=triangle[i][j]+dp[i+1][j+1];
                dp[i][j]=Math.min(d, dg);
            }
        }
        return dp[0][0];
    }
}
