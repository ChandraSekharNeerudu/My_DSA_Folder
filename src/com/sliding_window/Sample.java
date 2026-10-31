package com.sliding_window;

import java.util.Arrays;

public class Sample {
	void basic(int[] arr)
	{
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			sum+=arr[i];
			arr[i]+=arr[i-1];
		}
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i-1]==sum-arr[i])
			{
				System.out.println("equilibrium is :"+i);
			}
		}
		System.out.println(Arrays.toString(arr));
	}

	void main() {
		int[] arr = {-7, 1, 5, 2, -4, 3, 0};
//		for(int i=1;i<arr.length;i++)
//		{
//			arr[i]+=arr[i-1];
//		}
//		System.out.println(Arrays.toString(arr));
		
		basic(arr);
	}

}
