package com.sliding_window;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_consecutives_inString {
	
	void removeDupe(String s)//aaaabbbbbb
	{
		if(s.length()<2)
		{
			System.out.println(s);
			return;
		}
		StringBuilder sb=new StringBuilder();
		// Start by adding the first character
	    sb.append(s.charAt(0));
		for(int r=1;r<s.length();r++)
		{
			if(sb.indexOf(s.charAt(r)+"")==-1)
			{
				sb.append(s.charAt(r));
			}
			
		}
		System.out.println(sb.toString());
	}
	void using_hashset(String s)
	{
		Set<Character> unique=new LinkedHashSet<>();
		for(int r=0;r<s.length();r++)
		{
			unique.add(s.charAt(r));
		}
		StringBuilder s1=new StringBuilder();
		for(char c:unique)
		{
			s1.append(c);
		}
		
		System.out.println(s1);
	}
	void main()
	{
		String s="geeksforgeeks";//"aaddabbccb";
		removeDupe(s);
		using_hashset(s);
	}

}
