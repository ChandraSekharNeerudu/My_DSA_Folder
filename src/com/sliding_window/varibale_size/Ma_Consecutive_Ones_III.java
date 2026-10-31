package com.sliding_window.varibale_size;

//frequency tracking in variable-sized windows.
public class Ma_Consecutive_Ones_III {//LeetCode 1004
	public static void main(String[] args) {
	    int[] arr={0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0};
	    int k=2;
	    maxSubArr(arr,k);
	}
	public static void maxSubArr(int[] arr,int k)
	{
	    int l=0,max=0,zerCount=0;
	    
	    for(int r=0;r<arr.length;r++)
	    {
	        if(arr[r]==0)
	        {
	            zerCount++;
	        }
	        
	        while(zerCount>k)
	        {
	            if(arr[l]==0)
	            {
	                zerCount--;
	            }
	            l++;
	        }
	        
	        max=Math.max(max,r-l+1);
	    }
	    System.out.println(max);
	}
}
