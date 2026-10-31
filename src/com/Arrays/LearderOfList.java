package com.Arrays;

import java.util.ArrayList;

public class LearderOfList {
	void leadersOfArray(int[] arr)                 //O(n)
	{
		System.out.print(arr[arr.length-1]+" ");
		int maxofright=arr[arr.length-1];
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]>maxofright)
			{
				System.out.print(arr[i]+" ");
				maxofright=arr[i];
			}
		}
		
	}
	static void Leaders(ArrayList<Integer> arr)    //O(n)
	{
		if(arr.isEmpty())
		{
			System.out.println(arr);
		}
		else {
		ArrayList<Integer> arr1 =new ArrayList<Integer>();
		int big=arr.get(arr.size()-1);
		arr1.add(big);
		for(int i=arr.size()-2;i>=0;i--)
		{
			if(arr.get(i)>big)
			{
				arr1.add(0,arr.get(i));
				big=arr.get(i);
			}
		}
		System.out.println(arr1);
		}
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(10);
		arr.add(1);
		arr.add(2);
		arr.add(3);
//		arr.add(1);
		//arr.add(2);
		Leaders(arr);
	}

}
