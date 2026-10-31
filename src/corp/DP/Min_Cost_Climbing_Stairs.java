package corp.DP;

import java.util.Arrays;

public class Min_Cost_Climbing_Stairs {
	void main()
	{
		int[] cost= {1, 100, 1, 1, 1, 100}; //{10,15,20};
		minCost(cost);
	}

	private void minCost(int[] cost) {
		int n=cost.length;
		if(n==1)
		{
			System.out.println(cost[0]);
			return;
		}
		if(n==2)
		{
			System.out.println(Math.min(cost[n-1], cost[n-2]));
			return;
		}
		
		int[] dp=new int[n];
		dp[0]=cost[0];
		dp[1]=cost[1];
		for(int i=2;i<n;i++)
		{
			dp[i]=cost[i]+Math.min(dp[i-1], dp[i-2]);
		}
		System.out.println(Arrays.toString(dp));
		System.out.println("min cost is:"+Math.min(dp[n-1], dp[n-2]));
	}
}
