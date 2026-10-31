package com.sorting.insertion;

import java.util.Arrays;

public class Sort_char {
	static void charSort(char[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				int max = j;
				if (arr[j - 1] < arr[max]) // Descending order
				{
					char temp = arr[j - 1];
					arr[j - 1] = arr[max];
					arr[max] = temp;
				} else {
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		char[] arr= {'e', 'a', 'c', 'd', 'b'};
		charSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
