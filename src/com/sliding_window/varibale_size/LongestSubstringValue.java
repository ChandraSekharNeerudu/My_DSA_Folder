package com.sliding_window.varibale_size;
import java.util.*;
public class LongestSubstringValue {
	public static void main(String[] args) {
        String str = "abcbdefeghdabc";
        int left = 0, maxl = 0, maxr = 0;
        
        // Start at 0 instead of MIN_VALUE for cleaner window comparison
        int maxlength = 0; 
        
        Map<Character, Integer> map = new HashMap<>();
        
        for (int right = 0; right < str.length(); right++) {
            char c = str.charAt(right);
            
            // If character is seen inside current window, jump left pointer
            if (map.containsKey(c)) {
                left = Math.max(left, map.get(c) + 1);
            }
            
            map.put(c, right);
            
            // Update length AND pointers together inside the same block
            if (right - left + 1 > maxlength) {
                maxlength = right - left + 1;
                maxl = left;
                maxr = right;
            }
        }
        
        System.out.println("Max Length: " + maxlength);
        System.out.println("Substring: " + str.substring(maxl, maxr + 1));
	}
}
