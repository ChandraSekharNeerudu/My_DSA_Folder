package sort_revision;

import java.util.Arrays;

public class Quicksort_Lumutos {
	static void partition(int[] arr,int low,int high)
	{
		if(low>=high)
		{
			return;
		}
		int pivoteindex=sort(arr,low,high);
		partition(arr,low,pivoteindex-1);
		partition(arr,pivoteindex+1,high);
		
	}
	static int sort(int[] arr, int low, int high) {
		int pivote = arr[high];
		int i = low-1;// it is for tracking index of most highest element just before pivote element
		for (int j = low; j < high; j++) {
			if (arr[j] <= pivote) {
				i++;
				swap(arr, i, j);
			}
		}
		swap(arr,i+1,high);
		return i+1;//which is the exact pivote index
	}
	//swap function
		static  void swap(int[] arr, int s, int e) {
			int temp = arr[s];
			arr[s] = arr[e];
			arr[e] = temp;
		}
		public static void main(String[] args) {
			int[] arr= {50,12,46,28,49,55};
			partition(arr,0,arr.length-1);
			System.out.println(Arrays.toString(arr));
			
		}
}
