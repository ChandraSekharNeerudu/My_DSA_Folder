package com.sorting.TwoPointers;

import java.util.Arrays;

//gfg
public class Remove_duplictesof_Array {
	static int removeDuplicates(int[] arr)
	{
		int s=0;//for point last unique element of an array
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]!=arr[s])
			{
				s++;
				arr[s]=arr[i];
			}
		}
		System.out.println(s);
		return s+1;
	}
	public static void main(String[] args) {
		int[] arr= {2,2,2,3,3,4,5,6,6,8,9,9};
		System.out.println("number of unique elements :"+removeDuplicates(arr));
		System.out.println(Arrays.toString(arr));
		
		
		
	}
}
