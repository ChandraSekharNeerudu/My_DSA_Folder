package com.DP.DP2D;

public class Min_Path_Sum {
	public static void main(String[] args) {
		int[][] grid= {{1,2,3},{4,5,4},{7,5,9}};
		System.out.println(minSumPath(grid));
	}
	 public static int minSumPath(int[][] grid) {
	        return Space(grid);
	        /*int n=grid.length,m=grid[0].length;
	        return Tab(grid);*/
	        /*int[][] dp=new int[n][m];
	        for(int[] a:dp)Arrays.fill(a,-1);
	    	return DP(n-1,m-1,grid,dp);*/
	    }

	     public static int DP(int i,int j,int[][] grid,int[][] dp) {
	    	if(i==0 && j==0)return grid[0][0];
	        if(i<0 || j<0)return Integer.MAX_VALUE;

	        if(dp[i][j]!=-1)return dp[i][j];

	        int cur=grid[i][j];

	        int up=DP(i-1,j,grid,dp);
	        int left=DP(i,j-1,grid,dp);

	        cur+=Math.min(up,left);
	        return dp[i][j]=cur;
	    }
	    public static int Tab(int[][] grid) {
	        int n=grid.length,m=grid[0].length;
	        int[][] dp=new int[n][m];

	        
	        for(int r=0;r<n;r++){
	            for(int c=0;c<m;c++){
	                if(r==0 && c==0){
	                    dp[r][c]=grid[r][c];
	                    continue;
	                }
	                int cur=grid[r][c];

	                int up=Integer.MAX_VALUE;
	                if(r>0)up=dp[r-1][c];
	                int left=Integer.MAX_VALUE;
	                if(c>0)left=dp[r][c-1];

	                cur+=Math.min(up,left);
	                dp[r][c]=cur;
	            }
	        }
	        
	        return dp[n-1][m-1];
	    }
	    public static int Space(int[][] grid) {
	        int n=grid.length,m=grid[0].length;
	        int[] prev=new int[m];

	        for(int r=0;r<n;r++){
	            int[] cur=new int[m];
	            for(int c=0;c<m;c++){
	                if(r==0 && c==0){
	                    cur[c]=grid[r][c];
	                    continue;
	                }
	                int curValue=grid[r][c];

	                int up=Integer.MAX_VALUE;
	                if(r>0)up=prev[c];
	                int left=Integer.MAX_VALUE;
	                if(c>0)left=cur[c-1];

	                curValue+=Math.min(up,left);
	                cur[c]=curValue;
	            }
	            prev=cur;
	        }
	        
	        return prev[m-1];
	    }
}
