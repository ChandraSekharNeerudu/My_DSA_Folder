package com.Strings;

import java.util.Arrays;

public class Reverse_words {
	void reverse(String s)
	{
		String[] words=s.split("\\s+");
		int start=0,end=words.length-1;
		while(start<end)
		{
			String temp=words[start];
			words[start]=words[end];
			words[end]=temp;
			start++;
			end--;
		}
		System.out.println(Arrays.toString(words));
	}
	void main()
	{
		reverse("the sky is blue");
	}

}
