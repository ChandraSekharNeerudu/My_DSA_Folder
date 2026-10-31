package sort_revision;

import java.util.Arrays;

public class Bubblesort {
	static void bubble(int[] arr, int l, int h) {
		for (int i = 0; i <= h - 1; i++) {
			for (int j = 1; j <= h - i; j++) {
				if (arr[j - 1] < arr[j]) {
					swap(arr, j - 1, j);
				}
			}
		}
	}
	//swap function
		static  void swap(int[] arr, int s, int e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
		}
		public static void main(String[] args) {
			int[] arr= {9,2,8,6,1,4,2,8,1};
			bubble(arr,0,arr.length-1);
			System.out.println(Arrays.toString(arr));
		}
}
