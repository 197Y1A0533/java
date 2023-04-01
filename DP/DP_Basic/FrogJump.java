package DP.DP_Basic;

import java.util.Arrays;

public class FrogJump {
    public static void main(String[] args) {
        int height[]={30,10,60 , 10 , 60 , 50};
        int n=height.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        //System.out.println(solveMemoization(n-1,height,dp));//Memoization
        //System.out.println(solveTabulation(n,height,dp));//Tabulation
        System.out.println(solveSpaceOptimization(n,height,dp));//SpaceOptimization
    }

    private static int solveSpaceOptimization(int n, int[] height, int[] dp) {
        int prev=0;
        int prev2=0;
        for(int ind=1;ind<n;ind++){
            int jumpTwo=Integer.MAX_VALUE;
            int jumpOne=prev+Math.abs(height[ind]-height[ind-1]);
            if(ind>1)
                jumpTwo=prev2+Math.abs(height[ind]-height[ind-2]);
            int curl=Math.min(jumpOne, jumpTwo);
            prev2=prev;
            prev=curl;
        }
        return prev;
    }

    /* private static int solveTabulation(int i, int[] height, int[] dp) {
        dp[0]=0;
        for(int ind=1;ind<i;ind++){
            int jumpTwo=Integer.MAX_VALUE;
            int jumpOne=dp[ind-1]+Math.abs(height[ind]-height[ind-1]);
            if(ind>1)
                jumpTwo=dp[ind-2]+Math.abs(height[ind]-height[ind-2]);
            dp[ind]=Math.min(jumpOne, jumpTwo);
        }
        return dp[i-1];
    } */

    /* private static int solveMemoization(int ind, int[] height, int[] dp) {
        if(ind==0)
            return 0;
        if(dp[ind]!=-1)
            return dp[ind];
        int jumpTwo=Integer.MAX_VALUE;
        int jumpOne=solveMemoization(ind-1, height, dp)+Math.abs(height[ind]-height[ind-1]);
        if(ind>1)
            jumpTwo=solveMemoization(ind-2, height, dp)+Math.abs(height[ind]-height[ind-2]);
        return dp[ind]=Math.min(jumpOne, jumpTwo);
    }  */
}
