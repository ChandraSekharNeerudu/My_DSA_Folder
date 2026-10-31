package com.sorting.quicksort;

import java.util.Arrays;

public class QuickSelect {
	public static int quickSelect(int[] arr, int low, int high, int k) {
        // Convert k (1-based) to the target index (0-based)
        int targetIndex = k - 1; 

        // If the array segment is valid
        while (low <= high) {
            
            // 1. Partition the array segment
            // This returns the final, sorted index of the pivot element.
            int pivotIndex = partition(arr, low, high);
            
            // 2. Check the pivot's position
            
            // Case 1: Pivot is at the target index
            if (pivotIndex == targetIndex) {
                return arr[pivotIndex]; // Element found!
            } 
            
            // Case 2: Target is in the right partition
            else if (pivotIndex < targetIndex) {
                // Eliminate the left partition, continue search on the right
                low = pivotIndex + 1; 
            } 
            
            // Case 3: Target is in the left partition
            else { // pivotIndex > targetIndex
                // Eliminate the right partition, continue search on the left
                high = pivotIndex - 1; 
            }
        }
        
        // Should not be reached in a correct implementation where k is valid
        return -1; 
    }

    /**
     * Lomuto Partition Scheme (Used for its simplicity in fixing pivot position).
     * Pivot is element at high index.
     */
    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1; // Boundary for elements <= pivot

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        
        // Place the pivot in its final, sorted position (i+1)
        swap(arr, i + 1, high);
        
        return i + 1;
    }

    /**
     * Helper function to swap two elements.
     */
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 2, 5, 9};
        int k = 3; // We want the 3rd smallest element
        
        System.out.println("Original Array: " + Arrays.toString(arr));
        System.out.println("Target k (k-th smallest): " + k);

        // We use a copy since the partitioning process modifies the original array
        int[] tempArr = Arrays.copyOf(arr, arr.length);
        
        int result = quickSelect(tempArr, 0, tempArr.length - 1, k);
        
        // Expected Output: 4
        System.out.println("Result (k-th smallest element): " + result);

        
    }


}
