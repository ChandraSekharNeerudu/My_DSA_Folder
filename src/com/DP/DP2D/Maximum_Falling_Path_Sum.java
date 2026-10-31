package com.DP.DP2D;

public class Maximum_Falling_Path_Sum {
	public static void main(String[] args) {
		int[][] matrix= {{1,2,10,4},{100,3,2,1},{1,1,20,2},{1,2,2,1}};
		System.out.println(Tab(matrix));
	}
	public static int getMaxPathSum(int[][] matrix) {
		int n=matrix.length,m=matrix[0].length;
		return Tab(matrix);
		/*int[][] dp=new int[n][m];
		for(int[] a:dp)Arrays.fill(a,-1);
		
		int max=Integer.MIN_VALUE;
		for(int j=0;j<matrix[0].length;j++){
			max=Math.max(max,DP(n-1,j,matrix, dp));
		}
		return max;*/

		/*int max=Integer.MIN_VALUE;
		for(int j=0;j<matrix[0].length;j++){
			max=Math.max(max,Rec(matrix.length-1,j,matrix));
		}
		return max;*/
	}
	public static int Rec(int i,int j,int[][] matrix) {
		if(j<0||j>=matrix[0].length)return Integer.MIN_VALUE;
		if(i==0)return matrix[i][j];

		int up=Rec(i-1,j,matrix);
		int leftdg=Rec(i-1,j-1,matrix);
		int rightdg=Rec(i-1,j+1,matrix);
		int cur=Math.max(up,Math.max(leftdg,rightdg));;
		cur+=matrix[i][j];
		return cur;

	}
	public static int DP(int i,int j,int[][] matrix,int[][] dp) {
		if(j<0||j>=matrix[0].length)return Integer.MIN_VALUE;
		if(i==0)return matrix[i][j];
		if(dp[i][j]!=-1)return dp[i][j];

		int up=DP(i-1,j,matrix,dp);
		int leftdg=DP(i-1,j-1,matrix,dp);
		int rightdg=DP(i-1,j+1,matrix,dp);
		int cur=Math.max(up,Math.max(leftdg,rightdg));;
		cur+=matrix[i][j];
		return dp[i][j]=cur;

	}

	public static int Tab(int[][] matrix) {
		int n=matrix.length,m=matrix[0].length;

		int[][] dp=new int[n][m];
		for(int j=0;j<m;j++){
			dp[0][j]=matrix[0][j];
		}

		for(int i=1;i<n;i++){
			for(int j=0;j<m;j++){
				int up=matrix[i][j]+dp[i-1][j];
				int leftdg=Integer.MIN_VALUE;
			    if(j>0)leftdg=matrix[i][j]+dp[i-1][j-1];
				int rightdg=Integer.MIN_VALUE;
				if(j<m-1)rightdg=matrix[i][j]+dp[i-1][j+1];
				dp[i][j]=Math.max(up,Math.max(leftdg,rightdg));
			}
		}
		
		int max=Integer.MIN_VALUE;
		for(int j=0;j<matrix[0].length;j++){
			max=Math.max(max,dp[n-1][j]);
		}
		return max;
	}
}
