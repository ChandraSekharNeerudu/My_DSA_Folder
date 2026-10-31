package sort_revision;

import java.util.Arrays;

public class Insertionsort {
	static void insertion(int[] arr,int l,int h)
	{
		for(int i=1;i<=h;i++)
		{
			for(int j=i;j>=1;j--)
			{
				if(arr[j]>arr[j-1])
				{
					swap(arr,j,j-1);
				}
			}
		}
	}
	//swap function
			static  void swap(int[] arr, int s, int e) {
				int temp = arr[s];
				arr[s] = arr[e];
				arr[e] = temp;
			}
			public static void main(String[] args) {
				int[] arr= {20,60,10,30,15,40,18};
				System.out.println(Arrays.toString(arr));
				insertion(arr,0,arr.length-1);
				System.out.println(Arrays.toString(arr));
				
			}

}
