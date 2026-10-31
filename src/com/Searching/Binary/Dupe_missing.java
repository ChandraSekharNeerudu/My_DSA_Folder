package com.Searching.Binary;

import java.util.ArrayList;

public class Dupe_missing {
	static int[] arr1 = new int[2];

	static ArrayList<Integer> findTwoElement(int[] arr) {
		int n = arr.length;

		// frequency array to count occurrences
		int[] freq = new int[n];
		int repeating = -1;
		int missing = -1;

		// count frequency of each element
		for (int i = 0; i < n; i++) {
			freq[arr[i]-1]++;
		}

		// identify missing and repeating numbers
		for (int i = 1; i < n; i++) {
			if (freq[i] == 0)
				missing = i+1;
			else if (freq[i] == 2)
				repeating = i+1;
		}

		ArrayList<Integer> result = new ArrayList<>();
		result.add(repeating);
		result.add(missing);
		return result;
	}

	// more efficiant with O(10 space complexity)
	static void missanddupe(int[] arr) {
		int n = arr.length ;
		for (int i = 0; i < n; i++) {
			int val = Math.abs(arr[i]);
			if (arr[val-1] > 0) {
				arr[val-1] = -arr[val-1];
			}
			else
			{
				System.out.println("dupe value is :"+val);
				
			}
		}
		
		
		for(int i=0;i<n;i++)//Idea : value ledu kabatti a index joliki manam vellam kabatti leni value index anedhi eppudu >0 vuntundhi
		{
			if(arr[i]>0)
			{
				System.out.println("missing value is :"+(i+1));
				break;
			}
		}
	}

	
	
	
	
	public static void main(String[] args) {
		int[] arr = { 1,3,2,3 };
		ArrayList<Integer> ans = findTwoElement(arr);

		
		System.out.println(ans.get(0) + " " + ans.get(1));
		//missanddupe(arr);
	}
}
