package com.Arrays;

import java.util.ArrayList;

public class MoveAllZerostoEnd {
	static void optimised(int[] a)
	{
		ArrayList<Integer> arr = new ArrayList<Integer>();
		int n=a.length;
		//System.out.println(n);
		for (int x : a) {
			if(x!=0)
			{
				arr.add(x);
			}
		}
		int j=(n-arr.size());
		for(int i=0;i<j;i++)
		{
			arr.add(0);
		}
		System.out.println(arr);
		
	}
	void all0sToEnd(int[] arr)
	{
		int e=arr.length-1;
		while(arr[e]==0)
		{
			e--;
		}
		int i=0;
		while(i<e)
		{
			if(arr[i]==0)
			{
				arr[i]=arr[i]^arr[e];
				arr[e]=arr[i]^arr[e];
				arr[i]=arr[i]^arr[e];
				e--;
			}
			i++;
		}
	}
	public static void main(String[] args) {
		int[] a = { 1, 0,3,0,4,0,5,6,0,2,0,5,0,4};
		for(int x:a)
		{
			System.out.print(x+" ");
		}
		System.out.println();
		optimised(a);
		
		
		
//		int count=0;
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		for (int x : a) {
//			arr.add(x);
//		}
//		System.out.println(arr);
//	
//		for(int i=0;i<arr.size();i++)
//		{
//			if(arr.get(i)==0)
//			{
//				arr.remove(i);
//				count++;
//			}
//		}
//		for(int i=0;i<count;i++)
//		{
//			arr.add(0);
//		}
//		System.out.println(arr);
	}

}
