package com.Strings;

public class Camel_Case_Sentence {
	static  String toCamelCase(String s)
    {
        StringBuilder sb=new StringBuilder();
        s=s.trim();
        sb.append(Character.toUpperCase(s.charAt(0)));
        for(int i=1;i<s.length();i++)
        {
            char c=s.charAt(i);
           if(c==' ')
           {
               continue;
           }
           
           if(s.charAt(i-1)==' ')
           {
               sb.append(Character.toUpperCase(c));
           }
           else sb.append(c);
        }
        return sb.toString();
    }
	
	void main()
	{
		String s="    here    comes the    garden   ";
		System.out.println(toCamelCase(s));
				
	}
	
	/* String camelCase(String s)
	{
		StringBuilder sb=new StringBuilder();
		//int j=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c==' ')
			{
				i++;
				sb.append(Character.toUpperCase(s.charAt(i)));
			}
			else sb.append(c);
		}
		return sb.toString();
	}*/
}
