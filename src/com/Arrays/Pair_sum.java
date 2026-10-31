package com.Arrays;

import java.util.HashSet;

public class Pair_sum {
	                              //USING TWO POINTER FOR SORTED ARRAY 
	                                   //O(n) for sorted O(nlogn) for unsorted array O(1) space 
	static int[] Twoele(int[] arr, int t) {

		int[] result=new int[2];

		int s = 0;

		int e = arr.length - 1;

		while (s < e) {

		int sum = arr[s] + arr[e];

		if (sum < t) {

		s++;

		} else if (sum > t) {

		e--;

		} else {

		result[0]=s;

		result[1]=e;

		return result;

		}

		}

		return result;

		}
	
	
	                                        //USING TWO POINTER FOR SORTED ARRAY 
	                                            //O(n) for unsorted array O(n) space 
	
	static boolean usingHashset(int[] arr,int target)
	{
		HashSet hs=new HashSet();
		int compliment=0;
		for(int i=0;i<arr.length;i++)
		{
			compliment=target-arr[i];
			if(hs.contains(compliment))
			{
				return true;
			}
			hs.add(arr[i]);
		}
		return false;
	}
}
