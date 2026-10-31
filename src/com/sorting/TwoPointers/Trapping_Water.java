package com.sorting.TwoPointers;

public class Trapping_Water {
	void main()
	{
		int[] arr= {1,8,6,2,5,4,8,3,7};
		findMax(arr);
	}

	private void findMax(int[] arr) {
		int l=0;
		int r=arr.length-1;
		int max=0;
		while(l<=r)
		{
			int width=r-l;
			int height=Math.min(arr[l], arr[r]);
			int area=height*width;
			if(area>max)
			{
				max=area;
			}
			
			if(arr[l]<arr[r])
			{
				l++;
			}else r--;
		}
		System.out.println(max);
	}
}
