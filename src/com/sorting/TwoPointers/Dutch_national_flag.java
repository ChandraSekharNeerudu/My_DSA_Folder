package com.sorting.TwoPointers;

import java.util.Arrays;

//sort all 0s,1s,2s proposed by dijkstra
public class Dutch_national_flag {
	static void sort(int[] arr)
	{
		int s=0,m=0,e=arr.length-1;
		while(m<=e)
		{
			if(arr[m]==0)
			{
				swap(arr,s,m);
				s++;
				m++;//for avoiding loop
			}
			else if(arr[m]==2)
			{
				swap(arr,m,e);
				e--;
			}
			else
			{
				m++;
			}
		}
	}
	static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
	public static void main(String[] args) {
		int[] arr= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		sort(arr);
		System.out.println(Arrays.toString(arr));
		
	}

}
