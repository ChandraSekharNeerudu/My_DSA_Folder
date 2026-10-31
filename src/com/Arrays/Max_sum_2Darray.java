package com.Arrays;
import java.util.ArrayList;

public class Max_sum_2Darray {
	static int maxsum(int[][] array)
	{
		int max=0;
		int sum=0;
//		for(int rows=0;rows<array.length;rows++)
//		{
//			sum=0;
//			for(int col=0;col<array[rows].length;col++)
//			{
//				
//				sum+=array[rows][col];
//			}
//			if(sum>max)
//			{
//				max=sum;
//			}
//		}
		
		
		//  USING FOR EACH LOOP   //
		
		for(int[] rows:array)
		{
			sum=0;
			for(int col:rows)
			{
				sum+=col;
			}
			if(sum>max)
				{
					max=sum;
				}
		}
		return max;
	}
	
	public static void main(String[] args) {
		int[][] arr= {{9,9,12},{22,35,46},{5,6,8}};
		System.out.println(maxsum(arr));
	}

}
