package corp.BinarySearch;

public class FoodStamps {
	// Helper function to count total meals we can buy if we only pick
    // meals with a taste value >= threshold X
    private static long countMealsAtThreshold(long[] v, long[] d, int n, long X) {
        long totalMeals = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] >= X) {
                // Formula: Number of meals for food i with taste >= X
                // v[i] - (t - 1) * d[i] >= X  ==>  t <= (v[i] - X) / d[i] + 1
                long meals = (v[i] - X) / d[i] + 1;
                totalMeals += meals;
            }
        }
        return totalMeals;
    }

    public static long getMaxTastePoints(int n, long m, long[] v, long[] d) {
        // 1. Binary Search for the minimum taste value threshold X
        long low = 1;
        long high = 0;
        for (long val : v) {
            high = Math.max(high, val);
        }

        long threshold = low;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            // If taking meals with taste >= mid gives us at least M meals,
            // we can try a higher (stricter) threshold
            if (countMealsAtThreshold(v, d, n, mid) >= m) {
                threshold = mid;
                low = mid + 1; // Try larger threshold (Go Right)
            } else {
                high = mid - 1; // Threshold too high, relax it (Go Left)
            }
        }

        // 2. Calculate total taste points using the found threshold
        long totalPoints = 0;
        long mealsTaken = 0;

        for (int i = 0; i < n; i++) {
            // Count meals strictly greater than threshold
            if (v[i] > threshold) {
                long k = (v[i] - (threshold + 1)) / d[i] + 1;
                
                // Sum of Arithmetic Progression for k meals:
                // Sum = k * v[i] - d[i] * k * (k - 1) / 2
                long sum = k * v[i] - d[i] * (k * (k - 1) / 2);
                
                totalPoints += sum;
                mealsTaken += k;
            }
        }

        // 3. Fill the remaining needed meals (m - mealsTaken) with taste value equal to threshold
        long remainingMeals = m - mealsTaken;
        if (remainingMeals > 0) {
            totalPoints += remainingMeals * threshold;
        }

        return totalPoints;
    }

    public static void main(String[] args){
    	long[] v= {5,7,9};
    	long[] d= {2,4,6};
    	int n=3;
    	long m=5;
        System.out.println(getMaxTastePoints(n, m, v, d));
    }
}
