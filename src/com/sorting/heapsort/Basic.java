package com.sorting.heapsort;

import java.util.Arrays;

public class Basic {
	static void heapSort(int[] arr, int n) {//i refers to the index where we are perform heapify
		// LARGEST NON LEAF ELEMENT INDEX
		int i = n / 2 - 1;
		// FOR BUILDING MAX HEAP
		for (int j = i; j >= 0; j--) {        // O(log n) Bcz half of the array only that means n/2 levels only
			maxHeapify(arr, n, j);
		}
		// FOR SWAPING LARGEST ELEMENT TO THE LAST INDEX (DELETEING ROOT NODE)
		for (int k = n; k > 0; k--) {
			swap(arr, k, 0);
			maxHeapify(arr, k-1, 0);//ignore from k bcz that is sorted part
		}
	}

	static void maxHeapify(int[] arr, int n, int i) {  //O(n)
		int largest = i;
		// FINDING CHILD NOED INDEX
		int l = 2 * i + 1;
		int r = 2 * i + 2;

		// CHECKING WHETHER LEFT IS GREATER THAN PARENT
		if (l <= n && arr[l] > arr[largest]) {
			largest = l;
		}
		// CHECKING WHETHER RIGHT IS GREATER THAN PARENT or UPDATED PARENT(LEFT)
		if (r <= n && arr[r] > arr[largest]) {
			largest = r;
		}
		// SWAPPING IF LARGEST IS UPDATED
		if (largest != i) {
			swap(arr, i, largest);
			maxHeapify(arr, n, largest);
		}

	}

	static  void swap(int[] arr, int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 15,5,20,1,17,10,30 };
		int n = arr.length - 1;
		heapSort(arr, n);
		System.out.println(Arrays.toString(arr));

	}

}
