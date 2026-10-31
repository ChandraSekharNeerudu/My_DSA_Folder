package com.sorting.mergrsort;

import java.util.Arrays;

public class Sample {
	void Hoare(int arr[],int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		int s=low;
		int e=high;
		int mid=low+(high-low)/2;
		int pivote=arr[mid];
		while(s<=e)
		{
			while(arr[s]<pivote)
			{
				s++;
			}
			while(arr[e]>pivote)
			{
				e--;
			}
			if(s<=e)
			{
				swap(arr,s,e);
				s++;
				e--;	
			}
		}
		Hoare(arr,low,e);
		Hoare(arr,s,high);
	}
	

	public void mergesort(int[] arr,int size)
	{
		if(size<=1) {
			return;
		}
		int m=size/2;
		int[] left=Arrays.copyOfRange(arr,0,m);
		mergesort(left,m);
		int[] right=Arrays.copyOfRange(arr, m,arr.length);
		mergesort(right,right.length);
		merge(arr,left,right,left.length,right.length);
	}
    public void merge(int[] arr,int[] left,int[] right,int ls,int rs)
    {
    	int i=0,j=0,k=0;
    	while(i<ls&&j<rs) {
    		if(left[i]<right[j]) {
    			arr[k++]=left[i++];
    		}else arr[k++]=right[j++];
    	}
    	while(i<ls) {
    		arr[k++]=left[i++];
    	}
    	while(j<rs) {
    		arr[k++]=right[j++];
    	}
    }
    public void quickSort(int[] arr,int low,int high)
    {
    	if(low>=high) {
    		return;
    	}
    	int pivoteInd=findPivote(arr, low, high);
    	quickSort(arr,low,pivoteInd-1);
    	quickSort(arr,pivoteInd+1, high);
    }
    public int findPivote(int[] arr,int low,int high) {
    	int pivote=arr[low];
    	int s=low,e=high;
    	while(s<e) {
    		while(s<=high&&arr[s]<=pivote)s++;
    		while(arr[e]>pivote)e--;
    		if(s<e) swap(arr, s, e);
    	}
    	swap(arr,low,e);
    	return e;
    	
    }
	public void main() {
		int[] arr={1,4,2,5,3,6,2,8,4,6};//{4,2,5,3,8};//{2,5,4,169,567,87,12,234,456,543,823,23,5689};
		quickSort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}
	// --- 3. Helper and Main Methods ---
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
