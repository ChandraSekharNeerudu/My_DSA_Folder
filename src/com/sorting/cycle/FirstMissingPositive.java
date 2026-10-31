package com.sorting.cycle;

public class FirstMissingPositive {// Cyclic sort with array consists number more than the range 1 - N
	public static int firstMissingPositive(int[] nums) {
        int n = nums.length;
        int i = 0;

        // 1. Cyclic Sort Pass: Place all valid numbers (1 to n) into their correct indices (0 to n-1)
        while (i < n) {
            int currentElement = nums[i];
            
            // Calculate the correct index for the current element (number X belongs at index X-1)
            int correctIndex = currentElement - 1;

            // Filtration/Validation Check:
            // The number must be positive (>= 1) AND within the array bounds (<= n)
            if (currentElement >= 1 && currentElement <= n) {
                
                // Swap only if the current element is NOT already at its correct index
                if (currentElement != nums[correctIndex]) {
                    // Perform the swap
                    swap(nums, i, correctIndex);
                } else {
                    // Element is valid AND in the correct spot, move to the next element
                    i++;
                }
            } else {
                // Element is out of range (<= 0 or > n), so we ignore it and move on
                i++;
            }
        }

        // 2. Final Scan Pass: Find the first index that doesn't contain its corresponding number
        for (int j = 0; j < n; j++) {
            // If the number at index j is not equal to j + 1, then j + 1 is the missing positive
            if (nums[j] != j + 1) {
                return j + 1;
            }
        }

        // 3. Edge Case: If the array contains all numbers from 1 to n (e.g., [1, 2, 3]), 
        // then the smallest missing positive is n + 1.
        return n + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // Sample 1:
        int[] data1 = {3, 4, -1, 1}; // Expected: 2
        System.out.println("Input: [3, 4, -1, 1] -> Missing Positive: " + firstMissingPositive(data1)); 
        
        // Sample 2:
        int[] data2 = {7, 8, 9, 11, 12}; // Expected: 1
        System.out.println("Input: [7, 8, 9, 11, 12] -> Missing Positive: " + firstMissingPositive(data2)); 
        
        // Sample 3 (Edge Case):
        int[] data3 = {1, 2, 3}; // Expected: 4
        System.out.println("Input: [1, 2, 3] -> Missing Positive: " + firstMissingPositive(data3)); 
    }
}
