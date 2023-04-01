package DP.Grid.Basic_Grid;

import java.util.Scanner;

public class Grid_Unique_paths1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int t=sc.nextInt();
        System.out.println(f(n-1,t-1));
        sc.close();
    }

    private static int f(int n, int t) {
        if(n==0 && t==0)
        return 1;
        if(n<0 || t<0)
        return 0;
        int up=f(n-1, t);
        int left=f(n, t-1);
        return up+left;
    }
}
