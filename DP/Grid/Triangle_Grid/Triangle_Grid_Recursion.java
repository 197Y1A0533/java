package DP.Grid.Triangle_Grid;

public class Triangle_Grid_Recursion {
    public static void main(String[] args) {
        int triangle [][] = {{1},
                       {2,3},
                       {3,6,7},
                       {8,9,6,10}};
                            
        int n = triangle.length;
        
        System.out.println(minimumPathSum(triangle,n,0,0));
    }

    private static int minimumPathSum(int[][] triangle, int n,int i,int j) {
        if(i==n-1)
        return triangle[i][j];
        int d=triangle[i][j]+minimumPathSum(triangle, n, i+1, j);
        int dg=triangle[i][j]+minimumPathSum(triangle, n, i+1, j+1);
        return Math.min(d, dg);
    }
}
