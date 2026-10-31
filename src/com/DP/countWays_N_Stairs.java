package com.DP;
//https://www.naukri.com/code360/problems/count-ways-to-reach-nth-stairs_798650
public class countWays_N_Stairs {
	public static void main(String[] args) {
		System.out.println(countDistinctWayToClimbStair(4));
	}
public static long countDistinctWayToClimbStair(int nStairs) {
		
		return space(nStairs);
		/*DP
		long[] dp=new long[nStairs+1];
		Arrays.fill(dp,-1);
		return (DP(nStairs,nStairs,dp)%1000000007);*/
		
		/*recursion
		long count=0;
		count+=countWays(nStairs,nStairs);
		return (count%1000000007);*/

	}
	public static long countWays(int i,int n){
		if(i==0)return 1;
		
		if(i<0)return 0;

		return countWays(i-1,n)+countWays(i-2,n);
	}
	public static long DP(int i,int n,long[] dp){
		if(i==0)return 1;
		
		if(i<0)return 0;
		if(dp[i]!=-1)return dp[i];

		return dp[i]=countWays(i-1,n)+countWays(i-2,n);
	}
	public static long Tab(int n){
		if(n<2)return 1;
		long[] dp=new long[n+1];
		dp[0]=1;
		dp[1]=1;
		for(int i=2;i<n+1;i++){
			dp[i]=(dp[i-1]+dp[i-2])%1000000007;
		}

		return (dp[n]);
	}
	public static long space(int n){
		if(n<2)return 1;
		
		long prev1=1;
		long prev2=1;
		for(int i=2;i<n+1;i++){
			long cur=0;
			cur=(prev1+prev2)%1000000007;

			prev2=prev1;
			prev1=cur;
		}

		return prev1;
	}
}
