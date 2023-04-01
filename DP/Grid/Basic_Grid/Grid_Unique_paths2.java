package DP.Grid.Basic_Grid;

import java.util.Arrays;
import java.util.Scanner;

public class Grid_Unique_paths2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int dp[][]=new int[n][t];
        for(int[] row :dp)
            Arrays.fill(row,-1);
        System.out.println(f(n-1,t-1,dp));
        sc.close();
    }

    private static int f(int n, int t, int[][] dp) {
        if(n==0 && t==0)
        return 1;
        if(n<0 || t<0)
        return 0;
        if(dp[n][t]!=-1)
        return dp[n][t];
        int up=f(n-1, t, dp);
        int left=f(n, t-1, dp);
        return dp[n][t]=up+left;
    } 
}
