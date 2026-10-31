package com.sliding_window;
import java.util.*;
/*input:
        string: "abccdabcdaabc"
        winowsize:3
output:
	   abc

here abc reapted 3 times which is greater than all substring of length 3
*/
public class MaxFreqSubStrOfKLength {
	private void findMax(String str, int k) {
		Map<String,Integer> map=new HashMap<>();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<k;i++)
		{
			sb.append(str.charAt(i));
		}
		map.put(sb.toString(), 1);
		for(int i=k;i<str.length();i++)
		{
			sb.replace(0, 1, "");//sb.deleteCharAt(0);
			sb.append(str.charAt(i));
			map.put(sb.toString(), map.getOrDefault(sb.toString(), 0)+1);
		}
		
		int max=0;
		String s="";
		for(String s1:map.keySet())
		{
			if(max<map.get(s1))
			{
				s=s1;
				max=map.get(s1);
			}
		}
		System.out.println(s);
	}
	void main()
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int window=sc.nextInt();
		findMax2(str,window);
	}
	
	private void findMax2(String str, int k) {
		Map<String, Integer> map = new HashMap<>();

	    // Single loop extracting direct windows using indices
	    for (int i = 0; i <= str.length() - k; i++) {
	        // Extracts the substring from index i to i + k (exclusive)
	        String currentWindow = str.substring(i, i + k);
	        
	        // Track frequency
	        map.put(currentWindow, map.getOrDefault(currentWindow, 0) + 1);
	    }

	    // Find the substring with the maximum frequency
	    String maxFreqStr = "";
	    int maxCount = 0;

	    for (String s1 : map.keySet()) {
	        if (map.get(s1) > maxCount) {
	            maxCount = map.get(s1);
	            maxFreqStr = s1;
	        }
	    }

	    System.out.println("Output: " + maxFreqStr); // Output: abc
	}
	
}
