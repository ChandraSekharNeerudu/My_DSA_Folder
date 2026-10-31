package com.sorting.selection;

public class Stable_selection_sort {
	static void selectsort(String[] arr)
	{
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int last=n-i-1;
			int maxind=getmax(arr,last);
		}
	}
	static int getmax(String[] arr,int end)
	{
		for(int i=0;i<=end;i++)
		{
			int max=0;
			if(Integer.parseInt(arr[i])>Integer.parseInt(arr[max]))
			{
				max=i;  
			}
		}
		return 0;
	}
	   void main() {
		String[] a= {"2","3","6","9","8","10b"};
		System.out.println(a[0]>a[1]);
	}
}
