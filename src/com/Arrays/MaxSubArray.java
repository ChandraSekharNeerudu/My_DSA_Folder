package com.Arrays;

public class MaxSubArray {
	public static int findMaxSubarraySum(int[] arr) {
        // Handle empty array case
        if (arr == null || arr.length == 0) return 0;

        // Initialize both with the first element
        int currentMax = arr[0];
        int maxSoFar = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // Decision: Do I add the current element to my existing sum, 
            // or is the current element better off starting a new subarray?
            currentMax = Math.max(arr[i], currentMax + arr[i]);

            // Update the best sum we have ever seen
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + findMaxSubarraySum(nums));
        // Output: 6 (The subarray is [4, -1, 2, 1])
    }
}
