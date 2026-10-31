package corp.DP.DP2D;

import java.util.Arrays;

//it is same like Possible_Paths_Down_Right but here there are obstacles so we can not move in that path
public class Possible_Paths_Down_Right2 {
	public static void main(String[] args)
	{
		int[][] arr= {{0,0,1},{0,0,0},{0,0,0}};
		int r=arr.length;
		int c=arr[0].length;
		int[][] dp=new int[r][c];
		for(int i=0;i<r;i++)
		{
			Arrays.fill(dp[i], -1);
		}
		int paths=pp(0,0,r,c,arr,dp);
		System.out.println(paths);
	}

	private static int pp(int i,int j,int r,int c,int[][] arr,int[][] dp) {
		if(i<r && j<c && arr[i][j]==1) return 0;
		if(i==r-1 && j==c-1) return 1;
		if(i>=r || j>=c) return 0;
		if(dp[i][j]!=-1) return dp[i][j];
		int rp=pp(i,j+1,r,c,arr,dp);
		int dw=pp(i+1,j,r,c,arr,dp);
		return dp[i][j]=rp+dw;
	}
	
}
