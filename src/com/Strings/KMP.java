package com.Strings;

public class KMP {
	public int[] lps(String pat)
	{
		int n=pat.length();;
		int[] arr=new int[n];
		int j=0;
		int i=1;
		arr[0]=0;
		while(i<n)
		{
			if(pat.charAt(i)==pat.charAt(j))
			{
				j++;
				arr[i]=j;
				i++;
			}
			else
			{
				if(j==0)
				{
					arr[i]=0;
					i++;
				}
				else
				{
					j=arr[j-1];
				}
			}
		}
		return arr;
	}
	
	boolean kmp(String txt,String pat)
	{
		int m=txt.length();
		int n=pat.length();
		int[] lps=lps(pat);
		int i=0;
		int j=-1;
		
		while(i<m)
		{
			if(txt.charAt(i)==pat.charAt(j+1))
			{
				i++;
				j++;
			}
			if(j==n)
			{
				return true;
			}
			else if( i<m && txt.charAt(i)!=pat.charAt(j))
			{
				if(j!=0)
				{
					j=lps[j-1];
				}
				else
				{
					i=i+1;
				}
			}
			
		}
		return false;
	}

}
