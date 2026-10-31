package com.sliding_window.varibale_size;

public class Min_Sum_Sub_Array_Greater_Than_n {
	void main()
	{
		int[] arr={1, 4, 45, 6, 10, 19};
		int N=51;
		leastEleGreaterThanN(arr,N);
	}

	private void leastEleGreaterThanN(int[] arr, int n) {
		int cursum=0;
		int left=0;
		int least=Integer.MAX_VALUE;
		for(int right=0;right<arr.length;right++)
		{
			cursum+=arr[right];
			while(cursum>=n && left<=right)//checking inside while bcz inside while cursum is >=
			{
				least=Math.min(least, cursum);//insie while cursum hade >= and in that we are taking the least one
				cursum-=arr[left];
				left++;
				
			}
		}
		System.out.println(least);
	}
}
