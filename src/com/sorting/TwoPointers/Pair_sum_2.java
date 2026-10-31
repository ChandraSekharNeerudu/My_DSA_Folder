package com.sorting.TwoPointers;

import java.util.Arrays;

public class Pair_sum_2 {   //HER WE HAVE UNSORTED ARRAY
	//step 1 sort the array
	//step 2 solve by using two pointers index values like in pair_sum_1
	
	// sorting the given array using heap sort
	static void maxheapify(int[] arr,int n,int i)//here largest refers to the node element
	{
		int largest=i;
		//left and right child
		int left=2*i+1;
		int right=2*i+2;
			if(left<=n && arr[left]>arr[largest])
			{
				largest=left;
			}
			if(right<=n && arr[right]>arr[largest])
			{
				largest=right;
			}
			if(largest!=i)
			{
				swap(arr,i,largest);
				maxheapify(arr,n,largest);
			}
	}

	static void heapSort(int[] arr) { //O(nlogn)
		int n = arr.length - 1;
		for(int i=n/2-1;i>=0;i--)
		{
			maxheapify(arr,n,i);
		}
		
		//sorting
		for(int i=n;i>0;i--)
		{
			swap(arr,i,0);
			maxheapify(arr,i-1,0);
		}
	}

	static void swap(int[] arr, int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}     
	
	static boolean pairsum(int[] arr,int s,int e,int target)// O(n/2) using bina
	{
		while(s<e)
		{
			int sum=arr[s]+arr[e];
			if(sum==target)
			{
				return true;
			}
			else if(sum<target)
			{
				s++;
			}
			else
				
			{
				e--;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[] arr= {20,1,45,24,21,58,35,56,12};
		int target=660;
		heapSort(arr);
		System.out.println(Arrays.toString(arr));
		int mid=arr.length/2;
		if(arr[mid]>=target)
		{
			System.out.println(pairsum(arr,0,mid,target));
		}
		else System.out.println(pairsum(arr,mid+1,arr.length-1,target));
		
	}

}
