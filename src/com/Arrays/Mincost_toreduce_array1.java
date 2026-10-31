
package com.Arrays;

public class Mincost_toreduce_array1 {
	static int mincost(int[] a)
	{
		
		if(a.length<=1)
		{
			return -1;
		}
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		return min*(a.length-1);
	}
	public static void main(String[] args) {
		int[] arr= {4,3,2};
		System.out.println(mincost(arr));
	}

}
