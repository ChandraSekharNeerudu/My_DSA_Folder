package com.sorting.mergrsort;

import java.util.Arrays;

public class Inplace {
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
	 
	 public static void mergeinplace(int[] arr ,int s,int m,int e)
	 {
		 int i=s,j=m,k=0;
		 int[] temp=new int[e-s];
		 while(i<m && j<e)
		 {
			 if(arr[i]<=arr[j])
			 {
				temp[k]=arr[i]; 
				i++;
			 }
			 else
			 {
				 temp[k]=arr[j];
				 j++;
			 }
			 k++;
		 }
		// It may possible that one of the array is not completed 
		 //copy remaining elements of that array at en of the merged
		 while(i<m)
		 {
			 temp[k]=arr[i];
			 i++;
			 k++;
		 }
		 while(j<e)
		 {
			 temp[k]=arr[j];
			 j++;
			 k++;
		 }
		 
		 for(int l=0;l<temp.length;l++)
		 {
			 arr[s+l]=temp[l];
		 }
		 
	 }
	 public static void main(String[] args) {
			int[] arr= {5,4,3,2,1};
		    mergeSort(arr,0,arr.length);              //we arr.length Because we are using the < at 
		    System.out.println(Arrays.toString(arr)); //while loop e is excluded
			
			
		}

}
