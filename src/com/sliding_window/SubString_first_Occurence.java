package com.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class SubString_first_Occurence {
	int subString(String txt,String pat)
	{
		int ind=0;
		int m=txt.length();
		int n=pat.length();
		int count=0;
		for(int i=0;i<=m-n;i++)
		{
			count=0;
			for(int j=0;j<pat.length();j++)
			{
				if(pat.charAt(j)==txt.charAt(i+j))
				{
					count++;
				}
			}
			if(count==n)
			{
				return i;
			}
			
		}
		return -1;
	}
	
	// Java program to check if a string is substring of other
	// using in-built functions

	class GfG {
	    public static void main(String[] args) {
	        String txt = "geeksforgeeks";
	        String pat = "eks";
	        
	        // If pat is found, returns the index of first
	        // occurrence of pat. Otherwise, returns -1
	        int idx = txt.indexOf(pat);
	      
	        if (idx != -1)
	            System.out.println(idx);
	        else
	            System.out.println(-1);
	    }
	}
	
	
	
	 void main()
	 {
		String  txt = "geeksforgeeks", pat = "eks";
		System.out.println(subString(txt,pat));
	 }

}
