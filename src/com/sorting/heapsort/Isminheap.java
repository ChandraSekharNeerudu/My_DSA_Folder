package com.sorting.heapsort;

public class Isminheap {
	static boolean isMinHeap(int[] arr,int n,int i)
	{
		boolean status=true;
		int min=i;
		//left child
		int l=2*i+1;
		//right child
		int r=2*i+2;
		
		if(l<=n && arr[l]<arr[min])
		{
			min=l;
		}
		if(r<=n && arr[r]<arr[min])
		{
			min=r;
		}
		if(min!=i)
		{
			status=false;
			return status;
		}
		else if(l<=n && r<=n)
		{
			isMinHeap(arr,n,i+1);
		}
		return status;
	}
	public static void main(String[] args) {
		int[] arr= {2, 4, 5, 8, 10};
		int n=arr.length-1;
		System.out.println(isMinHeap(arr,n,0));
	}


}
