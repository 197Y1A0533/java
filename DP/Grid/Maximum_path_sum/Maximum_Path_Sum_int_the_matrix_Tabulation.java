package DP.Grid.Maximum_path_sum;

public class Maximum_Path_Sum_int_the_matrix_Tabulation {

    private static int getMaxUtil(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] dp=new int[n][m];
        for(int j=0;j<m;j++){
            dp[0][j]=matrix[0][j];
            System.out.print(dp[0][j]+" ");
        }
        System.out.println();
        for(int i=1;i<n;i++){
            for(int j=0;j<m;j++){
                int up=matrix[i][j]+dp[i-1][j];
                int ld=matrix[i][j];
                if(j-1>=0)
                    ld=matrix[i][j]+dp[i-1][j-1];
                else 
                    ld += (int)Math.pow(-10,9);
                int rd=matrix[i][j];
                if(j+1<m)
                    rd=matrix[i][j]+dp[i-1][j+1];
                else 
                    rd += (int)Math.pow(-10,9);
                
                dp[i][j]=Math.max(up, Math.max(ld, rd));
            }
        }
        int maxi=Integer.MIN_VALUE;
        for(int j=0;j<m;j++){
            System.out.print(dp[n-1][j]+"   ");
            maxi=Math.max(maxi, dp[n-1][j]) ;
        }
        System.out.println();
        return maxi;
    }

    public static void main(String args[]) {

        int matrix[][] = {{1,2,10,4},
                          {100,3,2,1},
                          {1,1,20,2},
                          {1,2,2,1}};
        
        System.out.println(getMaxUtil(matrix));
    }
}
