package com.Frequencies;
import java.util.*;
public class NonCommonElements {
	public static void printNonCommon(int[] arr1, int[] arr2) {
        // Create sets to store unique numbers from each array
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        // Populate sets (automatically filters internal duplicates)
        for (int num : arr1) set1.add(num);
        for (int num : arr2) set2.add(num);

        // Print elements that are in arr1 but not in arr2
        for (int num : set1) {
            if (!set2.contains(num)) {
                System.out.print(num + " ");
            }
        }

        // Print elements that are in arr2 but not in arr1
        for (int num : set2) {
            if (!set1.contains(num)) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5}; // Sample from sheet
        int[] arr2 = {5, 2, 8, 9, 0, 3}; // Sample from sheet[cite: 1]
        
        printNonCommon(arr1, arr2);
        // Output: 1 4 8 9 0 (order may vary based on set hashing)[cite: 1]
    }
}
