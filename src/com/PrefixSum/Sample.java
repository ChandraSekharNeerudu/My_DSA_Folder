package com.PrefixSum;
import java.util.*;
public class Sample {
	void main() {
		int[] arr={5,2,3,1,4};
	     int n=arr.length;
	     for(int i=0;i<n;i++){
	         int max=0;
	         for(int j=0;j<n-i;j++){
	             if(arr[j]>arr[max])
	             {
	                 max=j;
	             }
	         }
	         int temp=arr[max];
	         arr[max]=arr[n-i-1];
	         arr[n-i-1]=temp;
	     }
	     System.out.println(Arrays.toString(arr));
	}
}
