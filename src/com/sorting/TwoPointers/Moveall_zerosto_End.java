package com.sorting.TwoPointers;
//gfg
import java.util.Arrays;

public class Moveall_zerosto_End {
	// LEFT PROPORTION	
	static void twoPointer(int[] arr)
	{
		int left=0;//specifies index after all non zero elments
		for(int right=0;right<arr.length;right++)
		{
			if(arr[right]!=0)
			{
				swap(arr,left,right);
				left++;
			}
		}
	}
	private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
	public static void main(String[] args) {
		int[] arr= {2,0,5,0,3,8,0,6};
		System.out.println(Arrays.toString(arr));
		twoPointer(arr);
		System.out.println(Arrays.toString(arr));
	}
	// SEARCH AND SWAP
	public void Zeros_to_end(int[] arr)
	{
		int s=0,e=arr.length-1;
		while(s<e)
		{
			while(s<e && arr[s]!=0)
			{
				s++;
			}
			while(e>=0 && arr[e]==0)
			{
				e--;
			}
			if(s<=e)
			{
				swap(arr,s,e);
				e--;
				s++;
			}
			
		}

	}
}
