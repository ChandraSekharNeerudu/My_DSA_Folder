package com.Mock1;

public class Strictly_Increasing_Arr {
	public static int longSub(int[] arr) {
		int max=Integer.MIN_VALUE;
		int l=0;
		for(int e=1;e<arr.length;e++) {
			if(arr[e]<arr[e-1]) {
				l=e;
				continue;
			}
			if(e-l+1>max)max=e-l+1;
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr= {10, 20, 15, 20, 25, 30, 10};
		System.out.println(longSub(arr));
	}
}
