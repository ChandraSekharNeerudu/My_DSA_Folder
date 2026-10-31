package corp.DP;

import java.util.Arrays;

public class Min_Coins_of_TargetK {
	void main() {
		int[] coins= {2,1,5};
		int target=11;
		int noofcoins=minCoins(coins,target);
		System.out.println(noofcoins);
	}

	private int minCoins(int[] coins, int k) {
		Arrays.sort(coins);
		int[] arr=new int[k+1];
		for(int i=1;i<=k;i++)
		{
			arr[i]=k+1;//Integer.MAX_VALUE;
			for(int c=0;c<coins.length;c++)
			{
				int r=i-coins[c];
				if(r>=0)
				{
					arr[i]=Math.min(arr[i], 1+arr[r]);
				}
			}
		}
		if(arr[k]>k) return -1;
		return arr[k];
	}
}
