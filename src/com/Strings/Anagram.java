package com.Strings;

//Given two non-empty strings s1 and s2 of lowercase letters, determine if they are anagrams — i
//.e., if they contain the same characters with the same frequencies.
public class Anagram {
	boolean isAnagram2(String s1,String s2)//not correct bcz anagrams must be same length
	{
		int[] str1=new int[26];
		int[] str2=new int[26];
		if(s1.length()<s2.length())
		{
			for(int i=0;i<s2.length();i++)
			{
				str2[(s2.charAt(i))-'a']++;
			}
			for(int i=0;i<s1.length();i++)
			{
				str1[(s1.charAt(i))-'a']++;
			}
			for(int i=0;i<s1.length();i++)
			{
				if(str1[(s1.charAt(i))-'a']!=str2[(s1.charAt(i))-'a'])
				{
					return false;
				}
			}
			return true;
		}
		else if(s2.length()<s1.length())
		{
			for(int i=0;i<s2.length();i++)
			{
				str2[(s2.charAt(i))-'a']++;
			}
			for(int i=0;i<s1.length();i++)
			{
				str1[(s1.charAt(i))-'a']++;
			}
			for(int i=0;i<s2.length();i++)
			{
				if(str1[(s2.charAt(i))-'a']!=str2[(s2.charAt(i))-'a'])
				{
					return false;
				}
			}
			return true;
		}
		else
		{
			for(int i=0;i<s2.length();i++)
			{
				str2[(s2.charAt(i))-'a']++;
				str1[(s1.charAt(i))-'a']++;
			}
			for(int i=0;i<s2.length();i++)
			{
				if(str1[(s1.charAt(i))-'a']!=str2[(s1.charAt(i))-'a'])
				{
					return false;
				}
			}
			return true;
		}
	}
	
	boolean isAnagram1(String s1,String s2)
	{
		if (s1.length() != s2.length()) return false;

	    int[] freq = new int[26];
	    
	    // Increment for s1, Decrement for s2
	    for (int i = 0; i < s1.length(); i++) {
	        freq[s1.charAt(i) - 'a']++;
	        freq[s2.charAt(i) - 'a']--;
	    }

	    // If anagram, every index must be 0
	    for (int i : freq) {
	        if (i != 0) return false;
	    }
	    
	    return true;
	}
	
	void main()
	{
		String s1 = "allerygy", s2 = "allergyy";
		System.out.println(isAnagram1(s1,s2));
	}

}
