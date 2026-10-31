package com.DP;

import java.util.ArrayList;
import java.util.Arrays;

public class Robbers1_Subsequences {
	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>(Arrays.asList(5,6,6));
		System.out.println(maximumNonAdjacentSum(arr));
	}
	public static int maximumNonAdjacentSum(ArrayList<Integer> nums) {
		int n=nums.size();
		return Tab(n,nums);

		/*int[] dp=new int[n];
		Arrays.fill(dp,-1);
		return DP(n-1,nums,dp);*/

		//return Rec(n-1,nums);
	}
	public static int Rec(int i,ArrayList<Integer> nums) {
		// Write your code here.
		if(i<=1)return nums.get(i);


		return Math.max(nums.get(i)+Rec(i-2,nums),Rec(i-1,nums));
	}
	public static int DP(int i,ArrayList<Integer> nums,int[] dp) {
		// Write your code here.
		if(i<=1)return nums.get(i);
		if(dp[i]!=-1)return dp[i];
		
		return dp[i]=Math.max(nums.get(i)+Rec(i-2,nums),Rec(i-1,nums));
	}
	public static int Tab(int n,ArrayList<Integer> nums) {
		if(n<2)return nums.get(0);
		
		int[] dp=new int[n];
		dp[0]=nums.get(0);
		dp[1]=Math.max(nums.get(1),nums.get(0));
		for(int i=2;i<n;i++){
			dp[i]=Math.max(nums.get(i)+dp[i-2],dp[i-1]);
		}

		
		return dp[n-1];
	}
	public static int space(int n,ArrayList<Integer> nums) {
		if(n<2)return nums.get(0);
		
		
		int prev2=nums.get(0);
		int prev1=Math.max(nums.get(1),nums.get(0));
		for(int i=2;i<n;i++){
			int cur=Math.max(nums.get(i)+prev2,prev1);
			
			prev2=prev1;
			prev1=cur;
		}

		return prev1;
	}
}
