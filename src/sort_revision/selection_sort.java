package sort_revision;

import java.util.Arrays;

public class selection_sort {
	static void selection(int[] arr,int l,int h)
	{
		for(int i=0;i<=h-1;i++)//we need no of elements -1 iteration to sort bcz if n-1 elements sorted 1 element also sorted
		{
			// find current max element
			int max=max(arr,l,h-i);
			//swap last index and largest element index
			swap(arr,max,h-i);
		}
	}
	//swap function
	static  void swap(int[] arr, int s, int e) {
		int temp = arr[s];
		arr[s] = arr[e];
		arr[e] = temp;
	}
	// finding mx element index
	static int max(int[] arr,int l,int h)
	{
		int largest=l;
		for(int i=l+1;i<=h;i++)
		{
			if(arr[i]>arr[largest])
			{
				largest=i;
			}
		}
		
		return largest;
	}
	public static void main(String[] args) {
		int[] arr= {8,2,8,3,10,10,4};
		selection(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

}
