package com.LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Reorder_List {
	void reorder(List<Integer> arr)
	{
		int s=1;
		int e=arr.size()-1;
		while(s<e)
		{
			int start=arr.get(s);
			arr.set(s,arr.get(e) );
			arr.set(e,start);
			s=s+2;
			e--;
		}
		System.out.println(arr);
	}
	void main()
	{
		List<Integer> arr=new ArrayList<>();
		for(int i=1;i<=6;i++)
		{
			arr.add(i);
		}
		System.out.println(arr);
		reorder(arr);
	}

}
