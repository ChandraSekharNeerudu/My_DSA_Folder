package com.sorting.mergrsort;

import java.util.Arrays;

public class Basic_not_Inplace {
 public static int[] mergeSort(int[] arr)
 {
	 if(arr.length==1) {
		 return arr;
	 }
	 int mid=arr.length/2;
	 int[] left=mergeSort(Arrays.copyOfRange(arr,0, mid));
	 int[] right=mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
	 
	 
	 return merge(left,right);
		 
 }
 
 public static int[] merge(int[] first ,int[] second)
 {
	 int i=0,j=0,k=0;
	 int[] merged=new int[first.length+second.length];
	 while(i<first.length && j<second.length)
	 {
		 if(first[i]<=second[j])
		 {
			merged[k]=first[i]; 
			i++;
		 }
		 else
		 {
			 merged[k]=second[j];
			 j++;
		 }
		 k++;
	 }
	 // It may possible that one of the array is not completed 
	 //copy remaining elements of that array at en of the merged
	 while(i<first.length)
	 {
		 merged[k]=first[i];
		 i++;
		 k++;
	 }
	 while(j<second.length)
	 {
		 merged[k]=second[j];
		 j++;
		 k++;
	 }
	 return merged;
 }
 
 public static void main(String[] args) {
	int[] arr= {5,4,3,2,1};
	int[] sortedarray=mergeSort(arr);
	System.out.println(Arrays.toString(sortedarray));
	
}

}
