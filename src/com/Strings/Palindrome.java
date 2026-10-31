package com.Strings;

public class Palindrome {
	int ispalindrome(String str)
	{
		int s=0,e=str.length()-1;
		while(s<e)
		{
			if(str.charAt(s)!=str.charAt(e))
			{
				return 0;
			}
			s++;
			e--;
		}
		return 1;
	}
	
	void main()
	{
		String s="ababa ababa";
		System.out.println(ispalindrome(s));
	}

}
