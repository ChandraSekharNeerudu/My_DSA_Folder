package com.DP.DP2D;

public class Partition_arr_into2_subsets_with_min_Difference {
	public static void main(String[] args) {
		int[] arr= {3,2,7};
		System.out.println(minSubsetSumDifference(arr, arr.length));
	}
	 public static int minSubsetSumDifference(int []arr, int n) {
	        int S=0;
	        for(int i:arr)S+=i;
	        return Tab(arr,S);
	    }
	    public static int Tab(int arr[],int k){
	        int n=arr.length;
	        boolean[][] dp=new boolean[n][k+1];
	        for(int i=0;i<n;i++){
	            dp[i][0]=true;
	        }
	        if(arr[0]<=k)dp[0][arr[0]]=true;
	        
	        for(int i=1;i<n;i++){
	            for(int j=1;j<=k;j++){
	               boolean notTake=dp[i-1][j];
	               boolean take=false;
	               if(j>=arr[i]){
	                   take=dp[i-1][j-arr[i]];
	                } 
	                dp[i][j]=(take||notTake);
	            }
	        }
	        int min=Integer.MAX_VALUE;
	        for(int i=0;i<=k/2;i++){
	            if(dp[n-1][i]){
	                int d=Math.abs(i-(k-i));
	                min=Math.min(min,d);
	            }
	        }
	        return min;
	    }
}
