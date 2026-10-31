package com.Arrays;

import java.util.Arrays;

public class Sample {
	void cycle(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			while(arr[i]!=i)
			{
				swap(arr,i,arr[i]);
			}
		}
	}
	static  void swap(int[] arr,int last,int max)
	{
		int temp=arr[max];
		arr[max]=arr[last];
		arr[last]=temp;
		
	}
	void main() {
		int[] arr= {1,5,3,2,4,6,0};
		cycle(arr);
		System.out.println(Arrays.toString(arr));
	}

}
