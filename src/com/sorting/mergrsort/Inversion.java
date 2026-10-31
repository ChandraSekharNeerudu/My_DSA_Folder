package com.sorting.mergrsort;

import java.util.Arrays;

// Modify the Merge Sort algorithm to count the total number of inversions in an array.
//An inversion is a pair of indices (i, j) such that i < j and A[i] > A[j]. 
//The counting must happen within the Merge step to maintain O(nlog n) complexity.
public class Inversion {
	static int count=0;

	 public static void mergeSort(int[] arr,int s,int e)
	 {
		 if(e-s==1) {//bcz e anedhi out of range kabatti s okkate vunnatlu so here only one ele in arr 1 element vunte devide cheyalsina paniledhu 
			 return ;
		 }
		 int mid=(s+e)/2;
		 mergeSort(arr,s, mid);
		 mergeSort(arr, mid, e);
		 
	
		 mergeinplace(arr,s,mid,e);//s to mid-1 left array mid to e right array
			 
	 }
	
	 public static void mergeinplace(int[] arr, int s, int m, int e) {
	        int i = s, j = m, k = 0;
	        int[] temp = new int[e - s];

	        while (i < m && j < e) 
	        {
	            if (arr[i] <= arr[j]) 
	            {
	                temp[k] = arr[i];
	                i++;
	            }
	            else
	            {
	                /* TRICK: If arr[i] > arr[j], then all elements 
	                   from index i to m-1 are greater than arr[j]
	                   because the left subarray is already sorted.
	                   bcz of asce order
	                */
	                count += (m - i); 
	                temp[k] = arr[j];
	                j++;
	            }
	            k++;
	        }

	        // Copy remaining elements
	        while (i < m) {
	            temp[k++] = arr[i++];
	        }
	        while (j < e) {
	            temp[k++] = arr[j++];
	        }

	        // Copy back to original array
	        for (int l = 0; l < temp.length; l++) {
	            arr[s + l] = temp[l];
	        }
	    }
	
	 public static void main(String[] args) {
			int[] arr= {5,4,3,2,1};
			mergeSort(arr,0,arr.length);
			System.out.println(count);
		}
	
	
}
