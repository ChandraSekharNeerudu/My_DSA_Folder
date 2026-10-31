package com.Strings;

public class Binary_string {
	boolean is_Binary_string(String s)
	{
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!='0' && s.charAt(i)!='1')
			{
				return false;
			}
		}
		return true;
	}
	
	void main()
	{
		String s="0000000000000000a11111110010101010110";
		System.out.println(is_Binary_string(s));
	}

}
