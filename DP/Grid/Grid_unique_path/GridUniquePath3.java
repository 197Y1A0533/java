package DP.Grid.Grid_unique_path;

public class GridUniquePath3 {
    public static void main(String args[]) {

        int[][] maze = { {5,9,6},
                         {11,5,2}};
        
        int m = maze.length;
        int n = maze[0].length;
        int dp[][] =new int[m][n];
        
        System.out.println(f(m,n,maze,dp));
      }

    private static int f(int m, int n, int[][] maze,int[][] dp) {

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==0 && j==0)
                dp[i][j]= maze[i][j];

                else{
                    int up=maze[i][j];
                    if(i>0) up=up +dp[i-1][j];
                    else up=up+(int)Math.pow(10,9);

                    int left=maze[i][j];
                    if(j>0) left=left+ dp[i][j-1];
                    else left=left+(int)Math.pow(10,9);

                    dp[i][j]= Math.min(up, left) ;
                }

            }
        }
        return dp[m-1][n-1];

    }
}














