package sort_revision;

import java.util.Arrays;

public class Mergesort {
	static void divide(int[] arr,int low,int high)
	{
		if(high-low==1)
		{
			return;
			
		}
		int m=(low+high)/2;
		divide(arr,low,m);
		divide(arr,m,high);
		merge(arr,low,m,high);
	}
	static void merge(int[] arr,int l,int m,int h)
	{
		int[] temp=new int[h-l];
		int i=l,j=m,k=0;
		while(i<m && j<h)
		{
			if(arr[i]<arr[j])
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
		//if any elements are remaining in the 1st array
		while(i<m)
		{
			temp[k]=arr[i];
			i++;
			k++;
		}
		//if any elements are remaining in the 2nd array
		while(j<h)
		{
			temp[k]=arr[j];
			j++;
			k++;
		}
		for(int a=0;a<temp.length;a++)
		{
			arr[l+a]=temp[a];
		}
	}
	public static void main(String[] args) {
		int[] arr= {5,2,8,4,1};
		divide(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}

}
