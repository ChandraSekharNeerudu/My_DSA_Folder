package corp.Strings.Arrays;

import java.util.HashMap;
import java.util.Map;
/*Given an integer array a of size n and two integers D and M, count the 
 * number of unordered pairs (i, j) with 0  i <= j <= n satisfying:
 * 1 Sum Condition: (a[i] + a[j]) (mod D) == 0
 * 2 Difference Condition: |a[i] - a[j]| (mod M) == 0*/
public class PairCount {
	public static long countPairs(int[] a, int D, int M) {
        // Map to store frequency of pairs: (remD, remM)
        Map<String, Integer> freqMap = new HashMap<>();
        long totalPairs = 0;

        for (int x : a) {
            // Calculate positive remainders for D and M
            int remD = (x % D + D) % D;//here we require only x%D but this + D to handle negetive x values and outer % D is for handle x=0 values bcz if x=0 ten bcz of +D remainder becomes D but remainder must be 0 to D-1 
            int remM = (x % M + M) % M;

            // Target remainder for D to make (x + y) % D == 0
            int targetRemD = (D - remD) % D;//in java -Ve remainders are not allowed thats why we D adding D won't change the remainder

            // The target number must have remainder targetRemD for D, and SAME remM for M
            String targetKey = targetRemD + "," + remM;

            // Add count of matching previous numbers to total pairs
            totalPairs += freqMap.getOrDefault(targetKey, 0);

            // Record current number's remainders in the map
            String currentKey = remD + "," + remM;
            freqMap.put(currentKey, freqMap.getOrDefault(currentKey, 0) + 1);
        }

        return totalPairs;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 3, 7, 9};
        int D = 4;
        int M = 2;

        System.out.println("Valid Pairs Count: " + countPairs(a, D, M));
    }
}
