package com.sorting.quicksort;

import java.util.Arrays;

public class Hoare {
	void quicksort(int[] arr,int low,int high)
	{
		if(low<high) {
			int pivoteIndex=partition(arr,low,high);
			System.out.println(pivoteIndex);
			System.out.println(Arrays.toString(arr));
			quicksort(arr,low,pivoteIndex-1);
			quicksort(arr,pivoteIndex+1,high);
			
		}
	}
	int partition(int[] arr,int low,int high)
	{
		int pivote=arr[low];
		int s=low;
		int e=high;
		while(s<e)
		{
			while(s<=high && arr[s]<=pivote)
			{
				s++;
			}
			while(arr[e]>pivote)//ikkada e>=0 avasaram ledhu bcz pivote is at 0 index and when e =0 then arr[e]>pivote is never true
			{
				e--;
			}
			if(s<e) {
				swap(arr,s,e);
			}
		}
		swap(arr,low,e);
		return e;
	}
	private void swap(int[] arr, int s, int e) {
		int temp=arr[s];
		arr[s]=arr[e];
		arr[e]=temp;
		
	}
	void main()
	{
		int[] arr= {12,4,21,12,30,25,12,17,5,8};
		quicksort(arr,0,arr.length-1);
		System.out.println("*********************");
		System.out.println(Arrays.toString(arr));
	}

}
