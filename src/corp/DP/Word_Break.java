package corp.DP;

import java.util.Arrays;

public class Word_Break {
	public static void main(String[] args) {
		String s="catsandog";
		String[] wdict={"cats","dog","sand","and","cat"};
		String s2="leetcode";
		String[] wdict2={"leet","code"};
		boolean res=allExists(s2,wdict2);
		System.out.println(res);
	}
	public static boolean allExists(String s,String[] wdict)
	{
	    boolean[] arr=new boolean[s.length()+1];
	    arr[s.length()]=true;
	    for(int i=s.length()-1;i>=0;i--)
	    {
	        int a=isExist(s.substring(i,s.length()),wdict);
	        if(a!=-1)
	        {
	            arr[i]=arr[i+a];
	        }
	        
	    }
	    System.out.println(Arrays.toString(arr));
	    return arr[0];
	}
	public static int isExist(String ss,String[] wdict)
	{
	    for(String str:wdict)
	    {
	        if(str.length()<=ss.length() && str.equals(ss.substring(0,str.length()) ) )
	        {
	            return str.length();
	        }
	    }
	    return -1;
	}
}
