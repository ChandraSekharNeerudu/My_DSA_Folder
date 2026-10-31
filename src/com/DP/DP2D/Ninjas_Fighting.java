package com.DP.DP2D;

import java.util.Arrays;

/*
 * Problem statement
Ninja is planing this ‘N’ days-long training schedule. Each day, he can perform any one of these three activities. (Running, Fighting Practice or Learning New Moves). Each activity has some merit points on each day. As Ninja has to improve all his skills, he can’t do the same activity in two consecutive days. Can you help Ninja find out the maximum merit points Ninja can earn?

You are given a 2D array of size N*3 ‘POINTS’ with the points corresponding to each day and activity. Your task is to calculate the maximum number of merit points that Ninja can earn.

For Example
If the given ‘POINTS’ array is [[1,2,5], [3 ,1 ,1] ,[3,3,3] ],the answer will be 11 as 5 + 3 + 3.
Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= T <= 10
1 <= N <= 100000.
1 <= values of POINTS arrays <= 100 .

Time limit: 1 sec
Sample Input 1:
2
3
1 2 5 
3 1 1
3 3 3
3
10 40 70
20 50 80
30 60 90
Sample Output 1:
11
210
Explanation of sample input 1:
For the first test case,
One of the answers can be:
On the first day, Ninja will learn new moves and earn 5 merit points. 
On the second day, Ninja will do running and earn 3 merit points. 
On the third day, Ninja will do fighting and earn 3 merit points. 
The total merit point is 11 which is the maximum. 
Hence, the answer is 11.

For the second test case:
One of the answers can be:
On the first day, Ninja will learn new moves and earn 70 merit points. 
On the second day, Ninja will do fighting and earn 50 merit points. 
On the third day, Ninja will learn new moves and earn 90 merit points. 
The total merit point is 210 which is the maximum. 
Hence, the answer is 210.
 */
public class Ninjas_Fighting {
	
	/*public static int DP2(int r,int c,int[][] arr,int[][] dp) {
		if(r==arr.length)return 0;
		if(dp[r][c]!=-1)return dp[r][c];
		
		int max=Integer.MIN_VALUE;
		for(int j=0;j<arr[r].length;j++) {
			if(j==c)continue;
			
			max=Math.max(max, arr[r][c]+DP2(r+1,j,arr,dp));
		}
		return dp[r][c]=max;
	}
	public static int findMax(int r,int c,int[][] arr) {
		if(r==arr.length)return 0;
		int max=Integer.MIN_VALUE;
		for(int j=0;j<arr[r].length;j++) {
			if(j==c)continue;
			
			max=Math.max(max, arr[r][c]+findMax(r+1,j,arr));
		}
		return max;
	}*/
	
	
	public static int findMax2(int r,int c,int[][] arr) {
		if(r==0) {
			int max=Integer.MIN_VALUE;
			for(int j=0;j<arr[r].length;j++) {
				if(j==c)continue;
				max=Math.max(max,arr[r][j]);
			}
			return max;
		}
		int max=Integer.MIN_VALUE;
		for(int j=0;j<arr[r].length;j++) {
			if(j==c)continue;
			
			max=Math.max(max, arr[r][j]+findMax2(r-1,j,arr));
		}
		return max;
	}
	public static int DP(int r,int c,int[][] arr,int[][] dp) {
		if(r==0) {
			int max=Integer.MIN_VALUE;
			for(int j=0;j<3;j++) {
				if(j==c)continue;
				max=Math.max(max,arr[r][j]);
			}
			return max;
		}
		if(dp[r][c]!=-1)return dp[r][c];
		int max=Integer.MIN_VALUE;
		for(int j=0;j<3;j++) {
			if(j==c)continue;
			
			max=Math.max(max, arr[r][j]+DP(r-1,j,arr,dp));
		}
		return dp[r][c]=max;
	}
	
	public static int Tab(int[][] arr) {
		int[][] dp=new int[arr.length][3];
		for(int i=0;i<3;i++)dp[0][i]=arr[0][i];
		
		for(int i=1;i<arr.length;i++) {
			for(int j=0;j<3;j++) {
				int max=Integer.MIN_VALUE;
				for(int c=0;c<3;c++) {
					if(c==j)continue;
					max=Math.max(max, dp[i-1][c]);
				}
				dp[i][j]=arr[i][j]+max;
			}
		}
		System.out.println(Arrays.deepToString(dp));
		
		int l=arr.length-1;
		return (dp[l][0]>dp[l][1]&&dp[l][0]>dp[l][2])?dp[l][0]:(dp[l][1]>dp[l][2])?dp[l][1]:dp[l][2];
	}
	
	public static void main(String[] args) {
		int[][] arr= {{10,40,70},{20,50,80},{30,60,90},{40, 70, 100}};
		int[][] dp=new int[arr.length][4];
		for(int[] n:dp) {
			Arrays.fill(n, -1);
		}
		System.out.println(Tab(arr));
//		System.out.println(DP(arr.length-1, 3, arr, dp));
//		System.out.println(Arrays.deepToString(dp));
		//System.out.println(findMax2(arr.length-1, 3, arr));
		
		
	/*	int max=Integer.MIN_VALUE;
		for(int i=0;i<arr[0].length;i++) {
			max=Math.max(max,DP2(0, i, arr,dp));
		}
		System.out.println(max);
		
		for(int[] n:dp) {
			System.out.println(Arrays.toString(n));
		}
		*/
	}
}
