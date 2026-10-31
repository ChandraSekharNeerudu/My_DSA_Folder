package com.sorting.quicksort;

import java.util.Arrays;

public class Hybrid_with_selection {
	final static int  threeshold=8;
	static void sort(int[] arr)
	{
		if(arr==null||arr.length==0)
		{
			return;
		}
		if(arr.length<=threeshold)
		{
			insertion(arr);
		}
		else
		{
			Hoare(arr,0,arr.length-1);
		}
	}
	// INSERTION SORT //
	static void insertion(int[] arr)
	{
		int arrlength=arr.length-1;
		for(int i=0;i<arrlength-1;i++)
		{
			int maxind=0;
			for(int j=1;j<=(arrlength-i);j++)
			{
				if(arr[j]>arr[maxind])
				{
					maxind=j;
				}
			}
			swap(arr,maxind,(arrlength-i));
		}
	}
	// QUICK SORT //
	static void Hoare(int[] arr,int low,int high)
	{
		if(low>=high)
		{
			return ;
		}
		int p=partiotion(arr,low,high);
		Hoare(arr,low,p-1);
		Hoare(arr,p+1,high);
	}

	static int partiotion(int[] arr, int low, int high) {
		int m=low+(high-low)/2;
		int pivot=arr[m];
		int s=low;
		int e=high;
		while(s<e)
		{
			while(arr[s]<pivot)
			{
				s++;
			}
			while(arr[e]>pivot)
			{
				e--;
			}
			if(s<e)
			{
				swap(arr,s,e);
			}
		}
		return e;
	}
	// --- 3. Helper and Main Methods ---
    private static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    public static void main(String[] args) {
//    	int[] arr1 = {6, 1, 9, 2, 8, 3, 7, 4, 10, 5, 12, 11};
//    	sort(arr1);
//    	System.out.println(Arrays.toString(arr1));
    	int[] arr2= {5,4,9,1,8,5};
    	sort(arr2);
    	System.out.println(Arrays.toString(arr2));
	}

}
