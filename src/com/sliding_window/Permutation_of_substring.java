package com.sliding_window;

import java.util.*;

public class Permutation_of_substring {
	static boolean permutation(String txt,String pat)//sliding window
	{
		int[] txtfreq=new int[256];
		int[] patfreq=new int[256];
		//first window
		for(int i=0;i<pat.length();i++)
		{
			txtfreq[txt.charAt(i)]++;
			patfreq[pat.charAt(i)]++;
		}
		if(Arrays.equals(txtfreq, patfreq))
		{
			return true;
		}
		
		//slide the window
		int k=pat.length();
		for(int i=k;i<txt.length();i++)
		{
			txtfreq[txt.charAt(i)]++;
			txtfreq[txt.charAt(i-k)]--;
			if(Arrays.equals(txtfreq, patfreq))
			{
				return true;
			}
		}
		return false;
	}
	static boolean subString(String txt,String pat)//not sliding window
	{
		int n=pat.length();
		Set<Character> set=new HashSet<>();
		for(int i=0;i<pat.length();i++)
		{
			set.add(pat.charAt(i));
		}
		
		for(int i=0;i<=txt.length()-pat.length();i++)
		{
			int count=0;
			for(int j=i;j<i+pat.length();j++)//this gives substring of length=pat.length()
			{
				char c=txt.charAt(j);
				if(set.contains(c))
				{
					count++;
				}
			}
			if(count==pat.length())
			{
				return true;
			}
		}
		return false;
	}
	
	                                                    // sliding window for small letters
	static final int MAX_CHAR = 26;
	 // check if all characters have 0 frequency
    static boolean check(int[] freq) {
        for (int i = 0; i < MAX_CHAR; i++) {
            if (freq[i] != 0)
                return false;
        }
        return true;
    }
    static boolean search(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();

        // construct the first window
        int[] freq = new int[MAX_CHAR];
        Arrays.fill(freq, 0);
        for (int i = 0; i < m; i++) {
            freq[txt.charAt(i) - 'a'] += 1;
            freq[pat.charAt(i) - 'a'] -= 1;//for okavela txt e charecter vunte +1 avuthundhiga dhanini - chesi 0 cheyataniki
        }

        // Check for first window
        if (check(freq))
            return true;

        for (int i = m; i < n; i++) {

            // Add the ith character into the window
            freq[txt.charAt(i) - 'a'] += 1;

            // Remove the (i - m)th character from the window

            freq[txt.charAt(i - m) - 'a'] -= 1;

            // Check for the current window
            if (check(freq))
                return true;
        }

        return false;
    }
	public static void main(String[] args) {
		String txt="geeks";
		String pat="eke";
		System.out.println(subString(txt,pat));
	}

}
