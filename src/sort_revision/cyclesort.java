package sort_revision;

import java.util.Arrays;

public class cyclesort {
	static void cycle1(int[] arr, int l, int h) {
		int i = l;
		while (i <= h) {
			//descending                       
			while (arr[i] != h+1-i) {
				swap(arr,i,h+1-arr[i]);
			}
			i++;
		}
	}
	static void cycle2(int[] arr, int l, int h) {
		int i = l;
		while (i <= h) {
			//ascending                     
			while (arr[i] != i+1) {
				swap(arr,i,arr[i]-1);
			}
			i++;
		}
	}
	//swap function
	static  void swap(int[] arr, int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}
	public static void main(String[] args) {
		int[] arr= {5,3,1,4,2};
		System.out.println(Arrays.toString(arr));
		cycle2(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

}
