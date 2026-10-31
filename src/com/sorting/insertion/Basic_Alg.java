package com.sorting.insertion;

import java.util.Arrays;

public class Basic_Alg {
	static void sort(int[] arr)
	{
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			for(int j=i;j>0;j--)
			{
				if(arr[j-1]>arr[j])
				{
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else
				{
					break;
				}
			}
		}
	}
public static void main(String[] args) {
	int[] arr= {2,4,1,5,3};
	sort(arr);
	System.out.println(Arrays.toString(arr));
}
}
