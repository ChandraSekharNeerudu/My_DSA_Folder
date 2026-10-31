package com.Strings;

public class Rotations_of_eachother {
	static boolean areRotations(String s1, String s2) {         //O(n^2),O(n)
        int n = s1.length();

        // generate and check all possible rotations of s1
        for (int i = 0; i < n; ++i) {
            
            // if current rotation is equal to s2 return true
            if (s1.equals(s2)) {
                return true;
            }

            // Right rotate s1
            char last = s1.charAt(s1.length() - 1);
            s1 = last + s1.substring(0, s1.length() - 1);
        }
        return false;
    }
	static boolean areRotations1(String s1, String s2) {         //O(n),O(n)
	    // 1. Length check is mandatory
	    if (s1.length() != s2.length()) return false;

	    // 2. The Trick: s1 + s1 contains all rotations of s1
	    String combined = s1 + s1;

	    // 3. check if s2 is a substring
	    return combined.contains(s2);
	}
	public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        System.out.println(areRotations(s1, s2));
    }

}
