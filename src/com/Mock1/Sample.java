package com.Mock1;

public class Sample {
	public static void main(String[] args) {
		int[] arr= {20,30,60,10,60,40,10};
		int max=arr[0],secondMax=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				secondMax=max;
				max=arr[i];
			}
			else if(arr[i]>secondMax&&arr[i]!=max) {
				secondMax=arr[i];
			}
		}
		System.out.println(max+" "+secondMax);
	}
}
