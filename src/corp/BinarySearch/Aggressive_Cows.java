package corp.BinarySearch;

import java.util.Arrays;

/*Problem Statement: You are given an array representing the coordinates of N
stalls on a straight line. You have C aggressive cows. You need to assign 
the cows to the stalls such that the minimum distance between any two of 
them is as large as possible. Return this maximum possible minimum distance.

Sample Input: stalls = [1, 2, 8, 4, 9], cows = 3

Sample Output: 3*/
public class Aggressive_Cows {
	void main() {
		int[] stalls= {1, 2, 8, 4, 9};
		int cows=3;
		
		int n=stalls.length;
		Arrays.sort(stalls);
		int low=1;
		int high=stalls[n-1]-stalls[0];//this is the max distance
		int maxdistance=low;
		while(low<=high)
		{
			int mid=low+(high-low)/2;
			if(calculatenocows(stalls,mid)>=cows)
			{
				maxdistance=mid;
				low=mid+1;
			}else high=mid-1;
		}
		System.out.println(maxdistance);
	}

	private int calculatenocows(int[] stalls, int mid) {
		int cows = 1; // We always place the first cow in the first stall
	    int lastPosition = stalls[0];

	    for (int i = 1; i < stalls.length; i++) {
	        // If the gap between current stall and last placed cow is >= minDistance
	        if (stalls[i] - lastPosition >= mid) {
	            cows++; // Place a cow
	            lastPosition = stalls[i]; // Update position
	        }
	    }
	    
	    
	    return cows;
	}
}
