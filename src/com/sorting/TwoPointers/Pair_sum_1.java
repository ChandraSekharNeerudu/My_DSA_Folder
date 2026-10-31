package com.sorting.TwoPointers;

import java.util.Arrays;
//gfg
//*** IT ALSO SOLVED USING BINARY SEARCH METHOD ONCE CHECK IT IN GFG TWO POINTER 6TH ONE
public class Pair_sum_1 {//here we have sorted array
	static int[] Twoele(int[] arr, int t) {
		int[] result=new int[2];
		int s = 0;
		int e = arr.length - 1;
		while (s < e) {
			int sum = arr[s] + arr[e];
			if (sum == t) {
				result[0]=s;
				result[1]=e;
				return result;
			} else if (sum > t) {
				e--;
			} else {
				s++;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		int[] arr= {-8, 1, 4, 6, 10, 45};
		int t=500;
		int[] targets=Twoele(arr,t);
		if(targets[0]+targets[1]!=0)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		System.out.println(Arrays.toString(targets));
	}

}
