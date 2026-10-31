package com.sliding_window.varibale_size;
import java.util.*;
public class FruitsIntoBasket {
	public static int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int left = 0;
        int maxFruits = 0;

        for (int right = 0; right < fruits.length; right++) {
            int currentFruit = fruits[right];
            basket.put(currentFruit, basket.getOrDefault(currentFruit, 0) + 1);

            // Shrink window if distinct fruit types exceed 2
            while (basket.size() > 2) {
                int leftFruit = fruits[left];
                basket.put(leftFruit, basket.get(leftFruit) - 1);
                if (basket.get(leftFruit) == 0) {
                    basket.remove(leftFruit);
                }
                left++;
            }

            maxFruits = Math.max(maxFruits, right - left + 1);
        }

        return maxFruits;
    }

    public static void main(String[] args) {
        int[] fruits = {1, 2, 3, 2, 2};
        System.out.println(totalFruit(fruits)); // Output: 4
    }
}
