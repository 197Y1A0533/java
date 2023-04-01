package DP.DP_Basic;

import java.util.Arrays;

public class MaximumSumOfNonAdjacent {
    public static void main(String[] args) {
        
        int a[]={2,1,4,9};
        int n=a.length;
        System.out.println(solve(n,a));
    }
    private static int solve(int n, int[] a) {
        int dp[]=new int[n];
        Arrays.fill(dp, -1);
        return subSet(n-1,a,dp);
    }
    private static int subSet(int ind, int[] a, int[] dp) {
        if(ind<0)
            return 0;
        if(ind==0)
            return a[ind];
        if(dp[ind]!=-1)
            return dp[ind];
        int pick = a[ind]+subSet(ind-2, a, dp);
        int notpick = 0+subSet(ind-1, a, dp);
        return dp[ind]=Math.max(pick, notpick);
    }
}
