package DP.Grid.Maximum_path_sum;

public class Maximum_Path_Sum_int_the_matrix_SpaceOptimized {

    private static int getMaxUtil(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[] prev=new int[m];
        for(int j=0;j<m;j++){
            prev[j]=matrix[0][j];
            //System.out.print(dp[0][j]+" ");
        }
        System.out.println();
        for(int i=1;i<n;i++){
            int[] cur=new int[m];
            for(int j=0;j<m;j++){
                int up=matrix[i][j]+prev[j];
                int ld=matrix[i][j];
                if(j-1>=0)
                    ld=matrix[i][j]+prev[j-1];
                else 
                    ld += (int)Math.pow(-10,9);
                int rd=matrix[i][j];
                if(j+1<m)
                    rd=matrix[i][j]+prev[j+1];
                else 
                    rd += (int)Math.pow(-10,9);
                
                cur[j]=Math.max(up, Math.max(ld, rd));
            }
            prev=cur;
        }
        int maxi=Integer.MIN_VALUE;
        for(int j=0;j<m;j++){
            System.out.print(prev[j]+"   ");
            maxi=Math.max(maxi, prev[j]) ;
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
