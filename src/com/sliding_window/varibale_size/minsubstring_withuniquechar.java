package com.sliding_window.varibale_size;

import java.util.*;
//frequency tracking in variable-sized windows.
public class minsubstring_withuniquechar {
	static void minstsubstring(String s)
	{
		int ans=s.length();
		// 1. Find the total number of distinct unique characters in the entire string
		Set<Character> set=new HashSet<>();//unique characters
		for(int i=0;i<s.length();i++)
		{
			set.add(s.charAt(i));
		}
		// 2. Sliding Window variables
		int windowsize=set.size();
		int left=0;
		int minlen=Integer.MAX_VALUE;
		int startInd=-1;
		
		Map<Character,Integer> map=new HashMap<>();
		for(int right=0;right<s.length();right++)
		{
			char ch=s.charAt(right);
			map.put(ch, map.getOrDefault(ch, 0)+1);
			
			// 3. When the window contains all unique characters, try to shrink it
			while(windowsize==map.size())
			{
				// Update minimum details if current window is smaller
				if(right-left+1<minlen)
				{
					minlen=right-left+1;
					startInd=left;
				}
				
				// Shrink from the left
				char leftchar=s.charAt(left);
				map.put(leftchar, map.get(leftchar)-1);
				if(map.get(leftchar)==0)
				{
					map.remove(leftchar);// Remove key completely to update map.size()
				}
				left++;
			}
		}
	
		System.out.println(minlen);
		if(startInd!=-1) System.out.println(s.substring(startInd,startInd+windowsize));
		else System.out.println(-1);
	}
	
	public static void main(String[] args) {
		String s="ababbbccbaa";
		minstsubstring(s);
	}

}
