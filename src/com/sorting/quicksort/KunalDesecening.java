package com.sorting.quicksort;

import java.util.Arrays;

public class KunalDesecening {
	static void sort(int[] arr,int low,int high)
	{
		if(low<high)
		{
			 int mid=low+(high-low)/2;
				int pivote=arr[mid];
				int s=low;
				int e=high;
				while(s<=e)
				{
					while(arr[s]>pivote)
					{
						s++;
					}
					while(arr[e]<pivote)
					{
						e--;
					}
					if(s<=e)
					{
						swap(arr,s,e);
						s++;
				        e--;
					}
				}
			sort(arr,low,e);
			sort(arr,s,high);
		}
		
	}
	// --- 3. Helper and Main Methods ---
	    private static void swap(int[] arr, int s, int e) {
	        int temp = arr[s];
	        arr[s] = arr[e];
	        arr[e] = temp;
	    }

	    public static void main(String[] args) {
	    	int[] arr= {9,2,7,7,2,3,6};
			sort(arr,0,6);
			System.out.println(Arrays.toString(arr));
		}
}
