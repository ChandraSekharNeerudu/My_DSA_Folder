package com.sorting.TwoPointers;

import java.util.Arrays;

public class Closest_pair_sum {
	static int[] Twoele(int[] arr, int target) {
		int[] close=new int[2];
		
		if(arr==null||arr.length<2)
		{
		     System.err.println("enter a valid array of siz > 2");
		     return close;
		}
		
		Arrays.sort(arr);//O(nlogn)
		int s=0, e=arr.length-1;
		int mindiff=Integer.MAX_VALUE;
		while(s<e)
		{
			int sum=arr[s]+arr[e];
			int curdiff=Math.abs(target-sum);
//			//if target found
//			if(sum==target)
//			{
//				close[0]=Math.min(arr[s],arr[e]);
//				close[1]=Math.max(arr[s],arr[e]);
//			}
			
			if(curdiff<mindiff)
			{
				mindiff=curdiff;
				close[0]=arr[s];
				close[1]=arr[e];
			}
			
			if(sum==target)
			{
				return close;
			}
			else if(sum<target)
			{
				s++;
			}
			else
			{
				e--;
			}
		}
		return close;
	}

	public static void main(String[] args) {
		int[] arr= {5, 2, 7, 1, 4};
		int[] closest=Twoele(arr,10);
		System.out.println(Arrays.toString(closest));
	}
}
