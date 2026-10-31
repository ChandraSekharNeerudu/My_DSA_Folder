package com.DP;

import java.util.Arrays;

//frog can jump from i to i+1 or i+2 and when it jumps from i to j then it requires |arr[j]-arr[i]| nergy so find the min energy to reach end
public class Frog_Jump {
	void main() {
		int[] heights= {30,10,60,10,60,50};//{10,20,30,10};
		int n=heights.length-1;
		System.out.println(minEnergy(n,0,heights));
		int[] dp=new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(DP(n,heights,dp));
		System.out.println(Arrays.toString(dp));
		System.out.println(tab(heights));
	}
	public int minEnergy(int ind,int curE,int[] heights)
	{
		if(ind==0) {
			return curE;
		}
		
		int left_energy=Integer.MAX_VALUE;
		if(ind-1>=0) {
			int req_energy=Math.abs(heights[ind-1]-heights[ind]);
			left_energy=minEnergy(ind-1, curE+req_energy, heights);
		}
		int right_energy=Integer.MAX_VALUE;
		if(ind-2>=0) {
			int req_energy=Math.abs(heights[ind-2]-heights[ind]);
			right_energy=minEnergy(ind-2, curE+req_energy, heights);
		}
		return Math.min(left_energy, right_energy);
	}
	
	public int DP1(int ind,int curE,int[] heights,int[] dp)//not works
	{
		if(ind==0) {
			return curE;
		}
		if(dp[ind]!=-1)return dp[ind];
		
		int left_energy=Integer.MAX_VALUE;
		if(ind-1>=0) {
			int req_energy=Math.abs(heights[ind-1]-heights[ind]);
			left_energy=DP1(ind-1,curE+req_energy,heights,dp);
		}
		int right_energy=Integer.MAX_VALUE;
		if(ind-2>=0) {
			int req_energy=Math.abs(heights[ind-2]-heights[ind]);
			right_energy=DP1(ind-2,curE+req_energy,heights,dp);
		}
		return dp[ind]=Math.min(left_energy, right_energy);
	}
	
	//works
	public int DP(int ind,int[] heights,int[] dp)
	{
		if(ind==0) {
			return 0;
		}
		if(dp[ind]!=-1)return dp[ind];
		
		int left_energy=Integer.MAX_VALUE;
		if(ind-1>=0) {
			int req_energy=Math.abs(heights[ind-1]-heights[ind]);
			left_energy=req_energy+DP(ind-1,heights,dp);
		}
		int right_energy=Integer.MAX_VALUE;
		if(ind-2>=0) {
			int req_energy=Math.abs(heights[ind-2]-heights[ind]);
			right_energy=+req_energy+DP(ind-2,heights,dp);
		}
		return dp[ind]=Math.min(left_energy, right_energy);
	}
	
	// tabulation
	public int tab(int[] heights)
	{
		int n=heights.length;
		int[] arr=new int[n];
		arr[0]=0;
		arr[1]=Math.abs(heights[1]-heights[0]);
		for(int i=2;i<heights.length;i++) {
			int left=arr[i-1]+Math.abs(heights[i-1]-heights[i]);
			int right=arr[i-2]+Math.abs(heights[i-2]-heights[i]);
			arr[i]=Math.min(left, right);
		}
		System.out.println(Arrays.toString(arr));
		return arr[n-1];
	}
}
