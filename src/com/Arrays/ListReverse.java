package com.Arrays;

import java.util.ArrayList;

public class ListReverse {                       //   TWO POINTER   //
	static void rev(ArrayList<Integer> arr)
	{
		int i=0;
		int j=arr.size()-1;
		while(i<=j)
		{
			    int temp=arr.get(i);
				arr.set(i,arr.get(j));
				arr.set(j,temp);
				i++;
				j--;
				
		}
		System.out.println(arr);
	}
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		//arr.add(6);
		rev(arr);
	}

}
