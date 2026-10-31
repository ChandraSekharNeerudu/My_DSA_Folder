package com.sliding_window.varibale_size;

public class Maximum_sum_sub_array_less_than_n {
	public int maxSubarraySum(int[] arr, int n) {   //OPTIMIZED
	    int max_sum = 0;
	    int current_window_sum = 0;
	    int left = 0;

	    for (int right = 0; right < arr.length; right++) {
	        // 1. Expand the window
	        current_window_sum += arr[right];

	        // 2. Shrink the window if it exceeds target 'n'
	        while (current_window_sum > n && left <= right) {
	            current_window_sum -= arr[left];
	            left++;
	        }

	        // 3. Update the maximum sum found so far that is <= n
	        max_sum = Math.max(max_sum, current_window_sum);//outside while current_window is <= n and we are taking max one 
	    }

	    return max_sum;
	}
	void main()
	{
		int[] arr= { 3, 3, 5,8,9};
		System.out.println(maxSubarraySum(arr,13));
	}

	int sum2(int[] arr, int n) {//logical flaw m
		int curmaxsum = 0;
		int window_sum = 0;
		int end_of_window=0;
		// first window
		for (int i = 0; i < arr.length; i++)
		{
			curmaxsum=window_sum;
			window_sum+=arr[i];
			if (window_sum >= n) {
				end_of_window = i;//index after the the window last index (where window sum<n
				break;
			}
			
		}
		if (window_sum == n) {// Input: arr[] = [ 3, 3, 5,8,9], sum = 13
			return curmaxsum;
		}
		// sliding the
		////Input: arr[] = [1, 2, 3, 4, 5], sum = 11
		int l=0;
		window_sum=curmaxsum;
		for (int r =end_of_window; r < arr.length; r++)
		{
			window_sum=window_sum-arr[l]+arr[r];
			while(window_sum>=n && l<r)
			{
				if(window_sum>curmaxsum)
				{
					curmaxsum=window_sum;
				}
				l++;
				window_sum=window_sum-arr[l];
			}
			l++;
		}

			return curmaxsum;
	}
}
