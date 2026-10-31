package corp.DP;

public class Fibbonacci {
	void main() {
		int n=6;
		int res=fibb(n);
		System.out.println(res);
	}

	private int fibb(int n) {
		int[] dp=new int[n+1];
		dp[1]=1;
		for(int i=2;i<=n;i++)
		{
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}
}
