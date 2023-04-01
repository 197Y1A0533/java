package DP.Grid.Triangle_Grid;

public class Triangle_Grid_Space_OPtimized {
    public static void main(String[] args) {
        int triangle [][] = {{1},
                       {2,3},
                       {3,6,7},
                       {8,9,6,10}};        
                            
        int n = triangle.length;
        
        System.out.println(minimumPathSum(triangle,n));
    }

    private static int minimumPathSum(int[][] triangle, int n) {
        int[] prev=new int[n];
        for(int i=0;i<n;i++)
        prev[i] = triangle[n-1][i];

        for(int i=n-2;i>=0;i--){
            int[] cur=new int[n];
            for(int j=i; j>=0; j--){
                int d=triangle[i][j]+prev[j];
                int dg=triangle[i][j]+prev[j+1];
                cur[j]=Math.min(d, dg);
            }
            prev=cur;
        }
        return prev[0];
    }
}
