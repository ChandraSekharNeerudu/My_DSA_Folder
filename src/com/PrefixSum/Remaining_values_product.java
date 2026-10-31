package com.PrefixSum;

import java.util.Arrays;

public class Remaining_values_product {
	void main() {
		int[] arr= {1,4,5,8};
		int n=arr.length;
		int[] prefix_prod=new int[n];
		int[] suffix_prod=new int[n];
		int[] remaining_prod=new int[n];
		prefix_prod[0]=1;
		suffix_prod[n-1]=1;
		
		for(int i=1;i<n;i++)
		{
			prefix_prod[i]=prefix_prod[i-1]*arr[i-1];
		}
		for(int i=n-2;i>=0;i--)
		{
			suffix_prod[i]=suffix_prod[i+1]*arr[i+1];
		}
		for(int i=0;i<n;i++)
		{
			remaining_prod[i]=prefix_prod[i]*suffix_prod[i];
		}
		System.out.println(Arrays.toString(remaining_prod));
		bruteforce(arr);
	}
	
	static void bruteforce(int[] arr) {
		int[] remaining_prod=new int[arr.length];
		Arrays.fill(remaining_prod, 1);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j) {
					remaining_prod[i]*=arr[j];
				}
			}
		}
		System.out.println("bruteforce :"+Arrays.toString(remaining_prod));
	}

}
