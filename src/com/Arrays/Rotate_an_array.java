package com.Arrays;

import java.util.Arrays;

public class Rotate_an_array {
	                                           //MY METHOD O(n*k)
	
	static void leftRotate(int[] arr, int k) {
		int n = arr.length - 1;
		int r=k%arr.length;
		for (int i = 0; i < r; i++) {
			// store last element int temparary variable
			int temp = arr[n];

			// shift last-1 element to last and last-2 to last-1 so on
			// for placing 0 index element in 1 index and 1 index in 2 and 2 index in 3
			// etc......
			for (int j = n; j > 0; j--) {
				arr[j] = arr[j - 1];
			}
			arr[0] = temp;
		}
	}

	                                           //EFFICIENT WAY O(n)
	//RIGHT ROTATE
	public void right_rotate(int[] arr, int n) {
		n = n % arr.length;
		if (n == 0) {
			return ;
		}
		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, n - 1);
		reverse(arr, n, arr.length - 1);
		//return arr;
	}
	
	//LEFT ROTATE
	public void left_rotate(int[] arr,int n) 
	{
		n=n%arr.length;
		reverse(arr,0,arr.length-1);
		reverse(arr,0,arr.length-n-1);//reverse chesaka length-n elements revrse avvali (index-n-1
		reverse(arr,arr.length-n,arr.length-1);
	}

	public void reverse(int[] arr, int s, int e) {
		while (s <= e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
			s++;
			e--;
		}
	}
	public static void main(String[] args) {
		Rotate_an_array obj=new Rotate_an_array();
		int[] arr= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		obj.right_rotate(arr,2);
		System.out.println(Arrays.toString(arr));
		
	}

}
