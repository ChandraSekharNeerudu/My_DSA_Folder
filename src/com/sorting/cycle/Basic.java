package com.sorting.cycle;

import java.util.Arrays;

public class Basic {
	static void cycle(int[] arr) {
		int i = 0;
		while (i < arr.length) {
			int a = arr[i];
			if (i != a - 1) // checking if index i not equals to index of the value stored in that ith index
							// i.e value-1
			{
				int temp = arr[i];
				arr[i] = arr[a - 1];
				arr[a - 1] = temp;
			}
			else i++;
		}
	}
                                             //OWN IMPMLEMENTATION
	public static void sort1(int[] arr)//1 to n
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			while(arr[i]-1!= i)
			{
				swap(arr,i,arr[i]-1);//most important part
			}
		}
	}
	public static void sort2(int[] arr)//0 to n
	{
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			while(arr[i]!= i)
			{
				swap(arr,i,arr[i]);//most important part
			}
		}
	}
	private static void swap(int[] arr, int max, int i) {
		int temp=arr[max];
		arr[max]=arr[i];
		arr[i]=temp;
		
	}
	public static void main(String[] args) {
		int[] arr= {5,3,1,4,2};
		cycle(arr);
		System.out.println(Arrays.toString(arr));
		int[] arr1= {2,1,5,4,0,6,3};
		sort2(arr1);
		System.out.println(Arrays.toString(arr1));
	}
}
