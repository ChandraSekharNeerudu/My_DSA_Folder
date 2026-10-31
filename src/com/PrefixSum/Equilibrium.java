package com.PrefixSum;

import java.util.Arrays;

public class Equilibrium {

	int equi(int[] arr) {      //O(n),O(n)
		if (arr.length <= 1) {
			return -1;
		}
		int equi_index = -1;

		// constructing the post fix sum aray
		int[] temp = new int[arr.length];
		temp[arr.length-1]=arr[arr.length-1];
		for (int i = arr.length - 2; i >= 0; i--) {//1, 2, 0, 3
			temp[i] = arr[i] + temp[i + 1];
		}

		// construct prefix sum array
		for (int i = 1; i < arr.length; i++) {
			arr[i] += arr[i - 1];
		}

		// checking whether an index is quilibrium or not
		for (int i = 1; i < arr.length - 1; i++) {
			if (arr[i-1] == temp[i + 1]) {
				return i;
			}
		}
		return equi_index;
	}
	                                               //OPTIMIZED
	int equilibriumPoint(int[] arr) {//O(n)O(1)
        int prefSum = 0, total = 0;

        // Calculate the array sum
        for (int ele : arr) {
            total += ele;
        }

        // Iterate pivot over all the elements of the array
        for (int pivot = 0; pivot < arr.length; pivot++) {
            int suffSum = total - prefSum - arr[pivot];//key formula
            if (prefSum == suffSum) {
                return pivot;
            }
            prefSum += arr[pivot];//building prefix
        }

        // There is no equilibrium point
        return -1;
    }
	void basic(int[] arr)
	{
		int sum=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			sum+=arr[i];
			arr[i]+=arr[i-1];
		}
		for(int i=1;i<arr.length-1;i++)
		{
			if(arr[i-1]==sum-arr[i])
			{
				System.out.println("equilibrium is :"+i);
			}
		}
		System.out.println(Arrays.toString(arr));
	}



	void main() {
		int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
		System.out.println(equilibriumPoint(arr));
	}
}
