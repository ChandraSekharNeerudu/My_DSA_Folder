package com.sorting.quicksort;

public class LomutoQuickSort {
	// --- 1. Lomuto's Partition Scheme (Returns Final Pivot Index) ---
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) { 
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        // Place the pivot in its final sorted position i.e i+1 bcz i had highest least
        //than the pivote ele 
        swap(arr, i + 1, high);
        return i + 1;
    }
 // --- 2. Lomuto's Partition Scheme (Returns Final Pivot Index)   DESCENDING ORDER ---
    public static int partition1(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) { 
            if (arr[j] >= pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        // Place the pivot in its final sorted position i.e i+1 bcz i had highest least
        //than the pivote ele 
        swap(arr, i + 1, high);
        return i + 1;
    }

    // --- 2. Recursive QuickSort Function ---
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // p is the pivot's final, correct index
            int p = partition(arr, low, high);

            // Recursively sort sub-arrays *excluding* the pivot
            quickSort(arr, low, p - 1);
            quickSort(arr, p + 1, high);
        }
    }
    
    // --- 3. Helper and Main Methods ---
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {50,12,46,28,49,55};
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Lomuto QuickSort Result: " + java.util.Arrays.toString(arr));
    }

}
