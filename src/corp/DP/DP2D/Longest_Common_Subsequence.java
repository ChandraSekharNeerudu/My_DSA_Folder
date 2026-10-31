package corp.DP.DP2D;

import java.util.Arrays;

public class Longest_Common_Subsequence {
	void main() {
		String s1="abcde";
		String s2="badce";
		int n=s1.length(),m=s2.length();
		//Backtracking
		int l1=check1(n-1,m-1,s1,s2);
		System.out.println("Backtracking: "+l1);
		//DP
		int[][] dp=new int[n][m];
		for(int[] a:dp) Arrays.fill(a, -1);
		int l2=check2(n-1,m-1,s1,s2,dp);
		System.out.println("DP: "+l2);
	}
	
	//backtracking
	public int check1(int i, int j, String s1, String s2) {
		if(i<0 || j<0) return 0;
		if(s1.charAt(i)==s2.charAt(j))
		{
			return 1+check1(i-1,j-1,s1,s2);
		}else{
			return Math.max(check1(i-1,j,s1,s2),check1(i,j-1,s1,s2));
		}
	}
	
	//DP
	public int check2(int i, int j, String s1, String s2, int[][] dp) {
		if(i<0 || j<0) return 0;
		if(dp[i][j]!=-1) return dp[i][j];
		if(s1.charAt(i)==s2.charAt(j))
		{
			dp[i][j]= 1+check2(i-1,j-1,s1,s2,dp);
		}else{
			dp[i][j]=Math.max(check2(i-1,j,s1,s2,dp),check2(i,j-1,s1,s2,dp));
		}
		return dp[i][j];
	}
}
