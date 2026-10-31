package com.Searching.Binary;
import java.util.ArrayList;
import java.util.Arrays;
    // Kth smallest element in a row-wise and column-wise sorted 2D array
public class Kthsmallest_row_col {
	 public static int peakIndexInMountainArray(int[] arr) {
	        int n=arr.length;
	      int high=n;
	      int low=0;
	      int peak=0;
	      int mid=low+(high-low)/2;
	      while(mid<=high)  
	      {
	        if(arr[mid]<arr[mid+1])//to check if any greater ele present in RHS
	        {
	            mid=mid+1;
	        }
	        else if(arr[mid]<arr[mid-1])//to check if any greater ele present in LHS
	        {
	        	mid=mid-1;
	        }
	        else
	        {
	        	return arr[mid];
	        }
	    
	      }
	     return 0;
	 }
	public static void main(String[] args) {
		int[] arr= {0,10,5,2};
		System.out.println(peakIndexInMountainArray(arr));
	}

}
