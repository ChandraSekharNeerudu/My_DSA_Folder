package com.Strings;

public class Sub_Max_Palindrome {
	private String longestPalindrome(String s) {
		int n=s.length();
		int ml=0;
		int mr=0;
		int maxlength=0;
		for(int i=0;i<n;i++) {
			int l=i;int r=i;//even length
			while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)) {
				if(r-l+1>maxlength)
				{
					maxlength=r-l+1;
					ml=l;
					mr=r;
				}
				l--;
				r++;
			}
			
			l=i; r=i+1;//odd length
			while(l>=0&&r<n&&s.charAt(l)==s.charAt(r)) {
				if(r-l+1>maxlength)
				{
					maxlength=r-l+1;
					ml=l;
					mr=r;
				}
				l--;
				r++;
			}
			
			
		}
		return s.substring(ml,mr+1);
	}
	void main()
	{
		String s="ababba";
		//longSubPalindrome(s);
		System.out.println(longestPalindrome(s));
		
		
	}
	//My Implimentation
	void longSubPalindrome(String s)
	{
		int max=0;
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++)
			{
				
				boolean ispalindrome=isPalindrome(s,i,j);
				if(ispalindrome)
				{
					max=Math.max(max,j-i+1);
				}
			}
		}
		System.out.println(max);
	}
	private boolean isPalindrome(String str,int s,int e) {
		while(s<e)
		{
			if(str.charAt(s)!=str.charAt(e))
			{
				return false;
			}
			s++;
			e--;
		}
		return true;
	}
	

}
