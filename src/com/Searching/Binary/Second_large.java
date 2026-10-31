package com.Searching.Binary;

import java.util.Arrays;

public class Second_large {
	//using single pass 
		
	//using linear search is efficiant
	public static void main(String[] args) {
		int[] arr = { -1, 5,-3,3 };
		int max = arr[0];
		int secondmax = arr[1];
		for (int a : arr) {
			if (a > max) {
				secondmax = max;
				max = a;
			} else if (a > secondmax && a != max) {
				secondmax = a;
			}
		}
		System.out.println(secondmax);
		//usingindex(arr);

	}

}
