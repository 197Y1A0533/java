package DP.Grid.Grid_unique_path;

public class GridUniquePath_SpaceOptimized {
    public static void main(String args[]) {

        int[][] maze = { {5,9,6},
                         {11,5,2}};
        
        int m = maze.length;
        int n = maze[0].length;       
        System.out.println(f(m,n,maze));
      }

    private static int f(int m, int n, int[][] maze) {
        int prev[]=new int [n];
        for(int i=0;i<m;i++){
            int cur[]=new int[n];
            for(int j=0;j<n;j++){
                if(i==0 && j==0)
                cur[j]= maze[i][j];

                else{
                    int up=maze[i][j];
                    if(i>0) up=up +prev[j];
                    else up=up+(int)Math.pow(10,9);

                    int left=maze[i][j];
                    if(j>0) left=left+cur[j-1];
                    else left=left+(int)Math.pow(10,9);

                    cur[j]= Math.min(up, left) ;
                }
            }
            prev=cur;
        }
        return prev[n-1];

    }
}