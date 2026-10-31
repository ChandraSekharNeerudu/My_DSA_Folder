package com.Strings;

public class K_Anagrams {
	boolean isAnagram(String s1,String s2,int k)
	{
		//str1 = "anagram" , str2 = "grammar" , k = 3
		int[] freq=new int[26];
		int count=0;
		for(int i=0;i<s1.length();i++) {
			freq[s1.charAt(i)-'a']++;
			freq[s2.charAt(i)-'a']--;
		}
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=0)
			{
				count++;
			}
		}
		System.out.println(count);
		if((count/2)>k) {
			return false;
		}
		return true;
	}
	void main()
	{
		String s1="abc";
		String s2="def";
		System.out.println(isAnagram(s1,s2,2));
	}

}
