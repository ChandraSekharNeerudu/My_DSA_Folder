
package com.sorting.quicksort;

import java.util.Arrays;
          // IT SAME LIKE HOAREQUICKSORT  BUT IT CAN DEAL WITH DUPLICATE ARRAY//
public class Quick_Sort_kunal {
	static void sort(int[] arr,int findex,int lindex)
	{
		if(findex>=lindex)
		{
			return;
		}
		int s=findex;
		int e=lindex;
		int m=s+(e-s)/2;
		int pivot=arr[m];
		while(s<=e)
		{
			while(arr[s]<pivot)
			{
				s++;
			}
			while(arr[e]>pivot)
			{
				e--;
			}
			if(s<=e) { 
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;              // *** this increment and decrment and <= are key to handle 
			e--;                 // duplicate array 
			}
		}
		sort(arr,findex,e);//here e anedhi pivote ki mundu vuntadhi so 0 to before pivote(e) 1 array
		sort(arr,s,lindex);//here s is after pivote so,s to e (last ele varaku 2 array
	}
	
	public static void main(String[] args) {
		int[] arr={2,5,4,169,567,87,12,234,456,543,823,23,5689};// {9,2,7,2,3,6};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
}
