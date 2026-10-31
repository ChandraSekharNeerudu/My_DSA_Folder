package com.Strings;

public class URLify {
	void replace(String s,char c,String subs)
	{
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==c)
			{
				sb.append(subs);
				continue;
			}
			sb.append(s.charAt(i));
		}
		System.out.println(sb);
		
	}
	void main()
	{
		String s="hey buddy stay hard";
		replace(s,' ', "%20");
	}

}
