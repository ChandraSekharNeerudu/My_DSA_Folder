package com.sliding_window;

public class Max_sumof_subarray {
	static int maxsum(int[] arr, int n,int k)// SLIDING WINDOW
	{
		if(n<k)
		{
			System.out.println("Invalid input array");
			return -1;
		}
		//intial window building
		int max_sum=0;//2,5,10,4,6,8,3,9
		for(int i=0;i<k;i++)
		{
			max_sum+=arr[i];
		}
		
		int window_sum=max_sum;
		for(int j=k;j<n;j++)
		{
			window_sum+=arr[j]-arr[j-k];
			max_sum=Math.max(max_sum, window_sum);
		}
		
		return max_sum;
	}
	
	public static void main(String[] args) {
		int[] arr= {2,5,10,4,6,8,3,9};
		int k=3;
		System.out.println(maxsum(arr,arr.length,k));         
//		String s="abcdef";
//		bruteforce2(s,k);
	}
	
	static void bruteforce1(int[] arr,int k)
	{
		int n=arr.length;
		int maxwindow=0;
		for(int i=0;i<=n-k;i++)
		{
			int window=0;
			for(int j=i;j<i+k;j++)
			{
				window+=arr[j];
			}
			maxwindow=Math.max(maxwindow, window);
		}
		System.out.println(maxwindow);
	}
	
	static void bruteforce2(String s,int k)
	{
		String ls=s.toLowerCase();
		int maxwindow=0;
		for(int i=0;i<=s.length()-k;i++)
		{
			int window=0;
			for(int j=i;j<i+k;j++)
			{
				window+=(s.charAt(j)-'a');
			}
			maxwindow=Math.max(maxwindow, window);
		}
		System.out.println(maxwindow);
	}

}
