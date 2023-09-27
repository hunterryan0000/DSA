package Algorithms.BackTracking;

import java.util.ArrayList;
import java.util.List;

public class SubsetSum {

    /**
     * Comment Block: subsetSum function
     * This function is the main backtracking function to find a subset that sums up to the target.
     *
     * @param nums   The array of integers from which to select the subset
     * @param target The target sum we are trying to achieve
     * @param start  The index to start from in the array of integers
     * @param current The current subset being examined
     * @return true if a subset is found that sums up to the target, false otherwise
     */
    public static boolean subsetSum(int[] nums, int target, int start, List<Integer> current) {
        // If the target is zero, we've found a valid subset
        if (target == 0) {
            System.out.println("Subset: " + current);
            return true;
        }

        // Loop through the array starting from 'start'
        for (int i = start; i < nums.length; i++) {
            // Skip numbers that would make the sum exceed the target
            if (nums[i] > target) continue;

            // Add the current number to the current subset
            current.add(nums[i]);

            // Recursively call subsetSum with the new target and subset
            if (subsetSum(nums, target - nums[i], i + 1, new ArrayList<>(current))) {
                return true;  // Subset found
            }

            // Backtrack: Remove the last element added
            current.remove(current.size() - 1);
        }

        // If loop ends, no valid subset found
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {3, 34, 4, 12, 5, 2};
        int target = 9;
        List<Integer> current = new ArrayList<>();
        subsetSum(nums, target, 0, current);
    }
}


