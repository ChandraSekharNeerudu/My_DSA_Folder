package com.DP.DP2D;

import java.util.Arrays;

public class Consecutive_characters_must_differ_by_exactly_one {
	public static void main(String[] args) {
		String s = "abac";
		int n = 2;

		char last = (char) (s.charAt(s.length() - 1) + 1);
		int[][][] dp = new int[s.length()][n + 1][27];
		for (int[][] a : dp) {
			for (int[] b : a) {
				Arrays.fill(b, -1);
			}
		}
		System.out.println(DP(s.length() - 1, n, last, s, n, dp));
		System.out.println(Arrays.deepToString(dp));
		//System.out.println(Rec(s.length()-1, n, last, s,n) );
	}

	public static int Rec(int ind, int l, char prev, String str, int n) {
		if (l == 0)return 1;
		
		if (ind == 0) {
			char cur = str.charAt(0);
			if (Math.abs(prev - cur) == 1 && l - 1 == 0)
				return 1;
			return 0;
		}

		char last = prev;
		if (l == n)
			last = (char) (str.charAt(ind - 1) + 1);
		int notTake = Rec(ind - 1, l, last, str, n);
		int take = 0;
		char cur = str.charAt(ind);
		if (Math.abs(prev - cur) == 1)
			take = Rec(ind - 1, l - 1, cur, str, n);
		return take + notTake;
	}

	public static int DP(int ind, int l, char prev, String str, int n, int[][][] dp) {
		if (l == 0)return 1;

		if (ind == 0) {
			char cur = str.charAt(0);
			if (Math.abs(prev - cur) == 1 && l - 1 == 0)
				return 1;
			return 0;
		}

		char c = str.charAt(ind);
		int ci = (c > 'z') ? 26 : (c - 'a');
		
		if (dp[ind][l][ci] != -1)
			return dp[ind][l][ci];

		char last = prev;
		
		if (l == n)
			last = (char) (str.charAt(ind - 1) + 1);

		int notTake = DP(ind - 1, l, last, str, n, dp);
		
		int take = 0;
		char cur = str.charAt(ind);
		if (Math.abs(prev - cur) == 1)
			take = DP(ind - 1, l - 1, cur, str, n, dp);
		return dp[ind][l][ci] = take + notTake;
	}

}
