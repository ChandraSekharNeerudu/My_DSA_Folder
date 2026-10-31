package com.sorting.quicksort;

import java.util.Arrays;

public class FinalApproach {
	public static void main(String[] args) {
		int[] arr= {2,1,5,3,6,4};
		quicksort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	private static void quicksort(int[] arr, int low, int high) {
		if(low<high) {
			int pind=partition(arr,low,high);
			quicksort(arr,low,pind-1);
			quicksort(arr,pind+1,high);
		}
		
	}

	private static int partition(int[] arr, int low, int high) {
		int pivote=arr[low];
		int s=low;
		int e=high;
		while(s<e) {
			while(s<=high && arr[s]<=pivote) {
				s++;
			}
			while(arr[e]>pivote) {
				e--;
			}
			if(s<e) {
				swap(arr,s,e);
			}
		}
		swap(arr,low,e);
		return e;
	}
	private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }


}
