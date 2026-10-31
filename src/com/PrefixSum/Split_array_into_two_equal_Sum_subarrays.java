package com.PrefixSum;

import java.util.Arrays;

public class Split_array_into_two_equal_Sum_subarrays {
	int splitpoint(int[] arr)
	{
		int prefix=0,sufix=0,total=0;
		
		for(int x:arr)
		{
			total+=x;
		}
		prefix=arr[0];//for 1 index prefix is 0 index
		for(int i=1;i<arr.length;i++)
		{
			sufix=total-prefix;//first time index 1 to last  varaku suffix so,adhi total nundi arr[0] - chesthe vasthadhi
			if(prefix==sufix)
			{
				return i;
			}
			prefix+=arr[i];
		}
		return -1;
	}
	void main()
	{
		int[] arr= {4, 3, 2, 1};//{4, 1, 2, 3 };//{1 , 2 , 3 , 4 , 5 , 5};
		int splint_point=splitpoint(arr);
		if(splint_point==-1)
		{
			System.out.println("Not Applicable");
			return;
		}
		System.out.print("[ ");
		for(int i=0;i<splint_point;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		System.out.print("[ ");
		for(int i=splint_point;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.print("]");
	}

}
