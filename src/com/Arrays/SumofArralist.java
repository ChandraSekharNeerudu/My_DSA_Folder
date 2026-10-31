package com.Arrays;

import java.util.ArrayList;

public class SumofArralist {
	static int sum(ArrayList<Integer> arr)
	{
		int sum=0;
		for(int x:arr)
		{
		  sum+=x;	
		}
		return sum; 
	}
	public static void main(String[] args) {
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(2);
		a.add(3);
		a.add(4);
		System.out.println(a);
		System.out.println(sum(a));
	}

}
