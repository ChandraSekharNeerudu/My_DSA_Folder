package com.PrefixSum;

import java.util.HashMap;
import java.util.Map;

public class Count_SubArray_Withequal_0s_1s {
	void main() {
		int[] arr= {1,0,0,1,0,1,1};
		bruteforce(arr);
		int count=0;
		int cs=0;
		Map<Integer,Integer> map=new HashMap<>();
		map.put(0, 1);
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0) arr[i]=-1;
			
			cs+=arr[i];			
			
			if(map.containsKey(cs)) count+=map.get(cs);
			
			map.put(cs, map.getOrDefault(cs,0)+1);
		}
		System.out.println(count);
		
	}
	
	
	static void bruteforce(int[] arr) {
		int countof0s=0;
		int countof1s=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				if(arr[j]==0) countof0s++;
				else countof1s++;
				
				if(countof0s==countof1s) count++;
			}
			countof0s=countof1s=0;
		}
		System.out.println("bruteforce :"+count);
	}
	 
}
