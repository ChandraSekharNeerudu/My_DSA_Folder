package com.Strings;

public class SubStings_start_end_with1 {
	int count(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='1')
			{
				count++;
			}
		}
		count=(count*(count-1))/2;
		return count;
	}
	void main()
	{
		String s="00100101000100101";
		System.out.println(count(s));
	}

}
