package DP.Grid.Maze_Obstacles;

public class MazeObstacles1 {
    public static void main(String args[]) {

        int[][] maze = {    {0,0,0},
                            {0,-1,0},
                            {0,0,0}     };
        
        int m = maze.length;
        int n = maze[0].length;
        
        System.out.println(f(m-1,n-1,maze));
    }

    private static int f(int i, int j, int[][] maze) {
        if(i==0 && j==0)
        return 1;
        if(i<0 || j<0)
        return 0;
        if(i>=0 && j>=0 && maze[i][j]==-1)
        return 0;
        int up=f(i-1, j, maze);
        int left=f(i, j-1, maze);
        return up+left;
    }
}
