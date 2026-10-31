package com.Strings;

public class First_non_repeating {
	char unique(String s)
	{
		int[] freq=new int[26];
		for(int i=0;i<s.length();i++)
		{
			freq[s.charAt(i)-'a']++;
		}
		for(int i=0;i<s.length();i++)
		{
			if(freq[s.charAt(i)-'a']==1)
			{
				return  s.charAt(i);
			}
		}
		return ' ';
	}
	void main() {
		String s="geeksforageeks";
		System.out.println(unique(s));
	}

}
