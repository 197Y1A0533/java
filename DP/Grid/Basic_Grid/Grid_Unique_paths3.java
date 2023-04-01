package DP.Grid.Basic_Grid;

import java.util.Arrays;
import java.util.Scanner;

public class Grid_Unique_paths3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        int dp[][]=new int[n][t];
        for(int[] row :dp)
            Arrays.fill(row,-1);
        System.out.println(f(n,t,dp));
        sc.close();
    }

    private static int f(int m, int n, int[][] dp) {
        int prev[]=new int[n];
        for(int i=0; i<m; i++){
            int temp[]=new int[n];
            for(int j=0; j<n; j++){
                if(i==0 && j==0){
                    temp[j]=1;
                    System.out.println(i+"  "+j+"  "+temp[j]);
                    continue;
                }
                System.out.println(i+"  "+j);
                int up=0;
                int left =0;
                
                if(i>0)
                    up = prev[j];
                System.out.println("up  "+up);
                if(j>0)
                    left = temp[j-1];
                System.out.println("left    "+left);
                    
                temp[j] = up + left;
                System.out.println("temp[j] "+temp[j]);
            }
            prev = temp;
        }
        
        return prev[n-1];
    }

}
