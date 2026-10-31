package com.DP;

import java.util.Arrays;

public class Frog_Jump_K_Steps {
	void main() {
		int[] heights= {10, 30, 40, 50, 20};//{10,20,30,10};
		int n=heights.length;
		int k=3;
		System.out.println(recursion(n-1,k,heights));
		System.out.println();
		
		int[] dp=new int[n];
		Arrays.fill(dp,-1);
		System.out.println(DP(n-1,k,heights,dp));
		System.out.println(Arrays.toString(dp));
		System.out.println();
		
		System.out.println(Tab(k,heights));
	}

	private int recursion(int ind,int k,int[] heights) {
		if(ind==0) return 0;
		
		int min=Integer.MAX_VALUE;
		
		
		// Try all possible jump sizes from 1 up to k
	    for (int i = 1; i <= k; i++) {
	        if (ind - i >= 0) {
	            int cost = recursion(ind - i, k, heights) + Math.abs(heights[ind] - heights[ind - i]);
	            min = Math.min(min, cost);
	        }
	    }
		return min;
	}
	
	public int DP(int ind,int k,int[] heights,int[] dp) {
		if(ind==0)return 0;
		if(dp[ind]!=-1)return dp[ind];
		
		int min=Integer.MAX_VALUE;
		for(int i=1;i<=k;i++) {
			if(ind-i>=0) {
				int cost = DP(ind - i, k, heights,dp) + Math.abs(heights[ind] - heights[ind - i]);
	            min = Math.min(min, cost);
			}
		}
		
		return dp[ind]=min;
	}
	
	public int Tab(int k,int[] heights) {
		int n=heights.length;
		int[] dp=new int[n];
		dp[0]=0;
		dp[1]=Math.abs(heights[1]-heights[0]);
		for(int i=2;i<n;i++) {
			int min=Integer.MAX_VALUE;
			for(int j=1;j<=k;j++) {
				if(i-j>=0) {
					min=Math.min(min, Math.abs(heights[i]-heights[i-j])+dp[i-j]);
				}
			}
			dp[i]=min;
		}
		System.out.println(Arrays.toString(dp));
		return dp[n-1];
	}
}

