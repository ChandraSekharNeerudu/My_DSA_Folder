package corp.BinarySearch;

public class MangoTreeGathering {
	// Helper function to calculate total hours needed for a given capacity 'k'
    /*private static int calculateTotalHours(int[] trees, int k) {
        int totalHours = 0;
        for (int mangoes : trees) {
            // Equivalent to Math.ceil((double) mangoes / k) without double precision issues
            totalHours += (mangoes + k - 1) / k; 
        }
        return totalHours;
    }*/
    public static int calculateTotalHours(int[] trees, int mid) {
        int totalhours = 0;
        for (int i : trees) {
            int remainder = i % mid;
            if (remainder > 0) {
                totalhours += ((i / mid) + 1);
            } else {
                totalhours += i / mid;
            }
        }
        return totalhours; // 🧠 Don't forget to return the total hours!
    }
    public static int minGatheringSpeed(int[] trees, int h) {
        int low = 1;
        int high = 0;
        
        // Find the maximum mangoes on a single tree to set our upper bound
        for (int mangoes : trees) {
            high = Math.max(high, mangoes);
        }
        
        int result = high; // Default answer to the maximum capacity
        
        // Binary search for the optimal minimum capacity
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            // If we can finish within H hours at speed 'mid'
            if (calculateTotalHours(trees, mid) <= h) {
                result = mid;       // Save this valid capacity
                high = mid - 1;     // Try to find an even smaller valid capacity
            } else {
                low = mid + 1;      // Speed is too slow, increase it
            }
        }
        
        return result;
    }

    //Binary Search on Answer
    public static void main(String[] args) {
        int[] trees = {3, 8, 12, 7}; // Input from your sheet
        int h = 10;                  // Target hours from your sheet
        
        int ans = minGatheringSpeed(trees, h);
        System.out.println("Minimum hourly gathering capacity: " + ans);
        // Output: 4
    }
}
