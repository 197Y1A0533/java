package DP.DP_Basic;

import java.util.Scanner;

public class Hand_Shake {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] dp=new int[n+1];
        dp[0]=1;
        for(int i=2;i<=n;i+=2){
            for(int j=0;j<=i-2;j+=2){
                dp[i]+=dp[j]*dp[i-2-j];
            }
        }
        System.out.println(dp[n]);
        
        sc.close();
    }

}
