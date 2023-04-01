package DP.Grid.Maze_Obstacles;

public class MazeObstacles_SpaceOptmized {
    public static void main(String args[]) {

        int[][] maze = {    {0,0,0},
                            {0,-1,0},
                            {-1,0,0}     };
        
        int m = maze.length;
        int n = maze[0].length;

        System.out.println(f(m,n,maze));
    }

    private static int f(int m, int n, int[][] maze) {
        
        int prev[]=new int[n];

        for(int i=0;i<m;i++){
            int cur[]=new int [m];
            for(int j=0;j<n;j++){
                if(i==0 && j==0){
                    cur[j]=1;
                    continue;
                }
                else if(i>=0 && j>=0 && maze[i][j]==-1){
                    cur[j]=0;
                    continue;
                }
                int up=0;
                int left=0;
                if(i>0) up=prev[j];
                if(j>0) left=cur[j-1]; 
                cur[j]=up+left;
            }
            prev=cur;
        }
        return prev[m-1];
    }
}
