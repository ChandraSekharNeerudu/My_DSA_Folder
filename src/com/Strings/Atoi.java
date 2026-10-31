  package com.Strings;
//Implement a function that converts a string to a 32-bit signed integer.
//must handle:Leading whitespace.Optional '+' or '-' signs.Non-digit characters.Integer 
//Overflow: If the number is out of the range [-2^{31}, 2^{31} - 1], return the boundary 
//value.
public class Atoi {
	void toInteger(String s)
	{
		long num=0;
		long minus=0;
		long plus=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				continue;
			}
			
			if(s.charAt(i)==45)//-
			{
				i++;
				while(i<s.length() && s.charAt(i)!=43 )
				{
					if(Character.isDigit(s.charAt(i)))
					{
						 minus=(minus*10)+(s.charAt(i)-'0');
					}
				  i++;
				}
			}
			else if(s.charAt(i)==43)// +
			{
				i++;
				while(i<s.length() && s.charAt(i)!=45 )
				{
					if(Character.isDigit(s.charAt(i)))
					{
						plus=(plus*10)+(s.charAt(i)-'0');
					}
				  i++;
				}
			}
			else
			{
				if(Character.isDigit(s.charAt(i)))
				{
					 plus=(plus*10)+(s.charAt(i)-'0');
				}
			}
		}
		
		num=plus- minus;
		if(num>Integer.MAX_VALUE)
		{
			System.out.println(Integer.MAX_VALUE);
		}
		else System.out.println(num);
		
	}
	void main()
	{
		String s = "91283472332";
		toInteger(s);
	}
	public int myAtoi(String s) {
	    if (s == null || s.length() == 0) return 0;

	    int i = 0, n = s.length();
	    
	    // 1. Skip leading whitespaces
	    while (i < n && s.charAt(i) == ' ') {
	        i++;
	    }

	    // 2. Check for sign
	    int sign = 1;
	    if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
	        sign = (s.charAt(i) == '-') ? -1 : 1;
	        i++;
	    }

	    // 3. Convert digits and handle overflow
	    long result = 0;
	    while (i < n && Character.isDigit(s.charAt(i))) {
	        result = result * 10 + (s.charAt(i) - '0');
	        
	        // Check for overflow immediately
	        if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
	        if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;
	        
	        i++;
	    }

	    return (int) (result * sign);
	}

}
