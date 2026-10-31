package com.sorting.quicksort;

import java.util.Arrays;

public class Kth_smallest {
	static int lumutos(int[] arr, int low, int high, int k) {
		while (low <= high) {
			int targetindex = k - 1;
			int p = partition(arr, low, high);// p = partition point
			if (p == targetindex) {
				return arr[p];

			} else if (p < targetindex) {
				p = p + 1;// search right
			} else {
				high = p - 1;
			}
		}
		return 0;
	}

	static int partition(int[] arr, int low, int high) {
		int pivote = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivote) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr, i + 1, high);
		return i + 1;
	}

	// --- 3. Helper and Main Methods ---
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 4, 1, 7, 2, 5, 9 };
		int k = 3;
		int result = lumutos(arr, 0, arr.length - 1, 3);
		System.out.println(Arrays.toString(arr));
		System.out.println(result);
	}

}
