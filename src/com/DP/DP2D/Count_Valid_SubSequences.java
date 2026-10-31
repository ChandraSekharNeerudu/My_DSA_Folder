package com.DP.DP2D;

import java.util.Arrays;

public class Count_Valid_SubSequences {
	public static void main(String[] args) {
		String str="abca";
		int n=3;
		int[][][] dp=new int[str.length()][n+1][27];
		for(int[][] a:dp) {
			for(int[] b:a){
				Arrays.fill(b,-1);
			}
		}
		System.out.println(DP(str.length()-1, str, n, (char)('z'+1), dp));
		//System.out.println(Rec(str.length()-1, str, n, '#'));
	}
	
	public static int Rec(int ind,String str,int left,char last) {
		if(left==0)return 1;
		
		if(ind<0)return 0;
		
		//not take
		int notTake=Rec(ind-1, str, left, last);
		//take
		int take=0;
		char cur=str.charAt(ind);
		if(last==cur)take= 0;
		else take=Rec(ind-1, str, left-1, cur);
		return take+notTake;
	}
	public static int DP(int ind,String str,int left,char last,int[][][] dp) {
		if(left==0)return 1;
		
		if(ind<0)return 0;
		int charInd=(last>'z')?26:last-'a';
		if(dp[ind][left][charInd]!=-1)return dp[ind][left][charInd];
		
		//not take
		int notTake=DP(ind-1, str, left, last,dp);
		//take
		int take=0;
		char cur=str.charAt(ind);
		if(last==cur)take= 0;
		else take=DP(ind-1, str, left-1, cur,dp);
		return take+notTake;
	}
	
	
	/*public static int countsequences(int i,String cur,String str,int n) {
		if(cur.length()==n) {
			if(isValid(cur)) return
		if(i==str.length())return 0;
		
		return countsequences(i+1, cur+str.charAt(i), str, n)+countsequences(i+1, cur, str, n);
	}
	private static boolean isValid(String cur) {
		for(int i=1;i<cur.length();i++) {
			if(cur.charAt(i-1)==cur.charAt(i))return false;
		}
		return true;
	}*/
}
