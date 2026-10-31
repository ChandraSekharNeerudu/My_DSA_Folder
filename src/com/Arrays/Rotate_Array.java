package com.Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Rotate_Array {
	public static void RotateArray(int[] arr,int n)
	{
		int a=(n%arr.length);
		if(a==0) {return;}
		for(int i=0;i<(n%arr.length);i++)
		{
			int b=arr[arr.length-1];
			for(int j=arr.length-1;j>0;j--)//moving elemnts to the next index
			{
				arr[j]=arr[j-1];
			}
			arr[0]=b;
		}
		for(int j : arr)
		{
			System.out.print(j+" ");
		}
			
		
	}
	
	
	// The optimized rotation method for Arraylist
    static void rotate(ArrayList<Integer> arr, int a) {
        int n = arr.size();
        // Calculate effective rotations to avoid unnecessary full rotations
        int rotations = a % n;
        if (rotations == 0) {
            return;
        }

        // Step 1: Reverse the first (n - rotations) elements
        reverse(arr, 0, n - rotations - 1);

        // Step 2: Reverse the last (rotations) elements
        reverse(arr, n - rotations, n - 1);

        // Step 3: Reverse the entire list
        reverse(arr, 0, n - 1);

        System.out.println(arr);
    }

    // Helper method to reverse a portion of the list in-place
    private static void reverse(ArrayList<Integer> arr, int start, int end) {
        while (start < end) {
            Collections.swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    
    
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList();
		int[] arr1= {1, 2, 3, 4, 5, 6};
		RotateArray(arr1,8);
		
	}

}
