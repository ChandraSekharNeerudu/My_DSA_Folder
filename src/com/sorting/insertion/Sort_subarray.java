package com.sorting.insertion;

import java.util.Arrays;

public class Sort_subarray {
	static void sort(int[] arr,int first,int last)
	{
		int n=last-first;                       // for ascending order
		for(int i=1;i<=n;i++)
		{
			for(int j=first+i;j>first;j--)
			{
				int max=j;
				if(arr[j-1]>arr[max])
				{
					int temp=arr[j-1];
					arr[j-1]=arr[max];
					arr[max]=temp;
				}
				else {
					break;
				}
			}
				
		}
	}
	public static void main(String[] args) {
		int[] arr= {10, 2, 5, 1, 8};
		sort(arr,1,3);
		System.out.println(Arrays.toString(arr));
	}

}
