package corp.Backtracking;
import java.util.*;
public class n_queens {
	public static void main(String[] args) {
		int n=4;
		int[][] pos=new int[n][n];
		List<List<Integer>> list=new ArrayList<>();
		findPlaces(0,n,pos,list);
		System.out.println(list.size());
		System.out.println(list);
	}
	public static void findPlaces(int r,int n,int[][] mat,List<List<Integer>> list)
	{
	    if(r==n)
	    {
	        List<Integer> ans=new ArrayList<>();
	        for(int i=0;i<n;i++)
	         for(int j=0;j<n;j++)
	            if(mat[i][j]==1)
	              ans.add(j+1);
	              
	        list.add(ans);  
	        return;
	    }
	    for(int c=0;c<n;c++)
	    {
	        if(isValid(mat,r,c))
	        {
	            mat[r][c]=1;
	            findPlaces(r+1,n,mat,list);
	            mat[r][c]=0;
	        }
	        
	    }
	}
	public static boolean isValid(int[][] mat,int r,int c)
	{
	    for(int r1=0;r1<r;r1++)//same col on above rows check
	        if(mat[r1][c]==1)
	            return false;
	        
	    for(int r1=r-1,c1=c-1;r1>=0&&c1>=0;r1--,c1--)//checking left diagonal
	    {
	        if(mat[r1][c1]==1)
	        return false;
	    }
	    
	    int n=mat.length;
	    for(int r1=r-1,c1=c+1;r1>=0&&c1<n;r1--,c1++)//checking right diagonal
	      if(mat[r1][c1]==1)
	            return false;
	    
	    
	   return true; 
	}
}
