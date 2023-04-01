package DP.DP_Basic;

import java.util.Arrays;

public class MaximumSumOfNonAdjacentSpaceOPtimized {
    public static void main(String[] args) {
        
        int a[]={2,1,4,9};
        int n=a.length;
        int dp[]=new int[n];
        Arrays.fill(dp,-1);
          
        int prev = a[0];
        int prev2 =0;
   
        for(int i=1; i<n; i++){
            int pick = a[i];
            if(i>1)
                pick += prev2;
            int nonPick = 0 + prev;
       
            int cur_i = Math.max(pick, nonPick);
            prev2 = prev;
            prev= cur_i;
        }
        System.out.println(prev);
    }
}
