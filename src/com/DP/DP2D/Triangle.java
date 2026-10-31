package com.DP.DP2D;

public class Triangle {
	public static void main(String[] args) {
		int[][] triangle= {{1},{2,3},{3,6,7},{8,9,6,10}};
		System.out.println(minimumPathSum(triangle, triangle.length));
	}
	public static int minimumPathSum(int[][] triangle, int n) {
        //return recursion(0,0,triangle);
        /*int[][] dp=new int[n][n];
        for(int[] d:dp)
         Arrays.fill(d,-1);*/
       return tab(triangle);
    }
    public static int recursion(int i,int j,int[][] triangle){
        if(i==triangle.length-1)return triangle[i][j];

        int down=triangle[i][j]+recursion(i+1,j,triangle);
        int diagnal=triangle[i][j]+recursion(i+1,j+1,triangle);
        return Math.min(down,diagnal);
    }
    public static int DP(int i,int j,int[][] triangle,int[][] dp){
        if(i==triangle.length-1)return triangle[i][j];
        if(dp[i][j]!=-1)return dp[i][j];

        int down=triangle[i][j]+DP(i+1,j,triangle,dp);
        int diagnal=triangle[i][j]+DP(i+1,j+1,triangle,dp);
        return dp[i][j]=Math.min(down,diagnal);
    }

    public static int tab(int[][] triangle){
        int n=triangle.length;
        int[][] dp=new int[n][n];
        for(int j=0;j<n;j++){
            dp[n-1][j]=triangle[n-1][j];
        }

        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int down=triangle[i][j]+dp[i+1][j];
                int diagnal=triangle[i][j]+dp[i+1][j+1];
                dp[i][j]=Math.min(down,diagnal);
            }
        }
        return dp[0][0];
    }
}
