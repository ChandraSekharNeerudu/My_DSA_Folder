package com.Arrays;

import java.util.*;

public class Allsubarrays {

//	Input: arr[] = [1, 2, 3]
//			Output: [[1], [1, 2], [1, 2, 3], [2], [2, 3], [3]]
	//Prints all subarrays in arr[0..n-1]
    static void subArray(ArrayList<Integer> arr) {
        int n = arr.size();

        // Pick starting point
        for (int i = 0; i < n; i++) {
          
            // Pick ending point
            for (int j = i; j < n; j++) {
              
                // Print subarray between current starting and ending points
                for (int k = i; k <= j; k++) {
                    System.out.print(arr.get(k) + " ");
                }
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        System.out.println("All Non-empty Subarrays:");
        subArray(arr);
    }

}
