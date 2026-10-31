package com.Arrays;

import java.util.Arrays;

public class Matrix_Rotation_90_Degrees {
	void matrixRotate(int[][] arr)   //O(n^2)
	{
		int[][] arr2=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
					arr2[i][j]=arr[2-j][i];
			}
		}
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(Arrays.toString(arr2[i]));
		}
	}
	
	
	void matrixRotate2(int[][] arr)    //O(n)
	
	{
		// Step 1: Transpose the matrix (swap arr[i][j] with arr[j][i])
        // We only iterate over the upper triangle to avoid swapping back
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int temp=arr[i][j];
				arr[i][j]=arr[j][i];
				arr[j][i]=temp;
			}
		}
		
		// Step 2:Reversing each array
		for(int i=0;i<arr.length;i++)
		{
			int left=0;
			int right=arr.length-1;
			while(left<right)
			{
				arr[i][left]=arr[i][left]^arr[i][right];
				arr[i][right]=arr[i][left]^arr[i][right];
				arr[i][left]=arr[i][left]^arr[i][right];
				left++;
				right--;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
    public static void main()
    {
    	int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
    	Matrix_Rotation_90_Degrees obj=new Matrix_Rotation_90_Degrees();
    	for(int i=0;i<arr.length;i++)
		{
			System.out.println(Arrays.toString(arr[i]));
		}
    	System.out.println();
    	obj.matrixRotate2(arr);
    	
    }
}
