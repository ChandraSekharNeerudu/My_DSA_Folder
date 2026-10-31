package com.sorting.mergrsort;

import java.util.Arrays;

public class Merging_two_sortedarrays {
	static int[] merge(int[] arr1,int[] arr2)
	{
		int i=0,j=0,k=0;
		int[] merged=new int[arr1.length+arr2.length];
		while(i<arr1.length && j<arr2.length)
		{
			if(arr1[i]<=arr2[j])
			{
				merged[k]=arr1[i];
				i++;
			}
			else
			{
				merged[k]=arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<arr1.length)
		{
			merged[k]=arr1[i];
			i++;
			k++;
		}
		
		while(j<arr2.length)
		{
			merged[k]=arr1[j];
			j++;
			k++;
		}
		
		return merged;
	}

	public static void main(String[] args) {
		int[] arr1= {10, 30, 50};
		int[] arr2= {20, 40};
		int[] merged=merge(arr1,arr2);
		System.out.println(Arrays.toString(merged));
	}
}
