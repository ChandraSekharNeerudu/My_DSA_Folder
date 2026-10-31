package com.Searching.Binary;

import java.util.ArrayList;
import java.util.Arrays;

public class K_large_ele {
	static ArrayList<Integer> arr1 = new ArrayList<Integer>();

	public static ArrayList<Integer> kLargest(int[] arr, int k) {
		if(k>arr.length)
		{
		  return arr1;
		}
		
		for (int i = 0; i < k; i++) {
			int maxind=0, max = arr[0];
			for (int j = 1; j < arr.length; j++) {
				if (arr[j] > max) {
					max = arr[j];
					maxind=j;
				}
			}
			arr[maxind]=0;
			arr1.add(max);
		}
		return arr1;
	}
	
	
	public static void main(String[] args) {
		int[] arr= {5,6,8,3,1};
		int k=3;
		System.out.println(kLargest(arr,k));
		
		
	}

}
