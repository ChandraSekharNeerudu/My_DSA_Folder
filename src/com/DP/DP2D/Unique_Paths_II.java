package com.DP.DP2D;

import java.util.ArrayList;

public class Unique_Paths_II {
	static int mazeObstacles(int n, int m, ArrayList<ArrayList<Integer>> mat) {
        // Write your code here.
        int MOD = 1000000007;
    int[] prev = new int[m];
    
    for (int i = 0; i < n; i++) {
        int[] curr = new int[m];
        
        for (int j = 0; j < m; j++) {
           
            if (mat.get(i).get(j) == -1) {
                continue;
            }
            if (i == 0 && j == 0) {
                curr[j] = 1;
                continue;
            }
            
            long up = 0;
            if (i > 0 && mat.get(i - 1).get(j) != -1) {
                up = prev[j];
            }
            long left = 0;
            if (j > 0 && mat.get(i).get(j - 1) != -1) {
                left = curr[j - 1];
            }

            curr[j] = (int)((up + left) % MOD);
        }
        
        // Move current row to prev for the next iteration
        prev = curr; 
    }
    
    return prev[m - 1];
    }
    
    static int tab(int n, int m, ArrayList<ArrayList<Integer>> mat){
        int[][] dp=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0&&j==0){
                    dp[i][j]=1;
                    continue;
                }
                int up=0;
                if(i>0&&mat.get(i-1).get(j)!=-1 ){
                    up=dp[i-1][j];
                }
                int left=0;
                if(j>0&&mat.get(i).get(j-1)!=-1 ){
                    left=dp[i][j-1];
                }
                dp[i][j]=up+left;
            }
        }
        return dp[n-1][m-1];
    }
    static int findPaths(int n,int m,ArrayList<ArrayList<Integer>> mat,int[][] dp){
        if(n==0&&m==0)return 1;
        if(n<0||m<0||mat.get(n).get(m)==-1)return 0;
        if(dp[n][m]!=-1)return dp[n][m];

        int up=findPaths(n-1,m,mat,dp);
        int left=findPaths(n,m-1,mat,dp);
        return dp[n][m]=(up+left);
    }
}
