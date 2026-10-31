package com.sorting.selection;

import java.util.Arrays;

public class Sort_SubArray {
 static void SortSub(int[] arr,int start,int end)
 {
	 int n=end-start;
	for(int i=0;i<n;i++)
	{
		
		int maxindex=getmax(arr,start,end);
		swap(arr,maxindex,end);
		end=end-1;
				
	}
 }
 static int getmax(int[] arr,int start,int end)
 {
	 int max=start;
	 for(int i=start;i<=end;i++)
	 {
		 if(arr[i]>arr[max])
		 {
			 max=i;
		 }
	 }
	 return max;
 }
 static void swap(int[] arr,int max,int last)
 {
	 int temp=arr[max];
	 arr[max]=arr[last];
	 arr[last]=temp;
 }
	
	 void main() {
		int[] arr= {3,6,4,2,6,3};
		SortSub(arr,0,2);
		System.out.println(Arrays.toString(arr));
		
		
	}
}
