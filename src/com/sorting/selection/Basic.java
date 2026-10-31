package com.sorting.selection;

import java.util.Arrays;

public class Basic {
	static void Selectsort(int[] arr)       //    Ascending order    //
	{
		for(int i=arr.length-1;i>0;i--)  // for n(length)-1 swaps
		{
			
			int max=maxIndex(arr,0,i);
			swap(arr,i,max);
			
		}
		
	}
	static int maxIndex(int[] arr,int first,int last)
	{
		int max=first;
		for(int i=first+1;i<=last;i++)
		{
			if(arr[i]>arr[max])
			{
				max=i;
			}
		}
		return max;
	}
	static  void swap(int[] arr,int last,int max)
	{
		int temp=arr[max];
		arr[max]=arr[last];
		arr[last]=temp;
		
	}
	
	public static void main(String[] args) {
		int[] arr= {5,5,5,4,3,3};
		Selectsort(arr);
		for(int x:arr)
		{
			System.out.println(x);
		}
		System.out.println(Arrays.toString(arr));
	}

}
