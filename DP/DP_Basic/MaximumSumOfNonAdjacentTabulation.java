package DP.DP_Basic;

import java.util.Arrays;

public class MaximumSumOfNonAdjacentTabulation {
    public static void main(String[] args) {
        
        int a[]={2,1,4,9};
        int n=a.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
        dp[0]= a[0];
        for(int i=1;i<n;i++){
            int pick = a[i];
            if(i>1)
                pick=pick+dp[i-2];
            int notpick = 0+dp[i-1];
            dp[i]=Math.max(pick, notpick);
        }   
        System.out.println(dp[n-1]);
    }
}
