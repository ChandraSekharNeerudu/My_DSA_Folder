package com.sliding_window;

import java.util.*;

public class Count_unique_strings {
	void count1(String s, int k)// not sliding window O(n*m)
	{
		int count = 0;
		for (int i = 0; i <= s.length() - k; i++) {
			HashSet<Character> hs = new HashSet<>();
			for (int j = i; j < i + k; j++) {
				hs.add(s.charAt(j));
			}
			if (hs.size() == k) {
				count++;
			}
		}
		System.out.println(count);
	}
	                                   //sliding window
	boolean isUnique(int[] freq)//O(n*25)
	{
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]>1)//2or3 vasthe a char multiple times vachinatuu so unique string avvadhu
			{
				return false;
			}
		}
		return true;
	}
	void count2(String s,int k)  
	{
		int[] freq=new int[26];
		int count=0;
		for(int i=0;i<k;i++)
		{
			freq[s.charAt(i)-'a']++;
		}
		if(isUnique(freq))
		{
			count++;
		}
		for(int i=k;i<s.length();i++)
		{
			freq[s.charAt(i)-'a']++;
			freq[s.charAt(i-k)-'a']--;
			if(isUnique(freq))
			{
				count++;
			}
		}
		System.out.println(count);
	}
	
	
	
	void countOptimal(String s, int k) {          //O(n)
	    if (k > s.length()) return;
	   
	    int count = 0;
	    int[] freq = new int[256]; // Assuming ASCII
	    int uniquecharcount = 0;

	    // Initialize first window
	    for (int i = 0; i < k; i++) {
	        if (freq[s.charAt(i)] == 0)
	        	          uniquecharcount++; //char first time a  vasthe ++
	        freq[s.charAt(i)]++;
	    }
	    if (uniquecharcount == k)//2 vyntadhi first 
	    	{
	    	count++;
	    	}

	    // Slide the window
	    for (int i = k; i < s.length(); i++) {
	        // Add new character
	        char next = s.charAt(i);
	        if (freq[next] == 0) 
	        	{
	        	uniquecharcount++;//3 avuthadhi
	        	}

	        freq[next]++;

	        // Remove old character
	        char prev = s.charAt(i - k);
	     
	        if (freq[prev] == 1){//here freq of a is 2
	        	//== 1 ayithe adhi kevalam okkasare vachindhi annatlu so dhanini remove chesthunnam kabatti dhanivalana uniquecharcount 1 perigivuntadhi andhukani window size thaggiyyali lekapothey last add chesina 
                // char valla window size >3 avuthadhi so,even though adhi unique window ayina manali count++ avadhu
	        	    uniquecharcount--;
	        }
	
	        freq[prev]--;
	        
	        if (uniquecharcount == k) 
	        	{
	        	count++;
	        	}
	    }
	    System.out.println(count);
	}

	void main(String[] args) {
		String s = "aababcac";//"abac";//"aBacd";
		countOptimal(s, 3);
	}

}
