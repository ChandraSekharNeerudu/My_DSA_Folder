package com.Arrays;

import java.util.ArrayList;                      //FOR ARRAY ALSO SAME LOGIC //
import java.util.Scanner;

public class Pair_List_sum { 
	                          //O(n*n)
	static boolean pair(ArrayList<Integer> arr, int sum) {
		if(arr.isEmpty()||arr.size()==1)
		{
			return false;
		}
		else {
		for (int i = 0; i < arr.size(); i++) {
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr.get(i) + arr.get(j) == sum) {
					if(arr.get(i)!=arr.get(j)||i!=j) {
					return true;
					}
				}
			}
		}
		return false;
	}
	}
	
	// using TWO POINTER TECHNIQUE //O(N)
	public boolean findPairWithSum(ArrayList<Integer> arr, int sum) {
        int left = 0;
        int right = arr.size() - 1;

        while (left < right) {
            int currentSum = arr.get(left) + arr.get(right);
            
            if (currentSum == sum) {
                return true; // Pair found
            } else if (currentSum < sum) {
                left++; // Sum is too small, move left pointer to increase it
            } else {
                right--; // Sum is too large, move right pointer to decrease it
            }
        }
        
        return false; // No pair found
    }
	
	
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		System.out.println("Array elements one by one :");
		for(int i=0;i<4;i++)
		{
			arr.add(i,sc.nextInt());
		}
		System.out.println("Enter a number to find indexes :");
		int a=sc.nextInt();
		System.out.println(pair(arr,a));
	}

}
