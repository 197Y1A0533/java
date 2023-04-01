package DP.Grid.Maximum_path_sum;

import java.util.Arrays;

public class Maximum_Path_Sum_int_the_matrix_Memoization {
    public static void main(String args[]) {

        int matrix[][] = {{1,2,10,4},
                          {100,3,2,1},
                          {1,1,20,2},
                          {1,2,2,1}};
        
        System.out.println(getMaxPathSum(matrix));
    }

    static int getMaxPathSum(int[][] matrix){
    
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp=new int[n][m];
        for (int[] is : dp) {
            Arrays.fill(is, -1);
        }
        
        int maxi = Integer.MIN_VALUE;
        
        for(int j=0; j<m;j++){
            int ans =getMaxUtil(matrix, n-1, j, m,dp);
            maxi = Math.max(maxi,ans);
        }
        
        return maxi;
    }

    private static int getMaxUtil(int[][] matrix, int i, int j, int m, int[][] dp) {
        if(j<0 || j>=m) return (int)Math.pow(-10,9);
        if(i==0) return matrix[0][j];
        if(dp[i][j]!=-1) return dp[i][j];
        int up=matrix[i][j]+getMaxUtil(matrix, i-1, j,m, dp);
        int ld=matrix[i][j]+getMaxUtil(matrix, i-1, j-1,m, dp);
        int rd=matrix[i][j]+getMaxUtil(matrix, i-1, j+1,m, dp);
        return dp[i][j]=Math.max(up, Math.max(ld, rd));
    }
}
