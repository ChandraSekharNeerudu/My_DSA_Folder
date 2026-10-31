package com.sorting.heapsort;

import java.util.Arrays;

public class Find_kth_ele {
	static void minHeapify(int[] arr,int n,int i)
	{
		int min=i;
		//left child
		int l=2*i+1;
		//right child
		int r=2*i+2;
		
		if(l<=n && arr[l]<arr[min])
		{
			min=l;
		}
		if(r<=n && arr[r]<arr[min])
		{
			min=r;
		}
		
		if(min!=i)
		{
			swap(arr,min,i);
			minHeapify(arr,n,min);
		}
	}
	static  void swap(int[] arr, int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}
	public static void main(String[] args) {
		int[] arr= {3, 2, 1, 5, 6, 4};
		int k=2;
		int n=arr.length-1;
		for(int i=k-1;i>0;i--)
		{
			minHeapify(arr,n,i);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("your kth element is :"+arr[k-1]);
	}

}
