package com.Strings;

//Given two strings s1 and s2, find if the first string is a Subsequence of the second string, 
//i.e. if s1 is a subsequence of s2.  A subsequence is a sequence that can be derived from 
//another sequence by deleting some elements without changing the order of the remaining 
//elements.
public class SubSequence {
	boolean sequence(String txt,String pat,int p,int t)
	{
		if(t<0) return true;
		if(p<0) return false;
		
		if(txt.charAt(p)==pat.charAt(t))
			return sequence(txt,pat,p-1,t-1);
		
		return sequence(txt,pat,p-1,t);
	}
	
	void main()
	{
		String s1 = "AXY", s2 = "ADXCPY";
		int m=s2.length()-1;
		int n=s1.length()-1;
		System.out.println(sequence(s2,s1,m,n));
	}

}
