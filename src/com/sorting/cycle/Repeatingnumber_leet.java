package com.sorting.cycle;
    // from leet Qno : 287
//Given an array of integers nums containing n + 1 integers
//where each integer is in the range [1, n] inclusive.

//There is only one repeated number in nums, return this repeated number.
//You must solve the problem without modifying the array nums.
public class Repeatingnumber_leet {
	static int cyclesort(int[] arr)
	{
		int n=arr.length;
		int i=0;
		while(i<n)
		{
			if (arr[i] != i + 1) {
				int correctindex = arr[i] - 1;// Bcz array had elements from 1 - n
				if (arr[i] != arr[correctindex]) {
					swap(arr, i, correctindex);
				} else {
					return arr[i];
				}
			}
		    else {
		    	i++;
		     }
		}
		return 0;
	}
	
	
	static void swap(int[] arr,int i,int correct)
	{
	  int temp=arr[i];
	  arr[i]=arr[correct];
	  arr[correct]=temp;
	}
	
	public static void main(String[] args) {
		int[] arr= {1,3,4,2,2,};
		System.out.println(cyclesort(arr));
	}
	

}
