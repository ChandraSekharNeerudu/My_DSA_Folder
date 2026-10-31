package com.PrefixSum;

import java.util.Arrays;

public class Basic {
	void basic(int[] arr)
	{
		for(int i=1;i<arr.length;i++)
		{
			arr[i]+=arr[i-1];
		}
	}
	void main()
	{
		int[] arr= {10, 20, 10, 5, 15};//{2,5,6,8,4};
		basic(arr);
		System.out.println(Arrays.toString(arr));
	}

}
