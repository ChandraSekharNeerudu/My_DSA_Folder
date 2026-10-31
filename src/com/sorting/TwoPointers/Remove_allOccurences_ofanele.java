package com.sorting.TwoPointers;

import java.util.Arrays;

//gfg
public class Remove_allOccurences_ofanele {
	static int Removeele(int[] arr, int ele) {
		int s = -1;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ele) {
				count++;// for counting elemts not equal to given element
				s++;
				swap(arr, s, i);// 0, 1, 3, 0, 2, 2, 4, 2
			}
		}
		return count;
	}

	// --- 3. Helper and Main Methods ---
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 3, 0, 2, 2, 4, 2 };
		int ele = 2;
		System.out.println(Removeele(arr, ele));
		System.out.println(Arrays.toString(arr));
	}

}
