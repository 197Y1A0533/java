package DP.DP_Basic;

public class FibonaciiUsingTabulationSpaceoptimization {
    public static void main(String args[]) {

        int n=6;
        int prev2= 0;
        int prev= 1;
        
        for(int i=2; i<=n; i++){
            int curl=prev+prev2;
            prev2=prev;
            prev=curl;
        }
        System.out.println(prev);
        
        
      }
}
