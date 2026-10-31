package com.sorting.TwoPointers;

import java.util.Arrays;
import java.util.HashSet;

public class Pair_Sum_in_Sorted_and_Rotated_Array {
	//USING HASHSET (OPTIMIZED)
	static boolean usingHashset(int[] arr,int target)
	{
		HashSet hs=new HashSet();
		int compliment=0;
		for(int i=0;i<arr.length;i++)
		{
			compliment=target-arr[i];
			if(hs.contains(compliment))
			{
				return true;
			}
			hs.add(arr[i]);
		}
		return false;
	}
	static void unrotate_array(int[] arr)//sorting
	{
		int i=1;
		while(i<arr.length && arr[i]>arr[i-1])//finding no of elements rotated
		{
			i++;
		}
		int n=i-1;//no of elments rotated
		//unrotating an array
		for(int j=0;j<=n;j++)
		{
			int temp=arr[0];
			for(int k=1;k<arr.length;k++)
			{
				arr[k-1]=arr[k];
			}
			arr[arr.length-1]=temp;
		}
	}
	// finding pair sum using binary search technique
	static boolean pairsum(int[] arr,int low,int high,int target)
	{
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(arr[mid]==target)
			{
				return true;
			}
			else if(arr[mid]>target)
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {11, 15, 6, 8, 9, 10};
		int target=19;
		unrotate_array(arr);
		System.out.println(Arrays.toString(arr));
		
		int compliment=0;
		boolean status=false;
		for(int i=0;i<arr.length;i++)
		{
			compliment=target-arr[i];
			status=pairsum(arr,i+1,arr.length-1,compliment);
			if(status)
			{
				break;
			}
		}
		System.out.println(status);
		
		System.out.println();
		int[] arr2= {1,2,4,5,6};
		int t=8;
		 System.out.println(pairsum(arr2,0,4,t));  // to prove binary search is wrong
		 
		}

}
