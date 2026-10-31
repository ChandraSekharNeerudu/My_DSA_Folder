package com.sorting.quicksort;

import java.util.Arrays;

public class String_sorting {
	static void hoareSort(String[] arr, int low, int high) {
		if (low >= high) {
			return;
		}
		int p = hoaremerge(arr, low, high);
		hoareSort(arr, low, p);
		hoareSort(arr, p + 1, high);
	}

	static int hoaremerge(String[] arr, int low, int high) {
		int s = low;
		int e = high;
		int pivot = arr[low].charAt(0);
		while (s < e) {
			while (arr[s].charAt(0) < pivot) {
				s++;
			}
			while (arr[e].charAt(0) > pivot) {
				e--;
			}
			if (s < e) {
				swap(arr, s, e);
			}
		}
		return e;

	}

	static void swap(String[] arr, int s, int e) {
		String temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;

	}

	public static void main(String[] args) {
		String[] arr = { "banana", "apple", "grape", "cherry" };
		hoareSort(arr, 0, 3);
		System.out.println(Arrays.toString(arr));
	}

}
