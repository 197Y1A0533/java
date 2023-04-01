package DP.Grid.Grid_unique_path;

public class GridUniquePath1 {
    public static void main(String args[]) {

        int[][] maze = { {5,9,6},
                         {11,5,2}};
        
        int m = maze.length;
        int n = maze[0].length;
        
        System.out.println(f(m-1,n-1,maze));
      }

    private static int f(int m, int n, int[][] maze) {

        if(m==0 && n==0)
        return maze[0][0];
        
        if(n<0 || m<0)
        return (int)Math.pow(10,9);
        int up=0;
        int left=0;
      
        up=maze[m][n] +f(m-1, n,maze);
        left=maze[m][n]+ f(m, n-1,maze);
        return Math.min(up, left) ;
    }
}
 
