package DP.DP_Basic;

import java.util.ArrayList;
import java.util.List;

public class HouseRobbery2 {
    public static void main(String[] args) {
        /* int n=5;
        int[] a={1 ,5 ,1, 2 ,6}; */
        /* int n=4;
        int a[]={2,1,4,9}; */
        int n=3;
        int a[]={2,3,2};
        System.out.println(solve(n,a));
    }

    private static long solve(int n, int[] a) {
        List<Integer> arr1=new ArrayList<>();
        List<Integer> arr2=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(i!=0)
                arr1.add(a[i]);
            if(i!=n-1)
                arr2.add(a[i]);
        }
        long ans1=getMaxProfit(arr1);
        long ans2=getMaxProfit(arr2);
        return Math.max(ans1, ans2);
    }

    private static long getMaxProfit(List<Integer> arr) {
        int n=arr.size();
        long prev=arr.get(0);
        long prev2=0;
        for(int i=1;i<n;i++){
            long pick=arr.get(i);
            if(i>1)
                pick=pick+prev2;
            long nonPick=0+prev;
            long curl=Math.max(pick, nonPick);
            prev2=prev;
            prev=curl;
        }
        return prev;
    }
}
