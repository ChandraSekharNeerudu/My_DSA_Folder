package corp.DP;

public class Climbing_stairs_varible_steps {
	public static void main(String[] args) {
		int n=4;
		findWays2(n);
	}
	public static void findWays1(int n)//steps 1,2,3
	{
	  
	    if(n==0) {System.out.println(1);return ;}
	    if(n==1) {System.out.println(1);return ;}
	    if(n==2) {System.out.println(2);return ;}
	    
	    long[] dp=new long[n+1];//bcz we have 0 step
	    dp[0]=1;dp[1]=1;dp[2]=2;
	    for(int i=3;i<=n;i++)
	    {
	        dp[i]=dp[i-1]+dp[i-2]+dp[i-3];
	    }
	    System.out.println(dp[n]);
	    
	}
	public static void findWays2(int n)//steps 1,2,3,4
	{
		/*Here are all 8 distinct ways to reach the 4th step:

			(1, 1, 1, 1)

			(1, 1, 2)

			(1, 2, 1)

			(2, 1, 1)

			(2, 2)

			(1, 3)

			(3, 1)

			(4)*/
	    if(n==0) {System.out.println(1);return ;}
	    if(n==1) {System.out.println(1);return ;}
	    if(n==2) {System.out.println(2);return ;}
	    if(n==3) {System.out.println(4);return ;}
	    
	    long[] dp=new long[n+1];//bcz we have 0 step
	    dp[0]=1;dp[1]=1;dp[2]=2;dp[3]=4;
	    for(int i=4;i<=n;i++)
	    {
	        dp[i]=dp[i-1]+dp[i-2]+dp[i-3]+dp[i-4];
	    }
	    System.out.println(dp[n]);
	    
	}
	
}
