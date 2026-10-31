package com.sorting.bubble;

import java.util.Arrays;

public class Bi_Directional_Sort {
	static void Bi_Sort(int[] arr) {
		int n = arr.length;
		boolean flag;
		for (int i = 0; i < n - 1; i++) {
			flag = false;
			for (int j = 1; j < n - i; j++) {
				// ASCENDING ORGER //
				int previous = j - 1;
				if (arr[previous] > arr[j]) { // if 2nd element is greater then swap
					int temp1 = arr[previous];
					arr[previous] = arr[j];
					arr[j] = temp1;
					flag = true;
                // DESCENDING ORDER //
					int next = n - 1;
					if (arr[n - i - j] > arr[next]) // if last element less than last before element then swap
					{
						int temp2 = arr[next];
						arr[next] = arr[n - i - j];
						arr[n - j - i] = temp2;
					}
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr= {5, 1, 4, 2, 8, 0};
		Bi_Sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
