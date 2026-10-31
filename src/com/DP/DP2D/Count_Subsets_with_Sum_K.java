package com.DP.DP2D;

import java.util.Arrays;

public class Count_Subsets_with_Sum_K {
	public static void main(String[] args) {
		int[] arr= {12,14,3,18,2};
		int k=10;
		System.out.println(findWays(arr, k));
	}
	public static int findWays(int num[], int tar) {
        // Write your code here.
		int MOD = 1000000007;
       int[][] dp=new int[num.length][tar+1];
       for(int[] a:dp){
           Arrays.fill(a,-1);
       }
       return DP(num.length-1,tar,num,dp,MOD);
       // return Rec(num.length-1,tar,num);
    }
    public static int Rec(int ind,int target,int[] arr){
        if(target==0)return 1;

        if(ind==0){
            return (arr[ind]==target)?1:0;
        }

        //not take
        int count=0;
        count+=Rec(ind-1,target,arr);
        //not take
        if(target>=arr[ind])count+=Rec(ind-1,target-arr[ind],arr);
        return count;
    }
    public static int DP(int ind,int target,int[] arr,int[][] dp,int MOD){
        if(target==0){
           return  (ind>-1 && arr[ind]==0)?1+DP(ind-1,target,arr,dp,MOD):1;
        }

        if (ind == 0) {
            int count = 0;
            // If target is 0 and arr[0] is also 0, we have 2 ways (take or not take arr[0])
            if (target == 0 && arr[0] == 0) return 2;
            // If target is 0 or target matches arr[0], we have 1 way
            if (target == 0 || target == arr[0]) return 1;
            return 0;
        }
        if(dp[ind][target]!=-1)return dp[ind][target];

        //not take
        int count=0;
        count+=DP(ind-1,target,arr,dp,MOD);
        //not take
        if(target>=arr[ind])count+=DP(ind-1,target-arr[ind],arr,dp,MOD);
        return dp[ind][target] = (int)(count% MOD);
    }
}
