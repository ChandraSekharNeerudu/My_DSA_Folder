package corp.DP.DP2D;

import java.util.Arrays;

public class Possible_Paths_Down_Right {
	public static void main(String[] args)
	{
		int r=5,c=3;
		int paths=check(r,c);
		System.out.println(paths);
		
	}
	private static int check(int r, int c) {
		
		//return pp1(0,0,r,c);
		int[][] dp=new int[r][c];
		/* for(int i=0;i<r;i++)
		{
			Arrays.fill(dp[i], -1);
		}
		return pp2(0,0,r,c,dp);*/
		dp[0][0]=1;//3,3 ni 1 cheyali kani reverse iterate cheyakunda vundadtam kosam matrix ni reverse lo imagine chesukuntam andhukani right douwn kakunda left and up check chestam
		return pp3(r,c,dp);
	}

	//Backtracking
	public static int pp1(int i,int j,int r,int c)
	{
	    if(i==r-1&&j==c-1) return 1;
        if(i>=r || j>=c) return 0;     
	    int rp=pp1(i,j+1,r,c);//right path
	    int dw=pp1(i+1,j,r,c);//down path
	    
	    return rp+dw;
	}
	//DP
	public static int pp2(int i,int j,int r,int c,int[][] dp)
	{
	    if(i==r-1&&j==c-1) return 1;
        if(i>=r || j>=c) return 0;   
        if(dp[i][j]!=-1) return dp[i][j];
	    int rp=pp2(i,j+1,r,c,dp);//right path
	    int dw=pp2(i+1,j,r,c,dp);//down path
	    
	    return dp[i][j]=rp+dw; 
	}
	
	//Tabular
	public static int pp3(int r,int c,int[][] dp)
	{
		int n=dp.length;
	    for(int i=0;i<n;i++)
	    {
	    	int m=dp[i].length;
	    	for(int j=0;j<m;j++)
	    	{
	    		if(i==0 || j==0) dp[i][j]=1;
	    		else dp[i][j]=dp[i][j-1]+dp[i-1][j];
	    	}
	    }
	    for(int[] a:dp)
	    {
	    	System.out.println(Arrays.toString(a));
	    }
	    return dp[r-1][c-1];
	}
	
}
