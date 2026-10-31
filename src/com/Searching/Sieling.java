package com.Searching;

public class Sieling {

	static int siel(int[] arr, int T) {
		int low = 0;
		int high = arr.length;
		//int mid=low+(high-low)/2;
		//boolean b=arr[low]<arr[high];
		
		while(low<=high)
		{
			 int mid=low+(high-low)/2;
			
			 if(arr[mid]==T)
				{
					return arr[mid];
				}

			 else if(T<arr[mid])
				{
					high=mid-1;;
				}
				else
				{
					low=mid+1;
				}
		}
		return arr[low];
	}
	
	public static void main(String[] args) {
		int[] arr= {1,4,6,8,9,12,15,18};
		int target=13;
		System.out.println(siel(arr,target));
	}
}
