package DP.DP_Basic;

import java.util.Arrays;

public class NinjaTraining {
    public static void main(String args[]) {

        int[][] points = {{10,40,70},
                          {20,50,80},
                          {30,60,90}};
           

        int n = points.length;
        System.out.println(ninjaTraining(n, points));
    }

    private static int ninjaTraining(int n, int[][] points) {
        int[][] dp=new int[n][4];
        for (int[] is : dp) {
            Arrays.fill(is, -1);
        }
        return solve(n-1,3,points,dp);
    }

    private static int solve(int day, int last, int[][] points, int[][] dp) {
        if(dp[day][last]!=-1)
            return dp[day][last];
        if (day==0) {
            int maxi=0;
            for (int i = 0; i <=2; i++) {
                if(i!=last)
                    maxi=Math.max(maxi, points[0][i]);
            }
            return dp[day][last]=maxi;
        }
        int maxi=0;
            for (int i = 0; i <=2; i++) {
                if(i!=last){
                    int act=points[day][i]+solve(day-1, i, points, dp);
                    maxi=Math.max(maxi, act);
                }
            }
        return dp[day][last]=maxi;
    }
}
