package com.sorting.bubble;

import java.util.Arrays;

                                      // ASCENDINORDER //
public class BasicAlg {
	static void sort(int[] arr) {
		int n = arr.length;
		boolean swapcount =false;
		for (int i = 0; i < n - 1; i++) {
		      swapcount = false;
//			boolean b = swap(arr, i);
//			if (b == false) {
//				break;
//			}
			for (int j = 1; j < n - i; j++) {
				
				int max = j-1;
				if (arr[j] < arr[max]) {   // if 1st element is greater then swap
					int temp = arr[max];
					arr[max] = arr[j];
					arr[j] = temp;
					swapcount=true; // flag bit that tells whether array is sorted or not
				}
			}
			if(swapcount==false)
			{
				break;
			}
		}
	}

	                        // DESCENDING ORDER //
	static boolean swap(int[] arr, int i) {
		boolean swapcount = false;
		int n = arr.length;
		for (int j = 1; j < n - i; j++) {
			int previous = j-1;
			if (arr[j] > arr[previous]) {   // if 2nd element is greater then swap
				int temp = arr[previous];
				arr[previous] = arr[j];
				arr[j] = temp;
				swapcount=true;
			}
		}
		if (swapcount ) {
			return true;// there is swap
		} else {
			return false;// there is no swap i.e array is sorted
		}
	}
	
	public static void main(String[] args) {
		int[] arr= {1,3,6,2,4};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}

}
