package com.Strings;

public class First_repeating_char {
	char repeat(String s)
	{
		int[] freq=new int[26];
		for(int i=0;i<s.length();i++)
		{
			freq[s.charAt(i)-'a']++;
			if(freq[s.charAt(i)-'a']>1)
			{
				return s.charAt(i);	
			}
		}
		return ' ';
	}
	void main()
	{
		String s="hello geeks";
		System.out.println(repeat(s));
	}

}
