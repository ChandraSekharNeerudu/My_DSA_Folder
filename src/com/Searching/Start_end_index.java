package com.Searching;

import java.util.ArrayList;

public class Start_end_index {
	static ArrayList<Integer> index1(int[] arr,int target)
	{
		ArrayList<Integer> result=new ArrayList<Integer>();
		result.add(0);
		result.add(0);
		int a=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				result.set(a, i);
				a=1;
				continue;
			}
		}
//		if(result.size()==1)
//		{
//			result.add(1, result.get(a));
//		}
//		else 
//		{
//			result.add(0,-1);
//			result.add(1,-1);
//		}
		return result;
	}
	
	//using binary searh //

	static int[] index2(int[] arr,int target)
	{
		int[] result=new int[2];
		int low=0;
		int high=arr.length-1;
		int a=0;
		while(low<=high&&a<=2)
		{
			int mid=low+(high-low)/2;   //{2,3,4,5,8,8}
			if(target==arr[mid])
			{
				result[a]=mid;
				a++;
				low=mid+1;
			}
			else if(target<arr[mid])
			{
				high=mid-1;
			}
			else
			{
				low=mid+1;
			}
			
		}
		if(a==1)
		{
			result[1]=result[0];
		}
		else if(a
				==0)
		{
			result[0]=-1;
			result[1]=-1;
		}
		return result;
		
	}
	public static void main(String[] args) {
		int[] arr= {8,2,3,4,8,8,8,8};
		int target=8;
		ArrayList<Integer> result=index1(arr,target);
		System.out.println(result);
	}

}
